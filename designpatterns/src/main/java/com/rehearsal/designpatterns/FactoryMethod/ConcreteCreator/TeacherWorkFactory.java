package com.rehearsal.designpatterns.FactoryMethod.ConcreteCreator;

import com.rehearsal.designpatterns.FactoryMethod.ConcreteProduct.TeacherWork;
import com.rehearsal.designpatterns.FactoryMethod.Creator.IWorkFactory;
import com.rehearsal.designpatterns.FactoryMethod.Product.IWork;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description TeacherWorkFactory
 * @date 2019-08-20 15:02
 */
public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public IWork getWork() {
        return new TeacherWork();
    }
}
