package com.example.demo.package13_setTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Shulin Li
 * @version v1.0
 * @program rehearsal
 * @description 测试 set 判断对象重复
 * @date 2019-11-06 10:40
 */
public class ClientSet {

    public static void main(String[] args) {
        User user1 = new User("admin", 12);
        User user2 = new User("admin", 12);
        System.out.println("user1的 hashcode：" + user1.hashCode());
        System.out.println("user2的 hashcode：" + user2.hashCode());

        Set<User> users = new HashSet<>();
        boolean add1 = users.add(user1);
        boolean add2 = users.add(user2);
        System.out.println("add1：" + add1);
        System.out.println("add2：" + add2);
        System.out.println("eq：" + user1.equals(user2));
        System.out.println("去重后的数量: " + users.size());
    }
}
