package com.rehearsal.designpatterns.BuilderTest;

import com.rehearsal.designpatterns.Builder.ConcreteBuilder.ManBuilder;
import com.rehearsal.designpatterns.Builder.Director.PersonDirector;
import com.rehearsal.designpatterns.Builder.Product.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 15:48
 */
public class ClientTest {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
