package com.example.demo.package6;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 子类  继承抽象类 father
 * @date 2019-10-15 15:56
 */
public class Son extends AbstractFather {

    public Son() {
    }

    public Son(Integer num) {
        super(num);
    }


    public Integer getNum() {
        return num;
    }
}
