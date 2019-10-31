package com.rehearsal.designpatterns.Builder.Builder;

import com.rehearsal.designpatterns.Builder.Product.Person;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description PersonBuilder
 * @date 2019-08-20 15:39
 */
public interface PersonBuilder {

    /**
     * @title buildHead
     * @description buildHead
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/8/20
     */
    void buildHead();

    /**
     * @title buildBody
     * @description buildBody
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/8/20
     */
    void buildBody();

    /**
     * @title buildFoot
     * @description buildFoot
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/8/20
     */
    void buildFoot();

    /**
     * @title buildPerson
     * @description buildPerson
     * @param
     * @return com.rehearsal.designpatterns.Builder.Product.Person
     * @author LiShuLin
     * @date 2019/8/20
     */
    Person buildPerson();
}
