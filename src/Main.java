import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hej och välkommen, du har nu tre val att välja mellan.");
        System.out.println("Val 1: Betala ut löner anställda");
        System.out.println("Val 2: Skapa ny faktura");
        System.out.println("Val 3: Betala en eller flera fakturor");
        System.out.println("Välj ett av dessa val mellan 1,2 eller 3");

        Scanner användaren = new Scanner(System.in); // Här säger jag till programmet att vi ska ha scanner

        int input = användaren.nextInt(); // Här döper jag scannern till input

         if (input == 1) {
             System.out.println("Skriv hur många anställda du vill betala löner till?");

             int chefen = användaren.nextInt(); // Här gör jag en ny scanner som jag döper till chefen

             int[] array = new int[chefen]; // Här skapar jag en array som jag kallar för array som ska utgå ifrån användaren

             for (int i = 0; i < chefen; i++) {  // Detta är en loop som ska utgå ifrån vad chefen väljer
                 System.out.println("Hur mycket vill du betala din anställd nr " + (i + 1) + "?");
                 array[i] = användaren.nextInt();
             }

             System.out.println("Löner efter skatt för alla anställda:");

             for (int i = 0; i < chefen; i++) { // Detta är en loop som ska räkna ut vad de asntällda tjänar efter skatt
                 double efterSkatt = array[i] * 0.7;
                 System.out.println("Anställd: " + (i + 1) + " " + efterSkatt + " kr");

             }
         } else if (input == 2) {
             System.out.println("Vad är den totala summan av den nya fakturan?");
             double summan = användaren.nextDouble(); // Ny scanner som kallas för summan
             double bruttoSumman = summan;
             System.out.println("Din brutto summa är " + summan + "kr");
             double moms = (summan /100) * 25;
             System.out.println("Summan för moms är " + moms + "kr");
             double slutet = bruttoSumman - moms;
             System.out.println("Netto summan är " + slutet + "kr");

         } else if (input == 3) {
             System.out.println("Hur många fakturor ska du betala?");

             int antalFakturor = användaren.nextInt();

             int[] Array = new int[antalFakturor]; // Här skapas en array som ska utgå ifrån användaren

             for (int i = 0; i < antalFakturor; i++) {
                 System.out.println("Hur mycket är kostnaden på faktura " + (i + 1) + "?");
                 Array[i] = användaren.nextInt(); // Denna raden sparar vad kostnaden är på varje faktua i en array
             }
             double kontoSaldo = 10000.0; // Detta är hur mycket pengar det finns i kontot
             double totalKostnad = 0.0;

             for (int i = 0; i < antalFakturor; i++) {
                 kontoSaldo -= Array[i];
             }
             double efterAllaFakturor = kontoSaldo - totalKostnad;

             if (efterAllaFakturor >= 0) {
                 System.out.println("Kvar i kontot " + efterAllaFakturor + "kr");
             } else {
                 System.out.println("Du har inte tillräckligt med pengar i kontot, vänligen kolla igenom ditt saldo.");
             }
         } else {
             System.out.println("Försök igen, du kan endast välja 1,2 eller 3.");
         }































































    }
}





















































