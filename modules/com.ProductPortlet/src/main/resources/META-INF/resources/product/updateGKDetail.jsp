<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
List<Classify> classifies = ClassifyLocalServiceUtil.getClassifies(-1,-1);
List<Norm> norms = NormLocalServiceUtil.getNorms(-1,-1);

//classifies
List<KeyValuePair> leftList = new ArrayList<KeyValuePair>();
List<KeyValuePair> rightList = new ArrayList<KeyValuePair>();
for(int i=0; i<classifies.size();i++){
  leftList.add(new KeyValuePair(String.valueOf(classifies.get(i).getClassifyId()),classifies.get(i).getClassifyName()));
}

//norms
List<KeyValuePair> nleftList = new ArrayList<>();
List<KeyValuePair> nrightList = new ArrayList<>();
for(int i=0; i< norms.size();i++){
  nleftList.add(new KeyValuePair(String.valueOf(norms.get(i).getNormId()),norms.get(i).getNormName()));
}
%>

<liferay-portlet:actionURL name="updateGKDetail" var="updateGKDetailURL">
</liferay-portlet:actionURL>

<aui:form action="<%=updateGKDetailURL %>" method="post" name="fm">

  <aui:row>
    <aui:col span="6" style="margin-left:50px;">
      <aui:row>
        <aui:col span="5">
          <aui:input name="file" type="file" required="true" multiple="true"/>
        </aui:col>
      </aui:row>
    </aui:col>

    <aui:col span="4">
      <aui:input name="GKnumber" label="商品編號" required="true"/>
      <aui:input name="GKName" label="商品名稱" required="true"/>
      <aui:input name="preOrder" label="預購出貨日期" required="true"/>
      <aui:input name="GKComponent" label="配件" required="true"/>
      <aui:input name="freight" label="運送" required="true"/>
      <aui:input name="price" label="價格" required="true"/>
      <aui:input name="team" label="團隊" required="true"/>
      <aui:input name="remark" label="備註" required="true"/>
      <aui:input name="total" label="體數" required="true"/>
    </aui:col>
  </aui:row>

  <aui:input name="selectItems" type="hidden"/>
  <aui:input name="availableItems" type="hidden"/>

  <div>
  <liferay-ui:input-move-boxes
          leftBoxName="availableValues" leftList="<%=leftList%>"
          leftTitle="可用標籤" rightBoxName="selectedValues"
          rightList="<%=rightList%>" rightTitle="當前標籤" />
  </div>
  
  <aui:input name="selectNorms" type="hidden"/>
  <aui:input name="availableNorms" type="hidden"/>

  <div>
    <liferay-ui:input-move-boxes
            leftBoxName="nAvailableValues" leftList="<%=nleftList%>"
            leftTitle="可用規格" rightBoxName="nSelectedValues"
            rightList="<%=nrightList%>" rightTitle="當前規格"/>
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
    var selectNorms = A.one('#<portlet:namespace/>selectNorms');
    var nSelectedValues = Liferay.Util.listSelect('#<portlet:namespace/>nSelectedValues');

    selectNorms.val(nSelectedValues);
    selectItems.val(selectedValues);

    submitForm('#<portlet:namespace/>fm');

  });

</aui:script>
