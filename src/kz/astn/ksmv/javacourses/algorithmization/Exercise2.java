package kz.astn.ksmv.javacourses.algorithmization;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise2 {
    public static void exerciseTwo() {
        //arrayGenerator();
        //numComparison(generatedArray);
    }

    public static double[] arrayGenerator() {
        Scanner arrayLengthScanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = arrayLengthScanner.nextInt();
        double[] generatedArray = new double[arrayLength];
        Random randNum = new Random(2);
        double rangeMin = 0;
        double rangeMax = 100;
        for (int i = 0; i < arrayLength; i++) {
            //generatedArray[i] = rangeMin + (rangeMax - rangeMin) * randNum.nextDouble();
            generatedArray[i] = ThreadLocalRandom.current().nextDouble(rangeMin, rangeMax);
            System.out.println(generatedArray[i] + " ");
        }
        return generatedArray;
    }

    public static void numComparison(double[] someArray) {

    }
}
