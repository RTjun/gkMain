<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<liferay-ui:search-container emptyResultsMessage="找不到相關資訊" delta="30">
    <liferay-ui:search-container-results>
        <%

        results = GKDetailLocalServiceUtil.getGKDetails(searchContainer.getStart(),searchContainer.getEnd());
        total = GKDetailLocalServiceUtil.getGKDetailsCount();

        pageContext.setAttribute("results",results);
        pageContext.setAttribute("total",total);
        %>
    </liferay-ui:search-container-results>
    <liferay-ui:search-container-row className="ProductDAO.model.GKDetail" modelVar="gkDetail" keyProperty="GKDetailId">
        <liferay-ui:search-container-column-text property="GKnumber"/>
        <liferay-ui:search-container-column-text property="GKName"/>
        <liferay-ui:search-container-column-jsp name="action" path="/META-INF/resources/product/action.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator paginate="true" />
</liferay-ui:search-container>