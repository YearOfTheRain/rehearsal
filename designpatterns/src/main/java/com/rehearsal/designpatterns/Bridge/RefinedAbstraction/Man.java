package com.rehearsal.designpatterns.Bridge.RefinedAbstraction;

import com.rehearsal.designpatterns.Bridge.Abstraction.Person;
import com.rehearsal.designpatterns.Bridge.Implementor.Clothing;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Man
 * @date 2019-08-20 16:42
 */
public class Man extends Person {

    public Man() {
        setType("男人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
