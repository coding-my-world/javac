package game;

import java.awt.*;

/**
 * author：廉佐政
 * Date：2016/6/13.
 */
public class GameCanvas extends Canvas {
    private static final long serialVersionUID = 1L;
    private Maze maze; // 建立迷宫

    /**
     * 初始化
     *
     * @param maze    迷宫
     * @param heros   英雄
     * @param monster 怪兽
     */
    public GameCanvas(Maze maze) {
        this.maze = maze;
    }

    /**
     * 绘制迷宫
     *
     * @param g 绘图对象
     */
    private void paintMaze(Graphics g) {
        // 画黑色背景
        g.setColor(Color.black);
        // 画绿色迷宫墙
        for (int i = 0; i < maze.HEIGHT; i++) {
            for (int j = 0; j < maze.WIDTH; j++) {
                if (maze.rocks[i][j] != null && maze.rocks[i][j].isVisible) {
                    g.setColor(Color.green);
                    g.fill3DRect(maze.rocks[i][j].x, maze.rocks[i][j].y, maze.ROCK_SIZE, maze.ROCK_SIZE, true);
                    //g.setColor(Color.red);
                    //g.drawString(String.valueOf(maze.rocks[i][j].id),maze.rocks[i][j].x+20, maze.rocks[i][j].y+20);
                }
            }
        }
    }

    /**
     * 重写Canvas类的paint方法
     *
     * @param g 绘图对象
     */
    public void paint(Graphics g) {
        paintMaze(g);
    }

    /**
     * 重写Canvas类的update方法，解决画面闪烁问题
     *
     * @param g 绘图对象
     */
    public void update(Graphics g) {
        paintMaze(g);
    }


}
