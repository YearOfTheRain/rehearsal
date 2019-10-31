package com.rehearsal.designpatterns.Bridge.Abstraction;

import com.rehearsal.designpatterns.Bridge.Implementor.Clothing;
import com.rehearsal.designpatterns.Bridge.Implementor.ClothingFactory;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Person
 * @date 2019-08-20 16:37
 */
public abstract class Person {

    private Clothing clothing;

    private String type;

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing() {
        /*this.clothing = ClothingFactory.getClothing();*/
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public abstract void dress();
}
