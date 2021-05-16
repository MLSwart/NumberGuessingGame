package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "That translates to about a 9 in the Netherlands.";
                break;
            case "B":
                message = "That translates to about an 8 in the Netherlands.";
                break;
            case "C":
                message = "That translates to about a 7 in the Netherlands.";
                break;
            case "D":
                message = "That translates to about a 6 in the Netherlands.";
                break;
            case "F":
                message = "That translates to an 'onvoldoende' in the Netherlands.";
                break;
            default:
                message = "Error, invalid grade";
                break;
        }

        System.out.println(message);
    }
}
