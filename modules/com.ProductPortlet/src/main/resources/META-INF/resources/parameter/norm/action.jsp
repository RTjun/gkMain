<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Norm norm = (Norm) row.getObject();
    String tab1 = "規格";
%>

<liferay-ui:icon-menu message="動作" direction="right">
    <liferay-portlet:renderURL var="editURL">
        <liferay-portlet:param name="mvcPath" value="/META-INF/resources/parameter/parameter-List.jsp"/>
        <liferay-portlet:param name="normId" value="<%=String.valueOf(norm.getNormId())%>"/>
        <liferay-portlet:param name="tabs1" value="<%=tab1%>"/>
    </liferay-portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%=editURL.toString()%>"/>

    <liferay-portlet:actionURL name="deleteNorm" var="deleteNormURL">
        <liferay-portlet:param name="normId" value="<%=String.valueOf(norm.getNormId())%>"/>
        <liferay-portlet:param name="tabs1" value="<%=tab1%>"/>
    </liferay-portlet:actionURL>

    <liferay-ui:icon image="delete" url="<%=deleteNormURL.toString()%>"/>
</liferay-ui:icon-menu>