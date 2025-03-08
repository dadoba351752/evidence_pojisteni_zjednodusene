package zjednodusena_evidence;

import java.util.Scanner;

//Třída sloužící k zadávání hodnot do konzole uživatelem
public class UzivatelskeRozhrani {
    String jmeno;
    String prijmeni;
    String telefonniCislo;
    int vek;
    private static final String regexTelefonniCislo = "^(\\+420)?\\s?\\d{3}\\s?\\d{3}\\s?\\d{3}$";
    private Scanner scanner;
    private Evidence evidence;

    public UzivatelskeRozhrani(Scanner scanner, Evidence evidence) {
        this.scanner = scanner;
        this.evidence = evidence;
    }

    //Funkce pro zadávání jména do konzole
    public String zadejJmeno() {
        System.out.println("Zadejte jméno pojištěného:");
        jmeno = scanner.nextLine().trim();
        while (jmeno.equals("")) {
            System.out.println("Nic jsi nezadal, zadejte jméno znovu:");
             jmeno = scanner.nextLine().trim();
        }
        return jmeno;
    }

    //Funkce pro zadávání příjmení do konzole
    public String zadejPrijmeni() {
        System.out.println("Zadejte příjmení pojištěného:");
        prijmeni = scanner.nextLine().trim();
        while (prijmeni.equals("")) {
            System.out.println("Nic jste nezadal, zadejte příjmení znovu:");
            prijmeni = scanner.nextLine().trim();
        }
        return prijmeni;
    }

    //Funkce pro zadávání telefonního čísla do konzole
    public String zadejTelefonniCislo() {
        do {
            System.out.println("Zadej telefonní číslo pojištěného:");
            telefonniCislo = scanner.nextLine();
            if (!telefonniCislo.matches(regexTelefonniCislo)){
                System.out.println("Zadané telefonní číslo je v neplatném formátu.");
            }
        } while (!telefonniCislo.matches(regexTelefonniCislo));
        return telefonniCislo;
    }

    //Funkce pro zadávání věku do konzole
    public int zadejVek() {
        System.out.println("Zadejte věk pojištěného:");
        boolean zadanPlatnyVek = false;
        while (!zadanPlatnyVek) {
            try { //Trycatch ošetření, aby nemohl být zadán řetezec znaků
                vek = Integer.parseInt(scanner.nextLine());
                zadanPlatnyVek = true;
            } catch (NumberFormatException e) {
                System.out.println("Zadal jste neplatný věk, zadejte ho znovu:");
            }
        }
        return vek;
    }

    //Funkce pro pokračování klávesou enter
    public void stiskniEnter(){
        System.out.println("Stiskněte enter pro pokračování:");
        scanner.nextLine();
    }

    //Metoda pro přidání pojištěnce
    public void pridejPojistence() {
        evidence.pridejPojistence(zadejJmeno(), zadejPrijmeni(), zadejTelefonniCislo(), zadejVek());
        System.out.println("Data byla uložena.");
        stiskniEnter();
    }

    //Metoda pro výpis
    public void vypisPojistence() {
        evidence.vypisPojistence();
        stiskniEnter();
    }

    //Metoda pro vyhledání
    public void vyhledejPojistence() {
        if (evidence.jeSeznamPrazdny()) {
            System.out.println("Seznam pojištěných je prázdný.");
        } else {
            zadejJmeno();
            zadejPrijmeni();
            evidence.vyhledejPojistence(jmeno, prijmeni);
            stiskniEnter();
        }

    }
}
