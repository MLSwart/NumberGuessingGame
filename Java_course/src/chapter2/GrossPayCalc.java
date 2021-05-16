package chapter2;

import java.util.Scanner;

public class GrossPayCalc {
    public static void main(String arg[]){
        //1. get number of hours worked
        System.out.println("Voer het aantal gewerkte uren in alstublieft:");
        Scanner scanner = new Scanner(System.in);
        double uren = scanner.nextDouble();

        //2. get hourly pay rate
        System.out.println("Voer het bruto uurloon in alstublieft:");
        double uurloon = scanner.nextDouble();
        scanner.close();

        //3. multiply hours*pay
        double totaalLoon = uren * uurloon;

        //4. display result
        System.out.println("Het salaris voor deze uren is: " + totaalLoon + " Euro. Weg met het kapitalisme! :) ");


    }

}
