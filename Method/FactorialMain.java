public class FactorialMain {
    public static void main(String[] args) {

        Factorial obj = new Factorial();

        obj.fact1(5);                    
        obj.fact2();                     
        System.out.println("3. Parameterized, Return = " + obj.fact3(4));
        System.out.println("4. Non-Parameterized, Return = " + obj.fact4());
    }
}
