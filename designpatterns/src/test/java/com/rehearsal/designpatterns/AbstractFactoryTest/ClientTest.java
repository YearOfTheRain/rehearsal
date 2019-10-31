package com.rehearsal.designpatterns.AbstractFactoryTest;

import com.rehearsal.designpatterns.AbstractFactory.AbstractFactory.IAnimalFactory;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.ICat;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog;
import com.rehearsal.designpatterns.AbstractFactory.ConcreteFactory.BlackAnimalFactory;
import com.rehearsal.designpatterns.AbstractFactory.ConcreteFactory.WhiteAnimalFactory;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 14:43
 */
public class ClientTest {
    public static void main(String[] args) {
        IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();
        IDog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();

        IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        ICat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();
        IDog whiteDog = whiteAnimalFactory.createDog();
        whiteDog.eat();
    }
}
