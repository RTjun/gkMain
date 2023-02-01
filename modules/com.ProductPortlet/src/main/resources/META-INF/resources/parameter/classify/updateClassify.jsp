<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
    long classifyId = ParamUtil.getLong(request,"classifyId");
%>

<liferay-portlet:renderURL var="current">
    <liferay-portlet:param name="mvcPath" value="/META-INF/resources/parameter/parameter-List.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="updateClassify" var="updateClassifyURL"/>

<aui:form action="<%=updateClassifyURL%>" method="post">
    <%
    if(classifyId !=0){
        Classify classify = ClassifyLocalServiceUtil.fetchClassify(classifyId);
    %>
    <aui:row style="margin-bottom:15px;">
            <aui:icon image="angle-left" url="<%=current.toString()%>" label="上一頁"></aui:icon>
    </aui:row>

    <aui:row>
        <aui:col span="6">
        <aui:input name="classifyName" label="修改歸類名稱" value="<%=classify.getClassifyName()%>"/>
    </aui:col>
    </aui:row>

    <%
    }else {
    %>

    <aui:row>
        <aui:col span="6">
            <aui:input name="classifyName" label="新增歸類名稱"/>
        </aui:col>
    </aui:row>
    <%
        }
    %>
    <aui:button name="送出" type="submit"/>
</aui:form>

<liferay-ui:search-container emptyResultsMessage="無資料" delta="20">

    <liferay-ui:search-container-results>
        <%
        results = ClassifyLocalServiceUtil.getClassifies(searchContainer.getStart(),searchContainer.getEnd());
        total = ClassifyLocalServiceUtil.getClassifiesCount();

        pageContext.setAttribute("results",results);
        pageContext.setAttribute("total",total);
        %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row className="ProductDAO.model.Classify" modelVar="classify" keyProperty="ClassifyId">
        <liferay-ui:search-container-column-text name="歸類名稱" property="classifyName"/>
        <liferay-ui:search-container-column-jsp name="action" path="/META-INF/resources/parameter/classify/action.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator paginate="true"/>
</liferay-ui:search-container>