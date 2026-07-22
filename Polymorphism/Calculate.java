package plymorphism;

class Calculate {

    void calculate(int num) {
        System.out.println("Square = " + (num * num));
    }

    void calculate(double num) {
        System.out.println("Cube = " + (num * num * num));
    }

    public static void main(String[] args) {

        Calculate obj = new Calculate();

        obj.calculate(5);
        obj.calculate(5.0);
    }
}