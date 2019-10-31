package com.rehearsal.designpatterns.ChainOfResponsibility.Handler;

import com.sun.deploy.nativesandbox.comm.Request;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description RequestHandle
 * @date 2019-08-26 10:45
 * 废弃了 该例子不完整
 */
@Deprecated
public interface RequestHandle {

    /**
     * @title handleRequest
     * @description handleRequest
     * @param request
     * @return void
     * @author LiShuLin
     * @date 2019/8/26
     */
    void handleRequest(Request request);

}
