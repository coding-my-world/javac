package Person1;

public class person1 {

    String name;
    int age;

    public person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        person1 person1 = new person1("cuihaoran", 18);
        person1.say();
        person1.learn("java");
    }

    /*
    方法：说自己的姓名和年龄

     */
    public void say() {
        System.out.println("name:" + name + ",age:" + age);
    }

    public void learn(String learn) {
        System.out.println(" learn " + learn);
    }
}
