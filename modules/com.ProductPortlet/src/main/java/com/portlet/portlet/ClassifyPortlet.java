package com.portlet.portlet;

import ProductDAO.model.Classify;
import ProductDAO.service.ClassifyLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.portlet.constants.ClassifyPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

/**
 * @author Ian
 */
@Component(
    immediate = true,
    property = {
        "com.liferay.portlet.display-category=category.GK",
        "com.liferay.portlet.header-portlet-css=/css/main.css",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=Classify",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/classify/classify-List.jsp",
        "javax.portlet.name=" + ClassifyPortletKeys.CLASSIFY,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user"
    },
    service = Portlet.class
)
public class ClassifyPortlet extends MVCPortlet {

    public void updateClassify(ActionRequest request, ActionResponse response){

        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

        String classifyName = ParamUtil.getString(request,"classifyName");

        Classify classify = ClassifyLocalServiceUtil.createClassify(
                CounterLocalServiceUtil.increment(Classify.class.getName()));

        classify.setClassifyName(classifyName);

        ClassifyLocalServiceUtil.addClassify(classify);

    }
}
