package zjednodusena_evidence;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int volba = 0;

        //Vytvoření instancí
        Evidence evidence = new Evidence();
        Scanner scanner = new Scanner(System.in);
        UzivatelskeRozhrani ui = new UzivatelskeRozhrani(scanner, evidence);

        //Hlavní cyklus pro chod programu
        while (volba != 4) {
            String nadpis = "-".repeat(30) + "\nEvidence pojistenych\n\nVyberte si akci:\n1 - Pridat noveho pojisteneho\n2 - Vypsat vsechny pojistene\n3 - Vyhledat pojisteneho\n4 - Konec";
            System.out.println(nadpis);
            volba = Integer.parseInt(scanner.nextLine());

            //Switch pro výběrové menu (1-4)
            switch (volba) {
                //Přidání pojištěnce
                case 1:
                    ui.pridejPojistence();
                    break;
                //Výpis pojištěnců
                case 2:
                    ui.vypisPojistence();
                    break;
                //Vyhledání pojištěnců
                case 3:
                    ui.vyhledejPojistence();
                    break;
                //Ukončení programu
                case 4:
                    System.out.println("Ukončuji program.");
                    break;
                //Zadání neplatné volby
                default:
                    System.out.println("Zadal jsi neplatnou volbu.\nStiskni klávesu Enter pro pokračování:");
                    scanner.nextLine();
            }
        }
    }
}
