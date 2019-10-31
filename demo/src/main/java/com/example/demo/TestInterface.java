package com.example.demo;

/**
 * @program: rehearsal
 * @description: TestInterface
 * @author: LiShuLin
 * @create: 2019-08-15 15:32
 **/
public interface TestInterface {

    /**
     * @title 计算传来参数的和
     * @description  计算和运算
     * @param x 加数1
     * @param y 加数2
     * @return int
     * @author LiShuLin
     * @date 2019/8/15
     */
    int add(int x, int y);

    /**
     * @title 计算传来参数的和
     * @description  计算和运算
     * @param x 加数1
     * @param y 加数2
     * @return int
     * @author LiShuLin
     * @date 2019/8/15
     */
    default int jian(int x, int y){
        return x-y;
    }
}
