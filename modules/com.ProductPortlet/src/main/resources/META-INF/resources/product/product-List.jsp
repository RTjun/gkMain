<%@ page import="ProductDAO.model.GKImage" %>
<%@ page import="ProductDAO.service.GKImageLocalServiceUtil" %>
<%@ page import="ProductDAO.service.GKImageLocalService" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/META-INF/resources/init.jsp" %>

<%
	List<GKDetail> gkDetail = GKDetailLocalServiceUtil.getGKDetails(-1, -1);

%>
<liferay-portlet:renderURL var="updateGKDetail">
	<liferay-portlet:param name="mvcPath" value="/META-INF/resources/product/updateGKDetail.jsp"/>
</liferay-portlet:renderURL>

<aui:button	value="新增" href="<%=updateGKDetail %>"/>

<aui:row>
	<%
	for(int i=0;i< gkDetail.size();i++){
		long gkDetailId = gkDetail.get(i).getGKDetailId();
		System.out.println("ID"+gkDetailId);
		GKImage gkImages = GKImageLocalServiceUtil.fetchGKImage(102);

		List<GKImage> gkImage =  GKImageLocalServiceUtil.findIMGByGKDetailId(gkDetailId);

	%>
	<aui:col span="4">
		<div style="margin-bottom:10px">
			<img src="data:image/jpg;base64,<%=gkImage.get(0).getImageData()%>" style="width:400px;height:600px">
		</div>
		<div>
			<span><%= gkDetail.get(i).getGKName()%></span>
		</div>
	</aui:col>
	<%
	}
	%>

</aui:row>