package com.rehearsal.designpatterns.Bridge.Implementor;

import com.rehearsal.designpatterns.Bridge.Abstraction.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Clothing
 * @date 2019-08-20 16:38
 */
public abstract class Clothing {

    /**
     * @title personDressCloth
     * @description personDressCloth
     * @param person
     * @return void
     * @author LiShuLin
     * @date 2019/8/20
     */
    public abstract void personDressCloth(Person person);
}
