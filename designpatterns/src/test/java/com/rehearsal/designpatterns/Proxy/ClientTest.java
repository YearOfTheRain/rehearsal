package com.rehearsal.designpatterns.Proxy;

import com.rehearsal.designpatterns.Proxy.Proxy.ProxyObject;
import com.rehearsal.designpatterns.Proxy.Subject.IObject;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description
 * @date 2019-08-21 11:35
 */
public class ClientTest {

    public static void main(String[] args) {
        IObject obj = new ProxyObject();
        obj.action();
    }
}
