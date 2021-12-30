package text666666;

/**
 * Person类
 *
 * @author cuihaoran
 * @date 2020/6/12-8:26
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("name:" + name + ",age:" + age);
    }
}
