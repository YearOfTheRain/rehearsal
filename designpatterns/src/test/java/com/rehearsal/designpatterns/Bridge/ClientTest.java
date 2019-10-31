package com.rehearsal.designpatterns.Bridge;

import com.rehearsal.designpatterns.Bridge.Abstraction.Person;
import com.rehearsal.designpatterns.Bridge.ConcreteImplementor.Jacket;
import com.rehearsal.designpatterns.Bridge.ConcreteImplementor.Trouser;
import com.rehearsal.designpatterns.Bridge.Implementor.Clothing;
import com.rehearsal.designpatterns.Bridge.RefinedAbstraction.Lady;
import com.rehearsal.designpatterns.Bridge.RefinedAbstraction.Man;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 17:31
 */
public class ClientTest {

    public static void main(String[] args) {

        Person man = new Man();

        Person lady = new Lady();

        Clothing jacket = new Jacket();

        Clothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(lady);
    }
}
