<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
	List<GKDetail> gkDetail = GKDetailLocalServiceUtil.getGKDetails(-1, -1);

%>
<liferay-portlet:renderURL var="updateGKDetail">
	<liferay-portlet:param name="mvcPath" value="/META-INF/resources/product/updateGKDetail.jsp"/>
</liferay-portlet:renderURL>

<aui:button-row>
	<aui:button	value="新增" href="<%=updateGKDetail %>"/>
</aui:button-row>

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