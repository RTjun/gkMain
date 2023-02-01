<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
  ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
  Classify classify = (Classify) row.getObject();
  String tab1 = "歸類";
%>

<liferay-ui:icon-menu message="動作" direction="right">
  <liferay-portlet:renderURL var="editURL">
    <liferay-portlet:param name="mvcPath" value="/META-INF/resources/parameter/parameter-List.jsp"/>
    <liferay-portlet:param name="classifyId" value="<%=String.valueOf(classify.getClassifyId())%>"/>
    <liferay-portlet:param name="tabs1" value="<%=tab1%>"/>
  </liferay-portlet:renderURL>

  <liferay-ui:icon image="edit" url="<%=editURL.toString()%>" />

  <liferay-portlet:actionURL name="deleteClassify" var="deleteClassifyURL">
    <liferay-portlet:param name="classifyId" value="<%=String.valueOf(classify.getClassifyId())%>"/>
    <liferay-portlet:param name="tabs1" value="<%=tab1%>"/>
  </liferay-portlet:actionURL>

  <liferay-ui:icon image="delete" url="<%=deleteClassifyURL.toString()%>"/>
</liferay-ui:icon-menu>