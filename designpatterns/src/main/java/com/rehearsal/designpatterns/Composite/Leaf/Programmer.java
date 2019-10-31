package com.rehearsal.designpatterns.Composite.Leaf;

import com.rehearsal.designpatterns.Composite.Component.Employer;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Programmer
 * @date 2019-08-20 17:54
 */
public class Programmer extends Employer {
    public Programmer(String name) {
        setName(name);
        employers = null;//程序员, 表示没有下属了
    }
    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
