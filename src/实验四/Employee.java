package 实验四;

/**
 * 员工的抽象类
 *
 * @author cuihaoran
 * @date 2020/6/6-15:50
 */
public abstract class Employee {//创建员工父类
    String name;
    int age;
    String sex;
    int basic_position;
    int prizeMoney;
    int call_back_pay;

    abstract int sumSalary(int basic_position, int prizeMoney, int call_back_pay);//定义抽象方法计算工资
}
