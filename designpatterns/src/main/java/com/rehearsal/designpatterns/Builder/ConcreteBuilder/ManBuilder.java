package com.rehearsal.designpatterns.Builder.ConcreteBuilder;

import com.rehearsal.designpatterns.Builder.Builder.PersonBuilder;
import com.rehearsal.designpatterns.Builder.Product.Man;
import com.rehearsal.designpatterns.Builder.Product.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ManBuilder
 * @date 2019-08-20 15:43
 */
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildHead() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildBody() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public void buildFoot() {
        person.setHead("建造男人的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
