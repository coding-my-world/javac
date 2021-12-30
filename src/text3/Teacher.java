package text3;

/**
 * 老师类
 *
 * @author cuihaoran
 * @date 2020/6/1-14:52
 */
public class Teacher extends Person {
    private static final int Max = 1001;
    int k = 0;
    student[] s = new student[Max];
    private String profession, department;

    public Teacher(String number, String name, String profession, String department) {
        super(number, name);
        this.department = department;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String say() {

        return super.say() + "职业：" + profession + '\n' + "部门:" + department;
    }


    public void shuru(String number, String name, String prefession, String department) {
        s[k++] = new student(number, name, prefession, department);
    }

    public void showAllmessage() {
        for (int i = 0; i < k; i++) {
            System.out.println(s[i].say());
        }
    }
}
