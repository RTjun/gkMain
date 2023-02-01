<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    GKDetail editGK = (GKDetail) row.getObject();
%>

<liferay-ui:icon-menu message="動作" direction="right">
  <liferay-portlet:renderURL var="editURL">
      <liferay-portlet:param name="mvcPath" value="/META-INF/resources/product/editDetail.jsp"/>
      <liferay-portlet:param name="gkDetailId" value="<%=String.valueOf(editGK.getGKDetailId())%>"/>
  </liferay-portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%=editURL.toString()%>" />
</liferay-ui:icon-menu>