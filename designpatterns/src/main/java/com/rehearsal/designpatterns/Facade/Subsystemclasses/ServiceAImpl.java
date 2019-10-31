package com.rehearsal.designpatterns.Facade.Subsystemclasses;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ServiceAImpl
 * @date 2019-08-21 10:38
 */
public class ServiceAImpl implements IServiceA {

    @Override
    public void methodA() {
        System.out.println("这是服务A");
    }
}
