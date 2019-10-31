package com.rehearsal.designpatterns.Proxy.RealSubject;

import com.rehearsal.designpatterns.Proxy.Subject.IObject;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ObjectImpl
 * @date 2019-08-21 11:32
 */
public class ObjectImpl implements IObject {
    @Override
    public void action() {
        System.out.println("========");
        System.out.println("========");
        System.out.println("这是被代理的类");
        System.out.println("========");
        System.out.println("========");
    }
}
