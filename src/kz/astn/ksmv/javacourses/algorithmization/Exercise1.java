package kz.astn.ksmv.javacourses.algorithmization;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    public static void exerciseOne() {
        Scanner scanner = new Scanner(System.in);
        Scanner kScanner = new Scanner(System.in);
        System.out.println("Enter an array length: ");
        int arrayLength = scanner.nextInt();
        int[] nums = new int[arrayLength];
		System.out.println("Randomized array: ");
        for (int j = 0; j < arrayLength; j++) {
            Random randomNum = new Random();
            nums[j] = randomNum.nextInt(100);
			System.out.print(nums[j] + " ");
        }
		System.out.println("");
        System.out.println("Enter value of K: ");
        int k = kScanner.nextInt();
        int iterator = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                iterator += 1;
            }
        }
        System.out.println("Amount of multiple numbers: " + iterator);
    }
}
