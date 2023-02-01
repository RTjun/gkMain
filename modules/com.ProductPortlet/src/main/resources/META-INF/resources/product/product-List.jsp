<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
	List<GKDetail> gkDetail = GKDetailLocalServiceUtil.getGKDetails(-1, -1);

%>
<liferay-portlet:renderURL var="updateGKDetail">
	<liferay-portlet:param name="mvcPath" value="/META-INF/resources/product/updateGKDetail.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="updateClassifyURL">
	<liferay-portlet:param name="mvcPath" value="/META-INF/resources/parameter/classify/UpdateClassify.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL var="editDetailURL">
	<liferay-portlet:param name="mvcPath" value="/META-INF/resources/product/editDetailList.jsp"/>
</liferay-portlet:renderURL>

<div>
<aui:row>
	<aui:col span="1">
		<aui:button	value="新增GK詳情" href="<%=updateGKDetail.toString()%>"/>
	</aui:col>
	<aui:col span="1">
		<aui:button value="新增歸類" href="<%=updateClassifyURL.toString()%>"/>
	</aui:col>
	<aui:col span="1">
		<aui:button value="修改GK詳情" href="<%=editDetailURL.toString()%>"/>
	</aui:col>
</aui:row>
</div>

<aui:row>
	<%
	for(int i=0;i< gkDetail.size();i++){
		long gkDetailId = gkDetail.get(i).getGKDetailId(); //取得每一欄 GKDetailId

		List<GKImage> gkImage =  GKImageLocalServiceUtil.findIMGByGKDetailId(gkDetailId); //依gkDetailId去找對應的圖片

	%>
	<liferay-portlet:renderURL var="GKDetail">
		<liferay-portlet:param name="mvcPath" value="/META-INF/resources/product/GKDetail.jsp"/>
		<liferay-portlet:param name="gkDetailId" value="<%=String.valueOf(gkDetailId)%>"/>
	</liferay-portlet:renderURL>

	<aui:col span="4">
		<div style="margin-bottom:10px">
			<a href="<%=GKDetail.toString()%>">
				<img src="data:image/jpg;base64,<%=gkImage.get(0).getImageData()%>" style="width:400px;height:600px" alt=""/>
			</a>
		</div>
		<div style="text-align: center">
			<span><%= gkDetail.get(i).getGKName()%></span>
		</div>
	</aui:col>
	<%
	}
	%>

</aui:row>