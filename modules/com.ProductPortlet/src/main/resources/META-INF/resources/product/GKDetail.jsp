<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
long gkDetailId = ParamUtil.getLong(request,"gkDetailId");
String norm = ParamUtil.getString(request,"norm");
GKDetail gkDetail = GKDetailLocalServiceUtil.fetchGKDetail(gkDetailId);
PortletPreferences preferences = renderRequest.getPreferences();
List<GKImage> gkImage =  GKImageLocalServiceUtil.findIMGByGKDetailId(gkDetailId);//用gkDetailId去取gkImage
%>

<aui:row>
    <aui:col span="6">

        <div class="slider-container" style="width:400px; height: 700px">

            <%
                for(int i=0;i<gkImage.size();i++){
            %>
            <div class="slides fade1">
                <div class="slider-numbers"><%=(i+1)+"/"+gkImage.size()%></div>
                <div class="slider-image">
                    <img class="plus" src="data:image/jpg;base64,<%=gkImage.get(i).getImageData()%>" style="width:400px;height:600px" alt="background_1"/>
                </div>
                <div class="slider-caption"><%="Caption "+(i+1)%></div>
            </div> <!-- slider -->
            <%
                }
            %>
            <!-- Slider Next and Previous buttons -->
            <a class="prev" onclick="plusIndex(-1)">❮</a>
            <a class="next" onclick="plusIndex(+1)">❯</a>

            <!-- Slider Selection Bullets -->
            <div class="slider-bullets" id="slider-bullets">
                <%
                    for(int i=0;i<gkImage.size();i++){
                %>
                <span class="dots" onclick="currentSlide(<%=i%>)"></span>
                <%
                    }
                %>
            </div> <!-- Slider Bullets -->

        </div>

    </aui:col>
    <aui:col span="6">
        <div>
            <span>商品編號： <%=gkDetail.getGKnumber()%></span>
        </div>
        <div>
            <span><%=gkDetail.getGKName()%></span>
        </div>
        <div>
            <span></span>
            <aui:select name="norm" label="規格">
                <aui:option selected="true">請選擇</aui:option>
                <%
                    String gkNorm = gkDetail.getNorm(); //抓到所有gkDetail存的normId
                    String[] gknormArray = StringUtil.split(gkNorm); //把DB存的逗號去掉成String陣列
                    for(int i=0;i<gknormArray.length;i++){ //norm陣列有多長就迴圈幾次
                        Norm normList = NormLocalServiceUtil.fetchNorm(Long.valueOf(gknormArray[i]));//以迴圈去選要抓哪個Id
                %>
                <aui:option value="<%=normList.getNormName()%>"><%=normList.getNormName()%></aui:option>
                <%
                    }
                %>
            </aui:select>
        </div>
        <div id="pricediv">

        </div>
    </aui:col>
</aui:row>

<portlet:renderURL var="tabListURL">
    <portlet:param name="mvcPath" value="/META-INF/resources/product/GKDetail.jsp"/>
    <portlet:param name="gkDetailId" value="<%=String.valueOf(gkDetailId)%>"/>
</portlet:renderURL>

<%
String tabNames ="商品描述,送貨及付款方式,顧客評價";
%>

<liferay-ui:tabs names="<%=tabNames%>" type="tabs nav-tabs-default" refresh="false" cssClass="btn btn-secondary">

    <div>
    <liferay-ui:section>
        <aui:row>
            <span><%=gkDetail.getGKName()%></span>
        </aui:row>
        <aui:row>
            <%
                String classifyId =gkDetail.getClassifyId();
                String[] classifyArray = StringUtil.split(classifyId);
                for(int i =0;i<classifyArray.length;i++){
                    Classify classifyList = ClassifyLocalServiceUtil.fetchClassify(Long.valueOf(classifyArray[i]));
            %>
            <span><%=classifyList.getClassifyName()%></span>
            <%
                }
            %>

        </aui:row>
<%--        <aui:row id="price">--%>

<%--        </aui:row>--%>
        <aui:row>
            <span><%=gkDetail.getTotal()%></span>
        </aui:row>
    </liferay-ui:section>

    <liferay-ui:section>
        <aui:row>
            <aui:col span="6">
                <span>送貨方式</span>
                <div>
                    <span>專用</span>
                </div>
                <div>
                    <span>專用</span>
                </div>
            </aui:col>
            <aui:col span="6">
                <span>補款方式</span>
                <div>
                    <span>銀行轉帳／ATM</span>
                </div>
            </aui:col>
        </aui:row>
    </liferay-ui:section>

    <liferay-ui:section>
        <span>尚未有任何評價</span>
    </liferay-ui:section>
    </div>
