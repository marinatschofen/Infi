package at.mts.example_if;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        Double kontostand = 0.0;
        int auswahl =0;
        int i = 0;

        do{
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            System.out.println("Bitte den Wert eingeben:");
            auswahl = scanner.nextInt();
            System.out.println("Hier kommt der Wert:"+ auswahl);

            if(auswahl == 1){
                System.out.print("Geben Sie den Betrag ein, den Sie einzahlen möchten?");
                double d = scanner.nextDouble();
                System.out.println("Folgender Betrag wird einbezahlt: "+d+"");
                kontostand+=d;

            if (auswahl == 2){
                System.out.println("Wechen Betrag möchten sie abheben");
            }

            if(auswahl == 3){;
                System.out.println("Kontostand ist:"+kontostand);
            }

            }

        }while (auswahl !=4);



    }

}
