class Multiply {

    void multiply(int a, int b) {
        System.out.println(" Multiplication = " + (a * b));
    }

    void multiply(int a, int c) {
        System.out.println("Multiplication= " + (a  *c));
    }

    public static void main(String[] args) {
        Multiply obj = new Multiply();

        obj.add(10, 20);
        obj.add(10, 30);
    }
}
