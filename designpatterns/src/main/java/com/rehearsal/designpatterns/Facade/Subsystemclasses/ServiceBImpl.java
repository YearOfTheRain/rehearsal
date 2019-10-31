package com.rehearsal.designpatterns.Facade.Subsystemclasses;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ServiceBImpl
 * @date 2019-08-21 10:38
 */
public class ServiceBImpl implements IServiceB {

    @Override
    public void methodB() {
        System.out.println("这是服务B");
    }
}
