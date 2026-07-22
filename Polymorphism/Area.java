class Area {

    void area(double radius) {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }

    void area(int length, int width) {
        System.out.println("Rectangle Area = " + (length * width));
    }

    public static void main(String[] args) {
        Area obj = new Area();

        obj.area(5.0);
        obj.area(10, 20);
    }
}
