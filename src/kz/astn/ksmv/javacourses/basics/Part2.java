package kz.astn.ksmv.javacourses.basics;

class Part2 {
    public static void enterValues() {

    }

    public static void triangleCheck(int a, int b, int c) {
        System.out.println("Angles given: " + a + ", " + b + ", " + c);
        int triangle = a + b + c;
        if (triangle == 180) {
            System.out.println("Is a triangle");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Is a right triangle");
            } else {
                System.out.println("Not a right triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }

    public static void findMax() {

    }
}
