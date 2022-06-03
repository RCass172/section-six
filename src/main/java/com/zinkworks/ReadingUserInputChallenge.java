package com.zinkworks;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static int readNums() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter Num " + order);

            boolean isNum = s.hasNextInt();
            if (isNum) {
                int num = s.nextInt();
                counter++;
                sum += num;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            s.nextLine();
        }
        return sum;
    }
}
