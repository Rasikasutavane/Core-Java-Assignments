package plymorphism;
class MainDemo {

    public static void main(String[] args) {

        System.out.println("Original Main");
        main(100);
        main("Java");
    }

   public  static void main(int a) {
        System.out.println("Integer Main = " + a);
    }

    public static void main(String s) {
        System.out.println("String Main = " + s);
    }
}