</liferay-ui:tabs>

<script > <!--slider js -->
    var slideIndex = 1;

    function showImage(n) { // for Display the first Image

        'use strict';

        var slide = document.getElementsByClassName('slides'),

            dots = document.getElementsByClassName('dots'),

            i;

        if (n > slide.length) { // to prevent larger values than the slide length

            slideIndex = 1;
        }

        if (n < 1) { // to avoide negative values

            slideIndex = slide.length;
        }

        for (i = 0; i < slide.length; i++) { // to make other images dispaly: none

            slide[i].style.display = 'none';
        }
        slide[slideIndex - 1].style.display = 'block';

        for (i = 0; i < dots.length; i++) { // to remove the active class from other dots

            dots[i].className = dots[i].className.replace(' active', '');
        }

        dots[slideIndex - 1].className += ' active';
    }

    showImage(slideIndex);

    function plusIndex(n) { // for Next & Prev Actions

        'use strict';

        showImage(slideIndex += n);
    }

    function currentSlide(n) { // for Slide Bullets Selection

        'use strict';

        showImage(slideIndex = n);
    }

</script>
<aui:script use="aui-base,aui-node,liferay-form">

    A.one('#<portlet:namespace/>norm').on('change',function (){ //選擇規格後顯示金額js
        var norm = A.one('#<portlet:namespace/>norm');
        var select = A.one('#<portlet:namespace/>norm').val();
        var price = A.one('#price');
        if(price){
            price.remove();
        }
        if(select !='' && !norm.contains("請選擇")){
            var str = norm.val().replaceAll(" ",",");
            var strArry = str.split(",",2).at(1);

            var pricediv = A.one('#pricediv');
            pricediv.append('<span id="price" style="font-size:18px;">金額$TWD ：'+strArry+'</span>');
        }
    });
</aui:script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.js"></script>
<script type="text/javascript"> <!-- bigImg js -->


    $(".plus").click(function(){  //圖片放大
        var _this = $(this);
        imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);
    });


    function imgShow(outerdiv,innerdiv,bigimg,_this){
        var src = _this.attr("src");
        $("#bigimg").attr("src",src);

        $("<img/>").attr("src",src).load(function (){
            var windowW = $(window).width();
            var windowH = $(window).height();
            var realWidth = this.width;
            var realHeight = this.height;
            var imgWidth,imgHeight;
            var scale = 1;

            if(realHeight>windowH*scale){
                imgHeight = windowH*scale;
                imgWidth =imgHeight/realHeight*realWidth;
                if (imgWidth>windowH*scale){
                    imgWidth = windowW*scale;
                }
            }else if(realWidth>windowW*scale){
                imgWidth = windowW*scale;
                imgHeight = imgWidth/realWidth*realHeight;
            }else{
                imgWidth = realWidth;
                imgHeight = realHeight;
            }
            $("#bigimg").css("width",imgWidth);

            var w = (windowW-imgWidth)/2;
            var h = (windowH-imgHeight)/2;
            $(innerdiv).css({"top":h,"left":w});
            $(outerdiv).fadeIn("fast");
        });

        // $(".closebt").click(function (){
        //     $("#outerdiv").fadeOut("fast");
        // });

        $("#outerdiv").click(function(){
            $(this).fadeOut("fast");
        });

        $(".prev1").click(function (){
            var i = $(".slider-container").children(".slides").children(".slider-image").index();
            console.log("i:"+i);
        })
    }

            //-------------------------------//

</script>

<div id="outerdiv" style="position: fixed;top:0;left:0;background: rgba(0,0,0,0.7);z-index: 2;width: 100%;height: 100%;display: none;">
    <div id="innerdiv" style="position: absolute;">
        <img id="bigimg" src="" style="border:5px solid #fff;" />
<%--        <a class="prev1" style="position: absolute;top:50%;right: 105%;transform: translateY(-50%);color: #FFF;font-weight: bold;font-size: 50px;">❮</a>--%>
<%--        <a class="next1" style="position: absolute;top:50%;left: 105%;transform: translateY(-50%);color: #FFF;font-weight: bold;font-size: 50px;">❯</a>--%>
    </div>
<%--    <div class="closebt" style="color: #FFF;font-weight: bold;font-size: 50px;">--%>
<%--        X--%>
<%--    </div>--%>
</div>
