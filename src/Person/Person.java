package Person;

public class Person {
    String name;
    int age;

    Person() {
        name = "John";
        age = 18;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.say();
        Person p2 = new Person("tom", 29);
        p2.say();
    }

    public void say() {
        System.out.println("name:" + name + ",age:" + age);

    }

    public void learn() {
        System.out.println("I learn java!");
    }
}
