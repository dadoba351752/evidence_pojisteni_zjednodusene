package zjednodusena_evidence;

import java.util.ArrayList;

//Třída sloužící k logickým operacím týkající se seznamu pojištěných
public class Evidence {

    public Evidence() {
    }

    //Vytvoření ArrayListu, do kterého ukládám jednotlivé pojištěnce
    ArrayList<Pojistenec> seznam = new ArrayList<>();

    //Metoda pro přidání nového pojištěnce
    public void pridejPojistence(String jmeno, String prijmeni, String telefonniCislo, int vek) {
        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, telefonniCislo, vek);
        seznam.add(pojistenec);
    }

    //Metoda pro výpis pojištěnců
    public void vypisPojistence() {
        if (seznam.isEmpty()) {
            System.out.println("Seznam pojištěných je prázdný");
        } else {
            for (Pojistenec pojistenec : seznam) {
                System.out.println(pojistenec);
            }
        }
    }

    //Metoda pro zjištění prázdného seznamu
    public boolean jeSeznamPrazdny() {
        return seznam.isEmpty();
    }

    //Metoda pro vyhledání pojištěnce
    public void vyhledejPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> seznamNalezu = new ArrayList<>();
            for (Pojistenec p : seznam) {
                if (jmeno.equals(p.getJmeno()) && prijmeni.equals(p.getPrijmeni())) {
                    seznamNalezu.add(p); //Přiřazení jména a příjmení do proměnné
                }
            }
            if (seznamNalezu.isEmpty()) {
                System.out.println("Pojištěnec nebyl nalezen.");
            } else {
                for (Pojistenec p : seznamNalezu) {
                    System.out.println(p);
                }
            }
        }
    }
