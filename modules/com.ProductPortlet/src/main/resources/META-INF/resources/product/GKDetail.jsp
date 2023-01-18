<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
long gkDetailId = ParamUtil.getLong(request,"gkDetailId");
String norm = ParamUtil.getString(request,"norm");
GKDetail gkDetail = GKDetailLocalServiceUtil.fetchGKDetail(gkDetailId);
PortletPreferences preferences = renderRequest.getPreferences();
    List<GKImage> gkImage =  GKImageLocalServiceUtil.findIMGByGKDetailId(gkDetailId);
%>

<aui:row>
    <aui:col span="6">

        <div class="slider-container" style="width:400px; height: 700px">

            <div class="slides fade1">
                <div class="slider-numbers">1/4</div>
                <div class="slider-image">
                    <img class="plus" src="data:image/jpg;base64,<%=gkImage.get(0).getImageData()%>" style="width:400px;height:600px" alt="background_1"/>
                </div>
                <div class="slider-caption">Caption 1</div>
            </div> <!-- slider -->

            <div class="slides fade1">
                <div class="slider-numbers">2/4</div>
                <div class="slider-image"><img class="plus" src="https://image.ibb.co/mGxNw5/background_2.jpg" style="width:400px;height:600px" alt="background_1"/></div>
                <div class="slider-caption">Caption 2</div>
            </div> <!-- slider -->

            <div class="slides fade1">
                <div class="slider-numbers">3/4</div>
                <div class="slider-image"><img class="plus" src="https://image.ibb.co/gd5gpQ/background_3.jpg" style="width:400px;height:600px" alt="background_1"/></div>
                <div class="slider-caption">Caption 3</div>
            </div> <!-- slider -->

            <div class="slides fade1">
                <div class="slider-numbers">4/4</div>
                <div class="slider-image"><img class="plus" src="https://image.ibb.co/jOgXw5/background_4.jpg" style="width:400px;height:600px" alt="background_1"/></div>
                <div class="slider-caption">Caption 4</div>
            </div> <!-- slider -->

            <!-- Slider Next and Previous buttons -->
            <a class="prev" onclick="plusIndex(-1)">❮</a>
            <a class="next" onclick="plusIndex(+1)">❯</a>

            <!-- Slider Selection Bullets -->
            <div class="slider-bullets" id="slider-bullets">
                <span class="dots" onclick="currentSlide(1)"></span>
                <span class="dots" onclick="currentSlide(2)"></span>
                <span class="dots" onclick="currentSlide(3)"></span>
                <span class="dots" onclick="currentSlide(4)"></span>
            </div> <!-- Slider Bullets -->

        </div>

    </aui:col>
    <aui:col span="6">
        <div>
            <span>商品編號 <%=gkDetail.getGKnumber()%></span>
        </div>
        <div>
            <span><%=gkDetail.getGKName()%></span>
        </div>
        <div>
            <span>TWD$ <%=gkDetail.getPrice()%></span>
        </div>
        <div>
            <span></span>
            <aui:select name="norm" label="規格">
                <aui:option selected="true">請選擇</aui:option>
                <aui:option disabled="true">1/4</aui:option>
                <aui:option>全款(不含國際運費)</aui:option>
                <aui:option>訂金(不含國際運費)</aui:option>
                <aui:option disabled="true">1/6</aui:option>
                <aui:option>全款(不含國際運費)</aui:option>
                <aui:option>訂金(不含國際運費)</aui:option>
            </aui:select>
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
            <span><%=gkDetail.getNorm()%></span>
        </aui:row>
        <aui:row>
            <span><%=gkDetail.getPrice()%></span>
        </aui:row>
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

<script> <!--slider js -->
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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.js"></script>
<script type="text/javascript"> <!-- bigImg js -->

    $(document).ready(function() {
        $(".plus").click(function(){
            var _this = $(this);
            imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);
        });
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
            var scale = 0.8;

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

        $(outerdiv).click(function (){
            $(this).fadeOut("fast");
        });
    }
</script>

<div id="outerdiv" style="position: fixed;top:0;left:0;background: rgba(0,0,0,0.7);z-index: 2;width: 100%;height: 100%;display: none;">
    <div id="innerdiv" style="position: absolute;">
        <img id="bigimg" src="" style="border:5px solid #fff;" />
    </div>
</div>