package com.cui.firstdemo.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author cui
 * @since 创建时间：2019/6/19 10:15
 */
@Component
public class MyErrorAttribute extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttribute = super.getErrorAttributes(webRequest, includeStackTrace);
        errorAttribute.put("custommsg", "出错啦");
        errorAttribute.remove("error");
        return errorAttribute;
    }
}
