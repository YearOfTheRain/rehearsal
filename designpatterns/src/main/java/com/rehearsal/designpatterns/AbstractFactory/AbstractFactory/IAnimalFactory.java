package com.rehearsal.designpatterns.AbstractFactory.AbstractFactory;

import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.ICat;
import com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description AnimalFactory
 * @date 2019-08-20 14:30
 */
public interface IAnimalFactory {

    /**
     * @param
     * @return com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.ICat
     * @title createCat
     * @description createCat
     * @author LiShuLin
     * @date 2019/8/20
     */
    ICat createCat();

    /**
     * @param
     * @return com.rehearsal.designpatterns.AbstractFactory.AbstractProduct.IDog
     * @title createDog
     * @description createDog
     * @author LiShuLin
     * @date 2019/8/20
     */
    IDog createDog();
}
