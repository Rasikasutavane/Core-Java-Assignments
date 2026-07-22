package plymorphism;

public class Demo {

    void show(int id, String name) {
        System.out.println(id + " " + name);
    }

    void show(String name, int id) {
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.show(101, "Rasika");
        obj.show("Java", 202);
    }
}