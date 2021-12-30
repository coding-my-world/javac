package 实验四;

/**
 * @author cuihaoran
 * @date 2020/6/6-14:37
 */
public class Doctor implements StuInterface, TeaInterface {
    private String name;
    private String sex;
    private int age;
    private double fee;
    private double pay;

    public Doctor(String name, String sex, int age, double fee, double pay) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fee = fee;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double getPay() {
        return pay;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    public void say() {
        System.out.println("name:" + name + ",sex:" + sex + ",age:" + age + ",fee:" + fee + ",pay" + pay);
    }

    public void daikuan() {
        if ((pay - fee) <= 3000) {
            System.out.println("provide a loan");
        }
    }
}
