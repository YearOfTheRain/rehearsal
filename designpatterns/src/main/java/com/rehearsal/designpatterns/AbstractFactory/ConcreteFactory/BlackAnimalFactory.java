package com.rehearsal.designpatterns.AbstractFactory.ConcreteFactory;

import com.rehearsal.designpatterns.AbstractFactory.AbstractFactory.IAnimalFactory;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.ICat;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog;
import com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct.BlackCat;
import com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct.BlackDog;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description BlackAnimalFactory
 * @date 2019-08-20 14:33
 */
public class BlackAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
