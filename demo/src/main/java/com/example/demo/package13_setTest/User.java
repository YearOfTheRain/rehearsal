package com.example.demo.package13_setTest;

import lombok.Data;

import java.util.Objects;

/**
 * @author Shulin Li
 * @version v1.0
 * @program rehearsal
 * @description 用户对象
 * @date 2019-11-06 10:39
 */
public class User {

    private String name;
    private Integer age;

    public User() {
    }

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
