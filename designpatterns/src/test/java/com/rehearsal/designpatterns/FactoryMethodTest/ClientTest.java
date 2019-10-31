package com.rehearsal.designpatterns.FactoryMethodTest;

import com.rehearsal.designpatterns.FactoryMethod.ConcreteCreator.StudentWorkFactory;
import com.rehearsal.designpatterns.FactoryMethod.ConcreteCreator.TeacherWorkFactory;
import com.rehearsal.designpatterns.FactoryMethod.Creator.IWorkFactory;
import com.rehearsal.designpatterns.FactoryMethod.Product.IWork;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 15:03
 */
public class ClientTest {
    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        IWork ss = studentWorkFactory.getWork();
        ss.doWork();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
