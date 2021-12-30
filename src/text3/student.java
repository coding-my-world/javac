package text3;

/**
 * 学生类
 *
 * @author cuihaoran
 * @date 2020/5/22-9:08
 */
public class student extends Person {
    private static final int Max = 1001;
    String classnumber, score;
    int k = 0;
    student[] s = new student[Max];

    public student(String number, String name, String classnumber, String score) {
        super(number, name);
        this.classnumber = classnumber;
        this.score = score;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + ",classnumber:" + getClassnumber() + ",score:" + getScore();

    }


    public void shuru(String number, String name, String classnumber, String score) {
        s[k++] = new student(number, name, classnumber, score);
    }
}
