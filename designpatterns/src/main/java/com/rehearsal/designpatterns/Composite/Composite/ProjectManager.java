package com.rehearsal.designpatterns.Composite.Composite;

import com.rehearsal.designpatterns.Composite.Component.Employer;

import java.util.ArrayList;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ProjectManager
 * @date 2019-08-20 17:57
 */
public class ProjectManager extends Employer {
    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
