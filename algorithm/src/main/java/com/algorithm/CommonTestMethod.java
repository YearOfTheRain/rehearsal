package com.algorithm;

import com.algorithm.冒泡排序.ClientBubble;
import com.algorithm.归并排序.ClientMerge;
import com.algorithm.通用工具.抽象类.AbstractTestMethod;
import com.algorithm.通用工具.枚举类.SortMethodType;
import com.algorithm.插入排序.ClientInsert;

import java.math.BigDecimal;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 通用的测试方法 --针对排序算法（继承 AbstractTestMethod 类的）
 * @date 2019-10-26 16:57
 */
public class CommonTestMethod {

    public static void main(String[] args) {
        //插入排序
//        AbstractTestMethod testMethod = new ClientInsert();
//        AbstractTestMethod testMethod = new ClientMerge();
//        AbstractTestMethod testMethod = new ClientBubble();
//        testMethod.test(100000000, SortMethodType.BASIS);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.02);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.01);
        System.out.println(bigDecimal1.add(bigDecimal2));

        BigDecimal bigDecimal3 = new BigDecimal("0.02");
        BigDecimal bigDecimal4 = new BigDecimal("0.01");
        System.out.println(bigDecimal3.add(bigDecimal4));

    }
}
