package com.portlet.portlet;

import ProductDAO.model.GKDetail;
import ProductDAO.model.GKImage;
import ProductDAO.service.GKDetailLocalServiceUtil;
import ProductDAO.service.GKImageLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.portlet.constants.ProductPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.apache.commons.codec.binary.Base64;
import org.osgi.service.component.annotations.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author Ian
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.GK",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Product",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/product/product-List.jsp",
		"javax.portlet.name=" + ProductPortletKeys.PRODUCT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProductPortlet extends MVCPortlet {

	public void updateGKDetail(ActionRequest request, ActionResponse response) throws IOException {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		long GKDetailId = ParamUtil.getLong(request, "GKDetailId");
		String GKnumber = ParamUtil.getString(request, "GKnumber");
		String norm = ParamUtil.getString(request, "norm");
		String GKName = ParamUtil.getString(request, "GKName");
		String preOrder = ParamUtil.getString(request, "preOrder");
		String GKComponent = ParamUtil.getString(request, "GKComponent");
		String freight = ParamUtil.getString(request, "freight");
		int price = ParamUtil.getInteger(request, "price");
		String team = ParamUtil.getString(request, "team");
		String remark = ParamUtil.getString(request, "remark");
		int total = ParamUtil.getInteger(request, "total");

		String[] selectItems = ParamUtil.getStringValues(request,"selectItems");

		String classifyId = String.join(",",selectItems);

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		String imageName = uploadRequest.getFileName("file");

		GKDetail gkDetail = GKDetailLocalServiceUtil.createGKDetail(
				CounterLocalServiceUtil.increment(GKDetail.class.getName()));

		gkDetail.setGKnumber(GKnumber);
		gkDetail.setNorm(norm);
		gkDetail.setGKName(GKName);
		gkDetail.setPreOrder(preOrder);
		gkDetail.setGKComponent(GKComponent);
		gkDetail.setFreight(freight);
		gkDetail.setPrice(price);
		gkDetail.setTeam(team);
		gkDetail.setRemark(remark);
		gkDetail.setTotal(total);
		gkDetail.setClassifyId(classifyId);

		GKDetailLocalServiceUtil.addGKDetail(gkDetail);
		long tempGKDetailId = gkDetail.getGKDetailId();

		if(imageName != null) {
			gkDetail.setImageName(imageName);
			File file = uploadRequest.getFile("file");
			byte[] bytes = loadFile(file);
			byte[] encoded = Base64.encodeBase64(bytes);
			String encodedString = new String(encoded, StandardCharsets.UTF_8);

			GKImage gkImage = GKImageLocalServiceUtil.createGKImage(
					CounterLocalServiceUtil.increment(GKImage.class.getName()));

			gkImage.setGKDetailId(tempGKDetailId);
			gkImage.setImageName(imageName);
			gkImage.setImageData(encodedString);
			gkImage.setMimeType(MimeTypesUtil.getContentType(file));

			GKImageLocalServiceUtil.addGKImage(gkImage);
		}

//		LiferayPortletURL portletURL = PortletURLFactoryUtil.create(
//				request, (String)request.getAttribute(WebKeys.PORTLET_ID),
//				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
//
//		portletURL.setParameter("mvcPath", "/html/product/product-List.jsp");
//
//		response.sendRedirect(portletURL.toString());
	}

	private static byte[] loadFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);

		long length = file.length();
		if (length > Integer.MAX_VALUE) {
			// File is too large
		}
		byte[] bytes = new byte[(int)length];

		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
			offset += numRead;
		}

		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "+file.getName());
		}

		is.close();
		return bytes;
	}

}