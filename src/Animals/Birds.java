package Animals;

/**
 * 鸟
 *
 * @author cuihaoran
 * @date 2020/5/15-14:53
 */
public class Birds extends Animals implements Flyable {

    public Birds(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Birds birds = new Birds("麻雀");
        birds.eat("虫子");
        birds.fly();
        birds.drive();


    }

    @Override
    public void eat(String thing) {
        System.out.println(super.getName() + "吃" + thing);
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + "can fly");
    }

    @Override
    public void drive() {
        System.out.println(super.getName() + "can drive");
    }
}
