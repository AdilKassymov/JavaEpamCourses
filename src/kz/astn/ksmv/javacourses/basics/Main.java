package kz.astn.ksmv.javacourses.basics;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a part of exercises: ");
        Scanner partScanner = new Scanner(System.in);
        Scanner exerciseScanner = new Scanner(System.in);

        int part = partScanner.nextInt();
        switch (part) {
            case 1:
                System.out.println("Please enter an exercise of part " + part + ":");
                int exercisePart1 = exerciseScanner.nextInt();
                switch (exercisePart1) {
                    case 1 -> {
                        Part1.enterValues(exercisePart1);
                        Part1.calculation();
                    }
                    case 2 -> {
                        Part1.enterValues(exercisePart1);
                        Part1.calculationQ();
                    }
                    case 3 -> {
                        Part1.enterValues(exercisePart1);
                        Part1.calculationT();
                    }
                    case 4 -> {
                        Part1.enterValues(exercisePart1);
                        Part1.replacingParts();
                    }
                    case 5 -> {
                        Part1.enterValues(exercisePart1);
                        Part1.secondsToHHmmSS();
                    }
                    case 6 -> {
                        Part1.enterValues(exercisePart1);
                        Part1.linearProgram(2, -2, 4, 3, 4, -4);
                    }
                }
            case 2:
                System.out.println("Please enter an exercise of part " + part + ":");
                int exercisePart2 = exerciseScanner.nextInt();
                switch (exercisePart2) {
                    case 1:
                        Part2.triangleCheck(60, 90, 60);
                        Part2.triangleCheck(60, 90, 30);
                        break;
                    case 2:
                        Part2.findMax();
                        break;
                    case 3:
                        break;
                }
            default:
                throw new IllegalStateException("Unexpected value: " + part);
        }
    }
}
