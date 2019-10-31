package com.rehearsal.designpatterns.FactoryMethod.ConcreteCreator;

import com.rehearsal.designpatterns.FactoryMethod.ConcreteProduct.StudentWork;
import com.rehearsal.designpatterns.FactoryMethod.Creator.IWorkFactory;
import com.rehearsal.designpatterns.FactoryMethod.Product.IWork;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description StudentWorkFactory
 * @date 2019-08-20 15:01
 */
public class StudentWorkFactory implements IWorkFactory {
    @Override
    public IWork getWork() {
        return new StudentWork();
    }
}
