package com.rehearsal.designpatterns.FactoryMethod.Creator;

import com.rehearsal.designpatterns.FactoryMethod.Product.IWork;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description IWorkFactory
 * @date 2019-08-20 15:00
 */
public interface IWorkFactory {

    /**
     * @title getWork
     * @description getWork
     * @param
     * @return com.rehearsal.designpatterns.FactoryMethod.Product.IWork
     * @author LiShuLin
     * @date 2019/8/20
     */
    IWork getWork();
}
