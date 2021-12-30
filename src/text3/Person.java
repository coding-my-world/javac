package text3;

/**
 * sah
 *
 * @author cuihaoran
 * @date 2020/5/22-8:49
 */
public class Person {
    private String number;
    private String name;

    public Person(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        return "number:" + getNumber() + "name:" + getName();
    }


}
