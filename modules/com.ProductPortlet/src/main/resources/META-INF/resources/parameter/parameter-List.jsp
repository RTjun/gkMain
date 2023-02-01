<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
    PortletPreferences preferences = renderRequest.getPreferences();
    String currentURL = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse).toString();
    String tabNames = "歸類,規格";
    String[] tabsNamesArray = StringUtil.split(tabNames);
    String tabs1Default =
            preferences.getValue("Sample Tab 1" , tabsNamesArray[0]);
    String tabs1 = ParamUtil.getString(request,"tabs1", tabs1Default);
    long classifyId = ParamUtil.getLong(request,"classifyId");
    long normId = ParamUtil.getLong(request,"normId");
%>

<portlet:renderURL var="tabURL">
    <portlet:param name="mvcPath" value="/META-INF/resources/parameter/parameter-List.jsp"/>
</portlet:renderURL>

<liferay-ui:tabs names="<%=tabNames%>" value="<%=tabs1%>" refresh="true" url="<%=tabURL.toString()%>"/>

    <c:choose>
        <c:when test='<%="歸類".equals(tabs1)%>'>
            <liferay-portlet:actionURL name="updateClassify" var="updateClassifyURL"/>

            <aui:form action="<%=updateClassifyURL%>" method="post">
                <%
                    if(classifyId !=0){
                        Classify classify = ClassifyLocalServiceUtil.fetchClassify(classifyId);
                %>

                <aui:row>
                    <aui:col span="6">
                        <aui:input type="hidden" name="classifyId" value="<%=classify.getClassifyId()%>"/>
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
        </c:when>
        <c:when test='<%="規格".equals(tabs1)%>'>
            <liferay-portlet:actionURL name="updateNorm" var="updateNormURL"/>

            <aui:form action="<%=updateNormURL%>" method="post">

                <aui:row>
                    <aui:col span="6">
                        <aui:input name="tabs1" type="hidden" value="<%=tabs1%>"/>
                <%
                    if(normId != 0){
                        Norm norm = NormLocalServiceUtil.fetchNorm(normId);
                %>
                        <aui:input type="hidden" name="normId" value="<%=norm.getNormId()%>"/>
                        <aui:input name="normName" label="修改規格" value="<%=norm.getNormName()%>"/>
                <%
                    }else {
                %>
                        <aui:input name="normName" label="新增規格"/>
                <%
                    }
                %>
                        <aui:button name="送出" type="submit"/>
                    </aui:col>
                    <aui:col span="4">
                        <div class="alert alert-warning">
                            <aui:icon image="angle-right" label="1/6全款3880(不含國際運費)" />
                            <aui:icon image="angle-right" label="1/6訂金1990(不含國際運費)" />
                            <aui:icon image="angle-right" label="1/4全款6880(不含國際運費)" />
                            <aui:icon image="angle-right" label="1/4訂金3990(不含國際運費)" />
                        </div>
                    </aui:col>
                </aui:row>
            </aui:form>

            <liferay-ui:search-container emptyResultsMessage="無資料" delta="20">
                <liferay-ui:search-container-results>
                    <%
                        results = NormLocalServiceUtil.getNorms(searchContainer.getStart(),searchContainer.getEnd());
                        total = NormLocalServiceUtil.getNormsCount();

                        pageContext.setAttribute("results",results);
                        pageContext.setAttribute("total",total);
                    %>
                </liferay-ui:search-container-results>

                <liferay-ui:search-container-row className="ProductDAO.model.Norm" modelVar="norm" keyProperty="NormId">
                    <liferay-ui:search-container-column-text name="規格" property="normName" />
                    <liferay-ui:search-container-column-jsp name="action" path="/META-INF/resources/parameter/norm/action.jsp"/>
                </liferay-ui:search-container-row>
                <liferay-ui:search-iterator paginate="true"/>
            </liferay-ui:search-container>
        </c:when>
    </c:choose>




