<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<liferay-portlet:actionURL name="updateClassify" var="updateClassifyURL"/>

<aui:form action="<%=updateClassifyURL%>" method="post">

    <aui:row>
        <aui:col span="6">
            <aui:input name="classifyName" label="歸類名稱"/>
        </aui:col>
    </aui:row>

    <aui:button name="送出" type="submit"/>
</aui:form>
