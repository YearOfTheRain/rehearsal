package com.rehearsal.designpatterns.Proxy.Proxy;

import com.rehearsal.designpatterns.Proxy.RealSubject.ObjectImpl;
import com.rehearsal.designpatterns.Proxy.Subject.IObject;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ProxyObject
 * @date 2019-08-21 11:33
 */
public class ProxyObject implements IObject {

    IObject obj;

    public ProxyObject() {
        System.out.println("这是代理类");
        obj = new ObjectImpl();
    }

    /**
     * @return void
     * @title action
     * @description action
     * @author LiShuLin
     * @date 2019/8/21
     */
    @Override
    public void action() {
        System.out.println("代理开始");
        obj.action();
        System.out.println("代理结束");
    }
}
