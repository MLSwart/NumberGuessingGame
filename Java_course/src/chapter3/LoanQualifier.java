package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary =scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Decision
        if (salary >= requiredSalary) {
            if (years >= requiredYears) {
                System.out.println("Nou vooruit dan maar.");
            } else {
                System.out.println("Je werkt nog niet lang genoeg. Je moet minstens " + requiredYears + " jaar hebben gewerkt.");
            }
        }
        else {
            System.out.println("Je verdient niet genoeg. Je moet minstens " + requiredSalary + " verdienen.");

        }
    }
}
