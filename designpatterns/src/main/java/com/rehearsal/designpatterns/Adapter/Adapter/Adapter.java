package com.rehearsal.designpatterns.Adapter.Adapter;

import com.rehearsal.designpatterns.Adapter.Adaptee.Adaptee;
import com.rehearsal.designpatterns.Adapter.Target.Target;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Adapter
 * @date 2019-08-20 16:19
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter method!");
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
