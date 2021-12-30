package text3_2;

/**
 * 学生类
 *
 * @author cuihaoran
 * @date 2020/6/1-9:48
 */
public class Student {
    String name;
    int number;
    int total;
    int sports;

    public Student(String name, int number, int total, int sports) {
        this.name = name;
        this.number = number;
        this.total = total;
        this.sports = sports;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSports() {
        return sports;
    }

    public void setSports(int sports) {
        this.sports = sports;
    }
}
