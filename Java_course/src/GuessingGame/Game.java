package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String args[]) {
    /* De computer kiest een getal tussen de 1 en 99 inclusief.
    De speler mag 3x raden.
    De computer geeft elke keer, na de eerste twee x raden, als het getal nog niet geraden is, een hint: is het getal hoger of lager?
    Als de speler bij de eerste, tweede of derde keer het getal raadt, heeft de speler gewonnen.
     */

        //kies een willekeurig getal

        Random rand = new Random();
        int number = rand.nextInt(98);
        int numberDef = number + 1;

        System.out.println(numberDef);
        // System.out.println(number);

        //speler raadt

        System.out.println("Ik heb een getal van 1 t/m 99 gekozen. Wat denk je dat het is?");
        Scanner scanner = new Scanner(System.in);
        int poging1 = scanner.nextInt();

        //sequence {
        //{goed:
        // als de speler goed geraden heeft: output "Gefeliciteerd, dat klopt."}

        if (poging1 == numberDef) {
            System.out.println("Gefeliciteerd, dat klopt!");

        } else if (poging1 >= 100 || poging1 <= 0) {
            System.out.println("Het moet een geheel getal zijn tussen de 1 en 99, grapjas.");
        } else if (poging1 < numberDef) {
            System.out.println("Sorry, dat klopt niet, het getal is hoger.");
        } else if (poging1 > numberDef) {
            System.out.println("Sorry, dat klopt niet, het getal is lager.");
        } else {
            System.out.println("Huh? (Het moet een geheel getal zijn tussen de 1 en 99).");
                   }

        System.out.println("Probeer het nog eens? Je hebt nog 2 pogingen.");
        int poging2 = scanner.nextInt();

        if (poging2 == numberDef) {
            System.out.println("Gefeliciteerd, dat klopt!");

        } else if (poging2 >= 100 || poging2 <= 0) {
            System.out.println("Het moet een geheel getal zijn tussen de 1 en 99, grapjas.");
        } else if (poging2 < numberDef) {
            System.out.println("Sorry, dat klopt niet, het getal is hoger.");
        } else if (poging2 > numberDef) {
            System.out.println("Sorry, dat klopt niet, het getal is lager.");
        } else {
            System.out.println("Huh? (Het moet een geheel getal zijn tussen de 1 en 99).");

        }

        System.out.println("Probeer het nog eens? Je hebt nog 1 poging.");
        int poging3 = scanner.nextInt();

        if (poging3 == numberDef) {
            System.out.println("Gefeliciteerd, dat klopt!");

        } else {
            System.out.println("Sorry, dat klopt niet, het getal was " + numberDef);
        }

        //{fout:
        //als de speler fout geraden heeft: output "Sorry, dat is het niet."
        //als de speler fout geraden heeft: is het getal hoger of lager dan de poging?
        //output: "Het getal is hoger/lager"}
        //}
        //speler raadt
        //sequence
        //speler raadt
        //als de speler goed geraden heeft: output "Gefeliciteerd, dat klopt."
        //als de speler fout geraden heeft: "Sorry, dat is het niet."
        //output: "Het getal was <getal>"}


    }
}
