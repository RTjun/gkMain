<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<liferay-portlet:actionURL name="updateNorm" var="updateNormURL"/>

<aui:form action="<%=updateNormURL%>" method="post">

    <aui:row>
        <aui:col span="6">
            <aui:input name="normName" label="規格"/>

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