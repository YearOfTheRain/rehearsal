package com.example.demo;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description HttpServletRequest
 * @date 2019-08-31 17:32
 */
public interface HttpServletRequest extends ServletRequest{

    public static final String BASIC_AUTH = "BASIC";
    public static final String FORM_AUTH = "FORM";
    public static final String CLIENT_CERT_AUTH = "CLIENT_CERT";
    public static final String DIGEST_AUTH = "DIGEST";

}
