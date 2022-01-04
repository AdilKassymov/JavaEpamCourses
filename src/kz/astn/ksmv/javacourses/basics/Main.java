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
                    case 1:
                        Part1.enterValues(exercisePart1);
                        Part1.calculation();
                        break;
                    case 2:
                        Part1.enterValues(exercisePart1);
                        Part1.calculationQ();
                        break;
                    case 3:
                        Part1.enterValues(exercisePart1);
                        Part1.calculationT();
                        break;
                    case 4:
                        Part1.enterValues(exercisePart1);
                        Part1.replacingParts();
                        break;
                    case 5:
                        Part1.enterValues(exercisePart1);
                        Part1.secondsToHHmmSS();
                        break;
                    case 6:
                        Part1.enterValues(exercisePart1);
                        Part1.linearProgram(2, -2, 4, 3, 4, -4);
                        break;
                }
            case 2:
                System.out.println("Please enter an exercise of part " + part + ":");
                int exercisePart2 = exerciseScanner.nextInt();
                switch (exercisePart2) {
                    case 1:
                        break;
                }
                break;
        }
    }
}
