package com.rehearsal.designpatterns.AbstractFactory.ConcreteFactory;

import com.rehearsal.designpatterns.AbstractFactory.AbstractFactory.IAnimalFactory;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.ICat;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog;
import com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct.WhiteCat;
import com.rehearsal.designpatterns.AbstractFactory.ConcreteProduct.WhiteDog;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description WhiteAnimalFactory
 * @date 2019-08-20 14:39
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
