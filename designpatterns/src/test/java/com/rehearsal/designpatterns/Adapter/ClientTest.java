package com.rehearsal.designpatterns.Adapter;

import com.rehearsal.designpatterns.Adapter.Adaptee.Adaptee;
import com.rehearsal.designpatterns.Adapter.Adapter.Adapter;
import com.rehearsal.designpatterns.Adapter.Target.Target;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClientTest
 * @date 2019-08-20 16:27
 */
public class ClientTest {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();

        target.adapterMethod();
    }
}
