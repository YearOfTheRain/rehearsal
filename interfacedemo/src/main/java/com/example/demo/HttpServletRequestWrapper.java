package com.example.demo;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description HttpServletRequestWrapper
 * @date 2019-08-31 17:39
 */
public class HttpServletRequestWrapper extends ServletRequestWrapper implements HttpServletRequest {

    public HttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }
}
