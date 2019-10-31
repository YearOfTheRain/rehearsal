package com.rehearsal.designpatterns.Decorator.Decorator;

import com.rehearsal.designpatterns.Decorator.Component.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Decorator
 * @date 2019-08-21 10:20
 */
public abstract class Decorator implements Person {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
