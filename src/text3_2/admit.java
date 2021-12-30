package text3_2;

/**
 * 录取类
 *
 * @author cuihaoran
 * @date 2020/6/1-8:42
 */
public class admit {
    public static void main(String[] args) {
        School school = new School(400);
        Student student1 = new Student("蔡徐坤", 250, 500, 100);
        if (student1.total >= school.line || student1.sports >= 96) {
            System.out.println(student1.name + "被录取");
        }
        Student student2 = new Student("王境泽", 500, 250, 100);
        if (student2.total >= school.line || student2.sports >= 96) {
            System.out.println(student2.name + "被录取");
        }
        Student student3 = new Student("崔浩然", 1, 750, 100);
        if (student3.total >= school.line || student3.sports >= 96) {
            System.out.println(student3.name + "被录取");


        }
    }
}