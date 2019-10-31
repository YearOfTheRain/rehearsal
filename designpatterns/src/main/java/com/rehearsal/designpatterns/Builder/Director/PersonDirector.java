package com.rehearsal.designpatterns.Builder.Director;

import com.rehearsal.designpatterns.Builder.Builder.PersonBuilder;
import com.rehearsal.designpatterns.Builder.Product.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description PersonDirector
 * @date 2019-08-20 15:46
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
