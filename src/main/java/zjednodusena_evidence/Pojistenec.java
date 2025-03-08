package zjednodusena_evidence;

//Třída sloužící k vytvoření a práce s objektem pojištěnce
public class Pojistenec {

    //Deklarace proměnných
    private String jmeno;
    private String prijmeni;
    private String telefonniCislo;
    private int vek;

    public Pojistenec(String jmeno, String prijmeni, String telefonniCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefonniCislo = telefonniCislo;
        this.vek = vek;
    }

    //Gettery pro jméno a příjmení
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }

    //Metoda toString k metodě pro výpis pojištěnců v evidenci
    @Override
    public String toString() {
        return (jmeno + "  " + prijmeni + "  " + vek + " let" + "   " + telefonniCislo);
    }
}
