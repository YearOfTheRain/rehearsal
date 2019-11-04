package com.algorithm.分治思想求解最大子数组;

import com.algorithm.通用工具.实体类.DivideBean;
import com.algorithm.通用工具.工具类.CommonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 分治求解最大子数组 客户端
 * @date 2019-11-04 10:42
 */
public class ClientDivide {

    public static void main(String[] args) {
       Integer[] integers = new Integer[]{-13, -3, -25, -20, -3, -16, -2, -18, -20, -7, -20, -5, -18, -15, -4, -7};
        System.out.println(findMaximumSubArray(integers, 0, 15));
    }

    private static DivideBean findMaximumSubArray(Integer[] integers, int low, int high) {
        if (low == high) {
            return new DivideBean(low, high, integers[low]);
        }
        int middle = (low + high) >>> 1;
        DivideBean left = findMaximumSubArray(integers, low, middle);
        DivideBean right = findMaximumSubArray(integers, middle + 1, high);
        DivideBean cross = findMaxCrossingSubArray(integers, low, middle, high);
        if(left.getSum() >= cross.getSum() && left.getSum() >= right.getSum()) {
            return left;
        }
        if(right.getSum() >= cross.getSum() && right.getSum() >= left.getSum()) {
            return right;
        }
        return cross;
    }

    private static DivideBean findMaxCrossingSubArray(Integer[] integers, int low, int middle, int high) {
        int leftSum = Integer.MIN_VALUE;
        int maxLeft = 0;
        int sum = 0;
        for (int i = middle; i > low; i--) {
            sum += integers[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int sum2 = 0;
        int rightSum = Integer.MIN_VALUE;
        int maxRight = 0;
        for (int j = middle + 1; j < high; j++) {
            sum2 += integers[j];
            if (sum2 > rightSum) {
                rightSum = sum2;
                maxRight = j;
            }
        }
        return new DivideBean(maxLeft, maxRight, leftSum + rightSum);
    }
}
