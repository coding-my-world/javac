package game;

public class Rock {
    static int count = 1; // 石块计数，静态成员变量
    int id; // 石块编号
    int width, height; // 石块宽和高
    int x, y; // 石块左上角位置坐标x,y  屏幕左上角为原点(0,0)
    boolean isVisible; // 是否显示

    public Rock(int x, int y, int width, int height, boolean isVisible) {
        this.x = x;
        this.y = y; // 初始化石块位置
        this.width = width;
        this.height = height;
        this.isVisible = isVisible;
        id = count++; // 生成石块编号
    }
}
