package com.portlet.portlet;

import ProductDAO.model.Classify;
import ProductDAO.model.Norm;
import ProductDAO.service.ClassifyLocalServiceUtil;
import ProductDAO.service.NormLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.portlet.constants.ParameterPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletRequest;
import java.io.IOException;

/**
 * @author Ian
 */
@Component(
    immediate = true,
    property = {
        "com.liferay.portlet.display-category=category.GK",
        "com.liferay.portlet.header-portlet-css=/css/main.css",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=Parameter",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/parameter/parameter-List.jsp",
        "javax.portlet.name=" + ParameterPortletKeys.Parameter,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user"
    },
    service = Portlet.class
)
public class ParameterPortlet extends MVCPortlet {

    public void updateClassify(ActionRequest request, ActionResponse response){

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        String classifyName = ParamUtil.getString(request,"classifyName");
        long classifyId = ParamUtil.getLong(request,"classifyId");

        if(classifyId !=0){
            Classify classify = ClassifyLocalServiceUtil.fetchClassify(classifyId);
            classify.setClassifyName(classifyName);
            ClassifyLocalServiceUtil.updateClassify(classify);

        }else{
            Classify classify = ClassifyLocalServiceUtil.createClassify(
                    CounterLocalServiceUtil.increment(Classify.class.getName()));

            classify.setClassifyName(classifyName);
            ClassifyLocalServiceUtil.addClassify(classify);
        }
    }

    public void deleteClassify(ActionRequest request,ActionResponse response) throws PortalException, IOException {

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        long classifyId = ParamUtil.getLong(request,"classifyId");
        String tabs1 = ParamUtil.getString(request,"tabs1");

        ClassifyLocalServiceUtil.deleteClassify(classifyId);

        LiferayPortletURL portletURL = PortletURLFactoryUtil.create(
                request,(String) request.getAttribute(WebKeys.PORTLET_ID),
                themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

        portletURL.setParameter("mvcPath","/META-INF/resources/parameter/parameter-List.jsp");
        portletURL.setParameter("tabs1",tabs1);
        response.sendRedirect(portletURL.toString());
    }

    public void updateNorm(ActionRequest request, ActionResponse response) throws IOException {

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        String normName = ParamUtil.getString(request,"normName");
        long normId = ParamUtil.getLong(request,"normId");
        String tabs1 = ParamUtil.getString(request,"tabs1");

        if(normId !=0){
            Norm norm = NormLocalServiceUtil.fetchNorm(normId);
            norm.setNormName(normName);
            NormLocalServiceUtil.updateNorm(norm);

        }else{
            Norm norm = NormLocalServiceUtil.createNorm(
                    CounterLocalServiceUtil.increment(Norm.class.getName()));

            norm.setNormName(normName);
            NormLocalServiceUtil.addNorm(norm);
        }
        LiferayPortletURL portletURL = PortletURLFactoryUtil.create(
                request,(String) request.getAttribute(WebKeys.PORTLET_ID),
                themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

        portletURL.setParameter("mvcPath","/META-INF/resources/parameter/parameter-List.jsp");
        portletURL.setParameter("tabs1",tabs1);
        response.sendRedirect(portletURL.toString());
    }

    public void deleteNorm(ActionRequest request,ActionResponse response) throws PortalException, IOException {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        long normId = ParamUtil.getLong(request,"normId");
        String tabs1 = ParamUtil.getString(request,"tabs1");

        NormLocalServiceUtil.deleteNorm(normId);

        LiferayPortletURL portletURL = PortletURLFactoryUtil.create(
                request,(String) request.getAttribute(WebKeys.PORTLET_ID),
                themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

        portletURL.setParameter("mvcPath","/META-INF/resources/parameter/parameter-List.jsp");
        portletURL.setParameter("tabs1",tabs1);
        response.sendRedirect(portletURL.toString());
    }
}
