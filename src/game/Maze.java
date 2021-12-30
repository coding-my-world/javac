package game;

import java.util.Random;

public class Maze {

    final int WIDTH = 16; // 迷宫占地宽，单位为石块个数
    final int HEIGHT = 16; // 迷宫占地高，单位为石块个数
    final int ROCK_SIZE = 50; // 方形石块的边长，单位为像素
    final int ENTER_X = 400; // 迷宫入口x
    final int ENTER_Y = 0; // 迷宫入口y
    final int EXIT_X = 500; // 迷宫出口x
    final int EXIT_Y = 800; // 迷宫出口y
    Rock[][] rocks = new Rock[HEIGHT][WIDTH]; // 石块矩阵
    Random r = new Random();

    Maze() {
        // 循环嵌套绘制迷宫围墙，将Rock类建立的对象，放入rocks数组中。
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == 0 || i == HEIGHT - 1) {
                    rocks[i][j] = new Rock(j * ROCK_SIZE, i * ROCK_SIZE, ROCK_SIZE, ROCK_SIZE, true);
                }
                if (j == 0 || j == WIDTH - 1) {
                    rocks[i][j] = new Rock(j * ROCK_SIZE, i * ROCK_SIZE, ROCK_SIZE, ROCK_SIZE, true);
                }
            }
        }
        for (int i = 1; i < HEIGHT - 1; i++) {
            for (int j = 1; j < WIDTH - 1; j++) {
                rocks[r.nextInt(HEIGHT - 3) + 1][r.nextInt(WIDTH - 3) + 1] = new Rock(j * ROCK_SIZE, i * ROCK_SIZE, ROCK_SIZE, ROCK_SIZE, true);
            }
        }
    }

}

// 建立迷宫,顶端和底部围墙
   /*     for (int j = 0; j < WIDTH; j++) {
            rocks[0][j] = new Rock(j*ROCK_SIZE, 0, ROCK_SIZE, ROCK_SIZE, true);
            rocks[HEIGHT-1][j] = new Rock(j*ROCK_SIZE, (HEIGHT-1)*ROCK_SIZE, ROCK_SIZE, ROCK_SIZE, true);
        }
        // 建立迷宫,左侧和右侧围墙
        for (int i = 1; i < HEIGHT-1; i++) {
            rocks[i][0] = new Rock(0, i*ROCK_SIZE, ROCK_SIZE, ROCK_SIZE, true);
            rocks[i][WIDTH-1] = new Rock((WIDTH-1)*ROCK_SIZE, i*ROCK_SIZE, ROCK_SIZE, ROCK_SIZE, true);
        }
    }
}
*/

