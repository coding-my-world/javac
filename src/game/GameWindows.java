package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindows extends javax.swing.JFrame implements ActionListener, KeyListener {
    private static final long serialVersionUID = 1L;

    Maze maze = new Maze(); // 建立迷宫
    GameCanvas canvas = new GameCanvas(maze); // 生成画布

    /**
     * 初始化
     */
    public GameWindows() {
        this.setTitle("米诺斯的迷宫");
        addKeyListener(this); // 监听键盘事件
        add(canvas); // 将这个画迷宫对象整合到这个GUI界面程序当中
        setVisible(true); // 窗口可见
        setSize(820, 850); // 窗口大小
    }

    // 主方法，程序入口
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game.GameWindows().setVisible(true);
            }
        });
    }

    //处理键盘按键：当按下键盘时，自动调用
    public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                break;
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_UP:
                break;
        }
    }

}