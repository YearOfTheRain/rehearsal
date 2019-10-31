package com.rehearsal.designpatterns.Composite.Component;

import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Employer
 * @date 2019-08-20 17:53
 */
public abstract class Employer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List<Employer> employers;

    public void printInfo() {
        System.out.println(name);
    }

    public List<Employer> getEmployers() {
        return this.employers;
    }

}
