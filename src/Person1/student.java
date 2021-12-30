package Person1;

public class student extends person1 {
    String no;

    public student(String name, int age, String no) {
        super(name, age);
        this.no = no;
    }

    public static void main(String[] args) {
        student student = new student("rose", 23, "2020");
        student.say();
        student.play("games");
    }

    public void play(String play) {
        System.out.println("play " + play);
    }
}
