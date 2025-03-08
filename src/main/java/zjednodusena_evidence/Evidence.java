package zjednodusena_evidence;

import java.util.ArrayList;

//Třída sloužící k logickým operacím týkající se seznamu pojištěných
public class Evidence {
    String jmeno;
    String prijmeni;
    String telefonniCislo;
    int vek;

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
        if (seznam.isEmpty()) {
            return true;
        }
        return false;
    }

    //Metoda pro vyhledání pojištěnce
    public void vyhledejPojistence(String jmeno, String prijmeni) {
        Pojistenec nalez = null; //Do této proměnné se ukládá případný nález v seznamu

            for (Pojistenec p : seznam) {
                if (jmeno.equals(p.getJmeno()) && prijmeni.equals(p.getPrijmeni())) {
                    nalez = p; //Přiřazení jména a příjmení do proměnné
                }
            }
            if (nalez == null) {
                System.out.println("Pojištěnec nebyl nalezen.");
            } else {
                System.out.println(nalez);
            }
        }
    }
