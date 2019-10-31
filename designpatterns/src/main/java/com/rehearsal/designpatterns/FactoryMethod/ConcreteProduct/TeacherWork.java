package com.rehearsal.designpatterns.FactoryMethod.ConcreteProduct;

import com.rehearsal.designpatterns.FactoryMethod.Product.IWork;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description TeacherWork
 * @date 2019-08-20 14:58
 */
public class TeacherWork implements IWork {
    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }
}
