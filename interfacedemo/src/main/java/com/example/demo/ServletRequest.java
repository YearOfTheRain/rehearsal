package com.example.demo;

import java.util.Enumeration;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ServletRequest
 * @date 2019-08-31 17:29
 */
public interface ServletRequest {

    Object getAttribute(String name);

    Enumeration<String> getAttributeNames();

    String getParameter(String name);

    void setAttribute(String name, Object o);
}
