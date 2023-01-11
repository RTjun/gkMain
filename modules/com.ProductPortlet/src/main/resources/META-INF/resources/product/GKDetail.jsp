<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
long gkDetailId = ParamUtil.getLong(request,"gkDetailId");
String norm = ParamUtil.getString(request,"norm");
GKDetail gkDetail = GKDetailLocalServiceUtil.fetchGKDetail(gkDetailId);
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

<liferay-ui:header title=""/>