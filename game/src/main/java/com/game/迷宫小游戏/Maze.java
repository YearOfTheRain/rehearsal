package com.game.迷宫小游戏;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Stack;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 迷宫
 * @date 2019-10-19 10:13
 */
public class Maze extends JPanel implements Cloneable {

    private static final long serialVersionUID = 3004731135004632130L;

    // width 每个格子的宽度和高度
    private int NUM, width, padding;
    private Lattice[][] maze;
    private int ballX, ballY;
    private boolean drawPath = false;

    Maze(int m, int wi, int p) {
        NUM = m;
        width = wi;
        padding = p;
        //初始化格子
        maze = new Lattice[NUM][NUM];
        for (int i = 0; i <= NUM - 1; i++) {
            for (int j = 0; j <= NUM - 1; j++) {
                //确定每个格子的坐标
                maze[i][j] = new Lattice(i, j);
            }
        }
        createMaze();
        setKeyListener();
        this.setFocusable(true);
    }

    private void init() {
        for (int i = 0; i <= NUM - 1; i++) {
            for (int j = 0; j <= NUM - 1; j++) {
                maze[i][j].setFather(null);
                maze[i][j].setFlag(Lattice.NOT_IN_TREE);
            }
        }
        ballX = 0;
        ballY = 0;
        drawPath = false;
        createMaze();
        this.setFocusable(true);
        repaint();
    }

    public int getCenterX(int x) {
        return padding + x * width + width / 2;
    }
    public int getCenterY(int y) {
        return padding + y * width + width / 2;
    }

    public int getCenterX(Lattice p) {
        return padding + p.getY() * width + width / 2;
    }
    public int getCenterY(Lattice p) {
        return padding + p.getX() * width + width / 2;
    }
    private void checkIsWin() {
        if (ballX == NUM - 1 && ballY == NUM - 1) {
            JOptionPane.showMessageDialog(null, "YOU WIN !", "你走出了迷宫。",
                    JOptionPane.PLAIN_MESSAGE);
            init();
        }
    }

