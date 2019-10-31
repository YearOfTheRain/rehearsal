package com.rehearsal.designpatterns.Bridge.RefinedAbstraction;

import com.rehearsal.designpatterns.Bridge.Abstraction.Person;
import com.rehearsal.designpatterns.Bridge.Implementor.Clothing;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Lady
 * @date 2019-08-20 17:04
 */
public class Lady extends Person {

    public Lady() {
        setType("女人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
