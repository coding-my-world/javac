package 实验四;

/**
 * 管理人员
 *
 * @author cuihaoran
 * @date 2020/6/6-16:11
 */
public class Manager extends Employee {
    int welfare = 2000;                                  ////创建管理人员类，实现Employee的方法

    @Override
    int sumSalary(int basic_position, int prizeMoney, int call_back_pay) {
        return basic_position + prizeMoney + call_back_pay + welfare;
    }
}
