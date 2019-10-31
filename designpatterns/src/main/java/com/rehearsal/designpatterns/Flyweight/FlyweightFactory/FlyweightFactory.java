package com.rehearsal.designpatterns.Flyweight.FlyweightFactory;

import com.rehearsal.designpatterns.Flyweight.ConcreteFlyweight.FlyweightImpl;
import com.rehearsal.designpatterns.Flyweight.Flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description FlyweightFactory
 * @date 2019-08-21 10:53
 */
public class FlyweightFactory {

    private static Map<String,Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new FlyweightImpl());
    }

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new FlyweightImpl());
        }
        return flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }
}
