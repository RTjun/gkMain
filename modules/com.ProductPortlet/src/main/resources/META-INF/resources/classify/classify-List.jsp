<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<liferay-portlet:renderURL var="updateClassifyURL">
    <liferay-portlet:param name="mvcPath" value="/META-INF/resources/classify/UpdateClassify.jsp"/>
</liferay-portlet:renderURL>

<aui:button value="新增歸類" href="<%=updateClassifyURL.toString()%>"/>