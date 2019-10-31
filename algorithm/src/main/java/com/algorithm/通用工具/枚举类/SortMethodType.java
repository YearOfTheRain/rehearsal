package com.algorithm.通用工具.枚举类;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 排序方法类型
 * @date 2019-10-26 17:04
 */
public enum  SortMethodType {
    /*** 基础*/
    BASIS("基础", 1),
    /*** 进阶*/
    ADVANCED("进阶", 2);

    private String name;
    private int value;

    SortMethodType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
