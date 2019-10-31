package com.algorithm.通用工具.抽象类;

import com.algorithm.通用工具.工具类.CommonUtil;
import com.algorithm.通用工具.枚举类.SortMethodType;

import java.util.Arrays;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 抽象的测试方法
 * @date 2019-10-26 16:02
 */
public abstract class AbstractTestMethod {

    /**
     * 方法描述:  测试排序方法
     *
     * @param length 待指定的生成测试数组的长度
     * @param methodType 切换不同的方法
     * @author LiShuLin
     * @date 2019/10/26
     */
    public void test(int length, SortMethodType methodType) {
        long start = System.currentTimeMillis();
        Integer[] integers = CommonUtil.buildTestArray(length);
        sortMethod(integers, methodType);
        System.out.println("共耗费 " + (System.currentTimeMillis() - start) + " 毫秒");
        CommonUtil.printArray(Arrays.copyOf(integers, integers.length - 100 > 0 ? 100 : integers.length));
    }

    /**
     * 方法描述:  待实现的抽象排序方法
     *
     * @param integers 待排序的数组
     * @param methodType 切换不同的方法
     * @author LiShuLin
     * @date 2019/10/26
     */
    protected abstract void sortMethod(Integer[] integers, SortMethodType methodType);
}
