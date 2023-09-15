import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hej och välkommen, du har nu tre val att välja mellan.");
        System.out.println("Val 1: Betala ut löner anställda");
        System.out.println("Val 2: Skapa ny faktura");
        System.out.println("Val 3: Betala en eller flera fakturor");
        System.out.println("Välj ett av dessa val mellan 1,2 eller 3");

        Scanner användaren = new Scanner(System.in);

        int input = användaren.nextInt();

         if (input == 1) {
             System.out.println("Skriv hur många anställda du vill betala löner till?");

             int chefen = användaren.nextInt();

             int[] anställda = new int[chefen];

             for (int i = 0; i < chefen; i++) {
                 System.out.println("Hur mycket vill du betala din anställd nr? " + (i + 1));
                 anställda[i] = användaren.nextInt();
             }

             System.out.println("Löner efter skatt för alla anställda:");

             for (int i = 0; i < chefen; i++) {
                 double efterSkatt = anställda[i] * 0.7;
                 System.out.println("Anställd " + (i + 1) + ": " + efterSkatt);

             }
         }

         else if (input == 2) {
             System.out.println("Vad är den totala summan av den nya fakturan?");
             double summan = användaren.nextDouble();
             double bruttoSumman = summan;
             System.out.println("Din brutto summa är " + summan + "kr");
             double moms = (summan /100) * 25;
             System.out.println("Summan för moms är " + moms + "kr");
             double total = bruttoSumman - moms;
             System.out.println("Netto summan är " + total + "kr");

         } else if (input == 3) {
            System.out.println("Hur många fakturor ska du betala?");

            int antalFakturor = användaren.nextInt();


              for (int i = 1; i < antalFakturor + 1; i++) {
                  System.out.println("Hur mycket är kostnaden på faktura " + i + "?");
              }












        }
         else {
             System.out.println("Försök igen, du kan endast välja 1,2 eller 3.");
         }
































































    }
}





















































