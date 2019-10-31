package com.example.demo;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ServletRequestWrapper
 * @date 2019-08-31 17:34
 */
public class ServletRequestWrapper implements ServletRequest {

    private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
    private static final ResourceBundle lStrings =
            ResourceBundle.getBundle(LSTRING_FILE);

    private ServletRequest request;

    public ServletRequest getRequest() {
        return this.request;
    }

    public ServletRequestWrapper(ServletRequest request) {
        if (request == null) {
            throw new IllegalArgumentException(lStrings.getString("wrapper.nullRequest"));
        }
        this.request = request;
    }

    @Override
    public Object getAttribute(String name) {
        return request.getAttribute(name);
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        return request.getAttributeNames();
    }

    @Override
    public String getParameter(String name) {
        return request.getParameter(name);
    }

    @Override
    public void setAttribute(String name, Object o) {
        request.setAttribute(name, o);
    }
}
