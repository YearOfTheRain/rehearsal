package com.rehearsal.designpatterns.Composite.Leaf;

import com.rehearsal.designpatterns.Composite.Component.Employer;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ProjectAssistant
 * @date 2019-08-20 17:56
 */
public class ProjectAssistant extends Employer {
    public ProjectAssistant(String name) {
        setName(name);
        employers = null;//项目助理, 表示没有下属了
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
