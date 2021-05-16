package chapter3;

import java.util.Scanner;

public class CurrencyGame {
    public static void main(String args[]) {

        //Supergaaf spelletje:
        //Vraag de speler om een aantal stuivers, dubbeltjes en kwartjes in te voeren
        //Als het totaal 1 oud-Hollandsche florijn is:
        //print: "Dat is een oud-Hollandsche florijn waard."
        //Als het totaal meer dan 1 oud-Hollandsche florijn is:
        //print: "Dat is X cent meer dan 1 oud-Hollandsche florijn"
        //Als het totaal minder is dan 1 oud-Hollandsche florijn"
        //print: "Dat is X cent minder dan 1 oud-Hollandsche florijn."

        System.out.println("Hoeveel stuivers heb je?");
        Scanner scanner = new Scanner(System.in);
        int stuiver = scanner.nextInt();

        System.out.println("Hoeveel dubbeltjes heb je?");
        int dubbeltje = scanner.nextInt();

        System.out.println("Hoeveel kwartjes heb je?");
        int kwartje = scanner.nextInt();

        scanner.close();

        int cent = stuiver*5 + dubbeltje*10 + kwartje*25;
        int verschil = 100 - cent;

        if (cent == 100){
            System.out.println("Je kleingeld is precies één oud-Hollandsche florijn waard.");}
        else if (cent < 100){
            System.out.println("Je kleingeld is " + verschil + " cent minder waard dan één oud-Hollandsche florijn.");}
        else{
            System.out.println("Je kleingeld is " + -verschil + " cent meer waard dan één oud-Hollandsche florijn.");}


        }




    }

