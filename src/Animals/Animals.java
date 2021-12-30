package Animals;

/**
 * 动物抽象类
 *
 * @author cuihaoran
 * @date 2020/5/15-12:34
 */
public abstract class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public abstract void eat(String thing);
}
