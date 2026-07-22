package plymorphism;

public class Display {

    void display(int num) {
        System.out.println("Integer = " + num);
    }

    void display(String name) {
        System.out.println("String = " + name);
    }

    public static void main(String[] args) {
        Display obj = new Display();

        obj.display(100);
        obj.display("Java");
    }
}
