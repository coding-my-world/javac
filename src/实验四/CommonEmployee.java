package 实验四;

/**
 * 普通员工
 *
 * @author cuihaoran
 * @date 2020/6/6-16:08
 */
public class CommonEmployee extends Employee {             //创建员工类，实现Employee的方法

    @Override
    int sumSalary(int basic_position, int prizeMoney, int call_back_pay) {
        return basic_position + prizeMoney + call_back_pay;
    }
}
