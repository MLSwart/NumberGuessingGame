package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    All salespeople make $1000 per week.
    If a salesperson has made 10+ sales they get $250 extra.
     */
public static void main(String[] args){

    //initialize known values

    int salary = 1000;
    int bonus = 250;
    int quotum = 10;

    //get values for the unknown

    System.out.println("How many sales did the employee make this week?");
    Scanner scanner = new Scanner(System.in);
            int sales = scanner.nextInt();
    scanner.close();


    //quick detour for the bonus earners

    if(sales > quotum){
        salary = salary + bonus;
    }

    //output

    System.out.println("The employee's pay is $" + salary);



}
}
