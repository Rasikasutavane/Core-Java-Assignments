package practice;

public class Addition {

   
    void add(int a, int b) {
        System.out.println("Addition of 2 integers = " + (a + b));
    }

   
    void add(int a, int b, int c) {
        System.out.println("Addition of 3 integers = " + (a + b + c));
    }

   
    void add(double a, double b) {
        System.out.println("Addition of 2 double values = " + (a + b));
    }

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(12.5, 7.5);
    }
}