package com.rehearsal.designpatterns.Bridge.ConcreteImplementor;

import com.rehearsal.designpatterns.Bridge.Abstraction.Person;
import com.rehearsal.designpatterns.Bridge.Implementor.Clothing;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Jacket
 * @date 2019-08-20 17:09
 */
public class Jacket extends Clothing {
    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿马甲");
    }
}
