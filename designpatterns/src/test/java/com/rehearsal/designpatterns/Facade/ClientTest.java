package com.rehearsal.designpatterns.Facade;

import com.rehearsal.designpatterns.Facade.Facade.Facade;
import com.rehearsal.designpatterns.Facade.Subsystemclasses.IServiceA;
import com.rehearsal.designpatterns.Facade.Subsystemclasses.IServiceB;
import com.rehearsal.designpatterns.Facade.Subsystemclasses.ServiceAImpl;
import com.rehearsal.designpatterns.Facade.Subsystemclasses.ServiceBImpl;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-21 10:42
 */
public class ClientTest {

    public static void main(String[] args) {
        IServiceA sa = new ServiceAImpl();
        IServiceB sb = new ServiceBImpl();

        sa.methodA();
        sb.methodB();

        System.out.println("========");
        //facade
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
