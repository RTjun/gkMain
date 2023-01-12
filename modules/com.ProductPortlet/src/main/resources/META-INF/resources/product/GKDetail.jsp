<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
long gkDetailId = ParamUtil.getLong(request,"gkDetailId");
String norm = ParamUtil.getString(request,"norm");
GKDetail gkDetail = GKDetailLocalServiceUtil.fetchGKDetail(gkDetailId);
PortletPreferences preferences = renderRequest.getPreferences();
%>

<aui:row>
    <aui:col span="6">

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
String[] tabs1NamesArray = StringUtil.split(tabNames);
String tabs1Default =
        preferences.getValue("Sample Tab 1" , tabs1NamesArray[0]);
    String tabs1 = ParamUtil.getString(request, "tabs1" , tabs1Default);
%>

<liferay-ui:tabs names="<%=tabNames%>" url="<%=tabListURL.toString()%>" value="<%=tabs1%>" refresh="false" />

<c:choose>
    <c:when test="<%="商品描述".equals(tabs1)%>">
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
    </c:when>
    <c:when test="<%="送貨及付款方式".equals(tabs1)%>">
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
    </c:when>
    <c:when test="顧客評價">
        <span>尚未有任何評價</span>
    </c:when>
</c:choose>
