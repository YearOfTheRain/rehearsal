package com.rehearsal.designpatterns.Adapter.Target;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Target
 * @date 2019-08-20 16:17
 */
public interface Target {

    /**
     * @title adapteeMethod
     * @description adapteeMethod
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/8/20
     */
    void adapteeMethod();

    /**
     * @title adapterMethod
     * @description adapterMethod
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/8/20
     */
    void adapterMethod();
}
