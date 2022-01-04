package kz.astn.ksmv.javacourses.basics;

import java.util.Scanner;

class Part1 {
    static int x, y, q, z, a, b, c;
    static int seconds, minutes, hours;
    static int xAxis, yAxis;
    static double t, nnnDDD;

    public static void enterValues(int exercise) {
        Scanner aScan = new Scanner(System.in);
        Scanner bScan = new Scanner(System.in);
        Scanner cScan = new Scanner(System.in);
        Scanner xScan = new Scanner(System.in);
        Scanner yScan = new Scanner(System.in);
        Scanner nnnDDDScan = new Scanner(System.in);
        Scanner secondsScan = new Scanner(System.in);
        Scanner xAxisScan = new Scanner(System.in);
        Scanner yAxisScan = new Scanner(System.in);

        switch (exercise) {
            case 1, 2:
                System.out.println("Enter value of a: ");
                a = aScan.nextInt();
                System.out.println("Enter value of b: ");
                b = bScan.nextInt();
                System.out.println("Enter value of c: ");
                c = cScan.nextInt();
                break;
            case 3:
                System.out.println("Enter value of x: ");
                x = xScan.nextInt();
                System.out.println("Enter value of y: ");
                y = yScan.nextInt();
                break;
            case 4:
                System.out.println("Enter value of nnn.ddd: ");
                nnnDDD = nnnDDDScan.nextDouble();
                break;
            case 5:
                System.out.println("Enter amount of seconds: ");
                seconds = secondsScan.nextInt();
                break;
            case 6:
                System.out.println("Enter value of X: ");
                xAxis = xAxisScan.nextInt();
                System.out.println("Enter value of Y: ");
                yAxis = yAxisScan.nextInt();
                break;
        }
    }

    public static void calculation() { // 1 задание
        z = ((a - 3) * (b / 2)) + c;
        System.out.println("Value of z: " + z);
    }

    public static void calculationQ() { // 2 задание
        q = (((b + (int) Math.sqrt(b * b + 4 * a * c) / 2 * a) - a * a * a * c + (-(b * b))));
        System.out.println("Value of q: " + q);
    }

    public static void calculationT() { // 3 задание
        t = (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x * y)));
        System.out.println("Value of t: " + t);
    }

    public static void replacingParts() { // 4 задание
        String valueOfnnnDDD = String.valueOf(nnnDDD);
        String[] splittednnnDDDD = valueOfnnnDDD.split("");
        for (int i = splittednnnDDDD.length-1; i >= 0; i--) {
            System.out.print(splittednnnDDDD[i]);
        }
    }

    public static void secondsToHHmmSS() { // 5 задание
        hours = seconds / 3600;
        int leftSeconds = seconds % 3600;
        minutes = leftSeconds / 60;
        seconds = leftSeconds % 60;
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }

    public static void linearProgram(int x1, int x2, int y1, int y2, int x3, int x4) {
        for (int i = -10; i <= 10; i++) {
            for (int j = -10; j <= 10; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " ");
            }
            System.out.println("");
        }
        if (xAxis <= x1 && xAxis >= x2 && yAxis <= y1) {
            System.out.println("точка входит в выделенную область");
        } else if (xAxis <= x3 && xAxis >= x4 && yAxis <= y2) {
            System.out.println("точка входит в выделенную область");
        } else {
            System.out.println("не входит");
        }
    }
}
