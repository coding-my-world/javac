package Computer;
/*
    author:Mr cui      编程实现：创建人类Person，包含name,age成员变量，
    say()成员方法（输出name和age的值），构造方法Person(String name)。
    在main方法中创建对象p，利用构造方法初始化。最后调用say方法输出p对象的name和age信息。
 */

public class Person {
    String name;
    int age;

    Person() {
        name = "cui";
        age = 19;
    }

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person p = new Person();
        p.say();
    }

    public void say() {
        System.out.println("name：" + name + ",age: " + age);
    }
}
