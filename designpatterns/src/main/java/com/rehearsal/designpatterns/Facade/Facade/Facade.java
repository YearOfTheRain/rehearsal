package com.rehearsal.designpatterns.Facade.Facade;

import com.rehearsal.designpatterns.Facade.Subsystemclasses.*;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Facade
 * @date 2019-08-21 10:41
 */
public class Facade {

    IServiceA sa;

    IServiceB sb;

    IServiceC sc;

    public Facade() {
        sa = new ServiceAImpl();
        sb = new ServiceBImpl();
        sc = new ServiceCImpl();
    }

    public void methodA() {
        sa.methodA();
        sb.methodB();
    }

    public void methodB() {
        sb.methodB();
        sc.methodC();
    }

    public void methodC() {
        sc.methodC();
        sa.methodA();
    }
}
