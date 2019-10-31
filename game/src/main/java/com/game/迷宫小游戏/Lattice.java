package com.game.迷宫小游戏;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 格子的属性
 * @date 2019-10-19 10:36
 */
public class Lattice {
    static final int IN_TREE = 1;
    static final int NOT_IN_TREE = 0;
    private int x = -1;
    private int y = -1;
    private int flag = NOT_IN_TREE;
    private Lattice father = null;

    public Lattice(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getFlag() {
        return flag;
    }

    public Lattice getFather() {
        return father;
    }

    public void setFather(Lattice f) {
        father = f;
    }

    public void setFlag(int f) {
        flag = f;
    }

    @Override
    public String toString() {
        return "Lattice{" +
                "x=" + x +
                ", y=" + y +
                ", flag=" + flag +
                ", father=" + father +
                '}';
    }
}
