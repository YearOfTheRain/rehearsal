package com.algorithm.树状数组;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-10-18 14:44
 */
public class Client {

    private int n, m;
    private int[] a = new int[1005];
    private int[] c = new int[1005];

    private int lowBit(int x) {
        return x & (-x);
    }

    private void update(int i, int k) {
        while (i <= n) {
            c[i] += k;
            i += lowBit(i);
        }
    }

    private int getSum(int i) {
        int res = 0;
        while (i > 0) {
            res += c[i];
            i -= lowBit(i);
        }
        return res;
    }
}
