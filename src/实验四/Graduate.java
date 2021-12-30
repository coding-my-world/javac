package 实验四;

/**
 * 测试类2测试Doctor类
 *
 * @author cuihaoran
 * @date 2020/6/6-14:39
 */
public class Graduate {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("崔浩然", "男", 19, 5600, 3000);
        doctor.say();
        doctor.daikuan();
    }
}