    /**
     * 移动方法
     * @param c 监听的键盘 key 的 value 值
     */
    synchronized private void move(int c) {
        int tx = ballX, ty = ballY;
        switch (c) {
            case KeyEvent.VK_LEFT :
                ty--;
                break;
            case KeyEvent.VK_RIGHT :
                ty++;
                break;
            case KeyEvent.VK_UP :
                tx--;
                break;
            case KeyEvent.VK_DOWN :
                tx++;
                break;
            case KeyEvent.VK_SPACE :
                if (drawPath) {
                    drawPath = false;
                } else {
                    drawPath = true;
                }
                break;
            default :
        }
        if (!isOutOfBorder(tx, ty)
                && (maze[tx][ty].getFather() == maze[ballX][ballY]
                || maze[ballX][ballY].getFather() == maze[tx][ty])) {
            ballX = tx;
            ballY = ty;
        }
    }
    private void setKeyListener() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int c = e.getKeyCode();
                move(c);
                repaint();
                checkIsWin();

            }
        });
    }
    private boolean isOutOfBorder(Lattice p) {
        return isOutOfBorder(p.getX(), p.getY());
    }
    private boolean isOutOfBorder(int x, int y) {
        return (x > NUM - 1 || y > NUM - 1 || x < 0 || y < 0);
    }
    private Lattice[] getNeis(Lattice p) {
        // 顺序为上右下左
        final int[] adds = {-1, 0, 1, 0, -1};
        if (isOutOfBorder(p)) {
            return null;
        }
        // 顺序为上右下左
        Lattice[] ps = new Lattice[4];
        int xt;
        int yt;
        for (int i = 0; i <= 3; i++) {
            xt = p.getX() + adds[i];
            yt = p.getY() + adds[i + 1];
            if (isOutOfBorder(xt, yt)) {
                continue;
            }
            ps[i] = maze[xt][yt];
        }
        return ps;
    }

    private void createMaze() {
        Random random = new Random();
        // 求余运算 保证得到的数值在 NUM 范围内
        int rx = Math.abs(random.nextInt()) % NUM;
        int ry = Math.abs(random.nextInt()) % NUM;
        Stack<Lattice> s = new Stack<>();
        Lattice p = maze[rx][ry];
        Lattice[] neis = null;
        s.push(p);
        while (!s.isEmpty()) {
            p = s.pop();
            p.setFlag(Lattice.IN_TREE);
            neis = getNeis(p);
            int ran = Math.abs(random.nextInt()) % 4;
            for (int a = 0; a <= 3; a++) {
                ran++;
                ran %= 4;
                if (neis[ran] == null || neis[ran].getFlag() == Lattice.IN_TREE) {
                    continue;
                }
                s.push(neis[ran]);
                neis[ran].setFather(p);
            }
        }
    }

    private void clearFence(int i, int j, int fx, int fy, Graphics g) {
        int sx = padding + ((j > fy ? j : fy) * width),
                sy = padding + ((i > fx ? i : fx) * width),
                dx = (i == fx ? sx : sx + width),
                dy = (i == fx ? sy + width : sy);
        if (sx != dx) {
            sx++;
            dx--;
        } else {
            sy++;
            dy--;
        }
        g.drawLine(sx, sy, dx, dy);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i <= NUM; i++) {
            g.drawLine(padding + i * width, padding, padding + i * width,
                    padding + NUM * width);
        }
        for (int j = 0; j <= NUM; j++) {
            g.drawLine(padding, padding + j * width, padding + NUM * width,
                    padding + j * width);
        }
        g.setColor(this.getBackground());
        for (int i = NUM - 1; i >= 0; i--) {
            for (int j = NUM - 1; j >= 0; j--) {
                Lattice f = maze[i][j].getFather();
                if (f != null) {
                    int fx = f.getX(), fy = f.getY();
                    clearFence(i, j, fx, fy, g);
                }
            }
        }
        g.drawLine(padding, padding + 1, padding, padding + width - 1);
        int last = padding + NUM * width;
        g.drawLine(last, last - 1, last, last - width + 1);
        g.setColor(Color.RED);
        g.fillOval(getCenterX(ballY) - width / 3, getCenterY(ballX) - width / 3,
                width / 2, width / 2);
        if (drawPath == true) {
            drawPath(g);
        }
    }
    private void drawPath(Graphics g) {
        Color PATH_COLOR = Color.ORANGE, BOTH_PATH_COLOR = Color.PINK;
        if (drawPath == true) {
            g.setColor(PATH_COLOR);
        } else {
            g.setColor(this.getBackground());
        }
        Lattice p = maze[NUM - 1][NUM - 1];
        while (p.getFather() != null) {
            p.setFlag(2);
            p = p.getFather();
        }
        g.fillOval(getCenterX(p) - width / 3, getCenterY(p) - width / 3,
                width / 2, width / 2);
        p = maze[0][0];
        while (p.getFather() != null) {
            if (p.getFlag() == 2) {
                p.setFlag(3);
                g.setColor(BOTH_PATH_COLOR);
            }
            g.drawLine(getCenterX(p), getCenterY(p), getCenterX(p.getFather()),
                    getCenterY(p.getFather()));
            p = p.getFather();
        }
        g.setColor(PATH_COLOR);
        p = maze[NUM - 1][NUM - 1];
        while (p.getFather() != null) {
            if (p.getFlag() == 3) {
                break;
            }
            g.drawLine(getCenterX(p), getCenterY(p), getCenterX(p.getFather()),
                    getCenterY(p.getFather()));
            p = p.getFather();
        }
    }

    public static void main(String[] args) {
        final int n = 30, width = 600, padding = 20, LX = 200, LY = 100;
        JPanel p = new Maze(n, (width - padding - padding) / n, padding);
        JFrame frame = new JFrame("MAZE(java迷宫小游戏，快来挑战吧)");
        frame.getContentPane().add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width + padding, width + padding + padding);
        frame.setLocation(LX, LY);
        frame.setVisible(true);
    }

}

