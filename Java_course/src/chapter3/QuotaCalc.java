package chapter3;
/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalc {
    public static void main(String[] args) {
        //Initialize values we know

        int quota = 10;

        //Get unknown values

        System.out.println("How many sales have you made this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take – Output

        if (sales == quota){
            System.out.println("You worked exactly hard enough. Not one step too many eh?");
        }

        else if (sales > quota){
            System.out.println("You're making everyone else look bad.");
        }

        else {
            int salesShort = quota - sales;
            System.out.println("You were short by " + salesShort + ". You need to work harder.");
        }

    }



}
