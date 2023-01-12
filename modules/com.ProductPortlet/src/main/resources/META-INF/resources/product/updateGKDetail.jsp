<%@ page import="ProductDAO.model.Classify" %>
<%@ page import="ProductDAO.service.ClassifyLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.KeyValuePair" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
List<Classify> classifies = ClassifyLocalServiceUtil.getClassifies(-1,-1);

List<KeyValuePair> leftList = new ArrayList<KeyValuePair>();
for(int i=0; i<classifies.size();i++){
  leftList.add(new KeyValuePair(String.valueOf(classifies.get(i).getClassifyId()),classifies.get(i).getClassifyName()));
}
List<KeyValuePair> rightList = new ArrayList<KeyValuePair>();
%>

<liferay-portlet:actionURL name="updateGKDetail" var="updateGKDetailURL">
</liferay-portlet:actionURL>

<aui:form action="<%=updateGKDetailURL %>" method="post" name="fm">

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

  <aui:input name="selectItems" type="hidden"/>
  <aui:input name="availableItems" type="hidden"/>

  <div>
  <liferay-ui:input-move-boxes
          leftBoxName="availableValues" leftList="<%=leftList%>"
          leftTitle="增加標籤" rightBoxName="selectedValues"
          rightList="<%=rightList%>" rightTitle="當前標籤" />
  </div>

  <aui:row>
    <div style="display:block;margin:0 auto">
      <aui:button type="submit" value="送出" />
      <aui:button type="reset" value="重置"  style="margin-left:10px;"/>
    </div>
  </aui:row>
</aui:form>

<aui:script use="aui-base,aui-node,liferay-util-list-fields">

  A.one('#<portlet:namespace/>fm').on('submit',function(event){

    var selectItems = A.one('#<portlet:namespace/>selectItems');
    var selectedValues = Liferay.Util.listSelect('#<portlet:namespace/>selectedValues');

    selectItems.val(selectedValues);

    console.log("selectItems :"+selectItems.val());

    submitForm('#<portlet:namespace/>fm');

  });

</aui:script>
