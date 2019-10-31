package com.rehearsal.designpatterns.FactoryMethod.ConcreteProduct;

import com.rehearsal.designpatterns.FactoryMethod.Product.IWork;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description StudentWork
 * @date 2019-08-20 14:57
 */
public class StudentWork implements IWork {
    @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
}
