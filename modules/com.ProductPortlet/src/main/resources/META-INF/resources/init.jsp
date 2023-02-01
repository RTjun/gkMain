<%@ page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@ page import="com.liferay.portal.kernel.util.KeyValuePair" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.validation.Valid"%>
<%@ page import="javax.portlet.PortletPreferences" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList" %>

<%@ page import="ProductDAO.model.Norm" %>
<%@ page import="ProductDAO.service.NormLocalServiceUtil" %>
<%@ page import="ProductDAO.model.Classify" %>
<%@ page import="ProductDAO.service.ClassifyLocalServiceUtil" %>
<%@ page import="ProductDAO.model.GKDetail" %>
<%@ page import="ProductDAO.service.GKDetailLocalServiceUtil" %>
<%@ page import="ProductDAO.model.GKImage" %>
<%@ page import="ProductDAO.service.GKImageLocalServiceUtil" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

