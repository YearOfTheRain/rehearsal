package com.algorithm.并查集;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-10-18 10:45
 */
public class Client {

    /*** 声明一个 String 类型的数组*/
    private static int[] pre = new int[10];

    public static void main(String[] args) {
        initPre();
        System.out.println("join before :" + find(9));
        join(8,9);
        System.out.println("join after :" + find(8));
        System.out.println("join after 2:" + find(8));
    }

    /**
     * 方法描述: 初始化 pre 数组
     *
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/10/18
     */
    private static void  initPre() {
        pre[0] = 0;
        pre[1] = 0;
        pre[2] = 2;
        pre[3] = 1;
        pre[4] = 0;
        pre[5] = 2;
        pre[6] = 3;
        pre[7] = 7;
        pre[8] = 7;
        pre[9] = 5;
    }

    /**
     * 方法描述: 查找根节点方法
     *  第一次遍历该 待查询的节点 的直系节点，找到父节点，然后进行路径压缩
     *  将 待查询的节点 的所有上级节点都直接绑定在根节点下，优化查询根节点速度
     *
     * @param root 待查询的节点
     * @return int 返回根节点
     * @author LiShuLin
     * @date 2019/10/18
     */
    private static int find(int root) {
        int son, temp;
        son = root;

        //我的上级不是根节点，则继续向上找，直到找到根
        while (root != pre[root]) {
            root = pre[root];
        }
        //路径压缩 将多层级树转成 二层级树
        while (son != root) {
            //将当前节点上级存储起来
            temp = pre[son];
            //将当前节点的上级指定为根节点
            pre[son] = root;
            //继续进行下一次循环，把当前节点的上级节点也执行同样的操作，直到父节点是根节点
            son = temp;
        }
        return root;
    }

    private static void join(int root1, int root2) {
        int x, y;
        x = find(root1);
        y = find(root2);
        if (x != y) {
            pre[x] = y;
        }
    }
}
