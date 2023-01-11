<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<liferay-portlet:actionURL name="updateGKDetail" var="updateGKDetailURL">
</liferay-portlet:actionURL>


<aui:form action="<%=updateGKDetailURL %>" method="post">
  <aui:row>
    <aui:col span="6" style="margin-left:50px;">
      <aui:row>
        <aui:col span="5">
          <aui:input name="file" type="file"/>
        </aui:col>
      </aui:row>
    </aui:col>
    <aui:col span="4">
      <aui:input name="GKnumber" label="商品編號"/>
      <aui:input name="norm" label="規格"/>
      <aui:input name="GKName" label="商品名稱"/>
      <aui:input name="preOrder" label="預購出貨日期"/>
      <aui:input name="GKComponent" label="配件"/>
      <aui:input name="freight" label="運送"/>
      <aui:input name="price" label="價格"/>
      <aui:input name="team" label="團隊"/>
      <aui:input name="remark" label="備註"/>
      <aui:input name="total" label="體數"/>
    </aui:col>
  </aui:row>

  <aui:row>
    <div style="display:block;margin:0 auto">
      <aui:button type="submit" value="送出" />
      <aui:button type="reset" value="重置"  style="margin-left:10px;"/>
    </div>
  </aui:row>
</aui:form>
