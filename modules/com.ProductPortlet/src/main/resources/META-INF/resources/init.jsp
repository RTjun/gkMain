<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.validation.Valid"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="java.util.List"%>

<%@ page import="ProductDAO.model.GKDetail" %>
<%@ page import="ProductDAO.service.GKDetailLocalServiceUtil" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />