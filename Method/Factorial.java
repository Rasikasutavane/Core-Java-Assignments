class Factorial {

    // 1. Parameterized, No Return Type
    public void fact1(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("1. Parameterized, No Return = " + f);
    }

    // 2. Non-Parameterized, No Return Type
    int a = 5;

    public void fact2() {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        System.out.println("2. Non-Parameterized, No Return = " + f);
    }

    // 3. Parameterized, Return Type
    public int fact3(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // 4. Non-Parameterized, Return Type
    int b = 6;

    public int fact4() {
        int f = 1;
        for (int i = 1; i <= b; i++) {
            f = f * i;
        }
        return f;
    }
}

