package com.rehearsal.designpatterns.Prototype;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Prototype
 * @date 2019-08-20 16:06
 */
public class Prototype implements Cloneable {

    private String name;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
