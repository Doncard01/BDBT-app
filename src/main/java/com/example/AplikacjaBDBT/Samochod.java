package com.example.AplikacjaBDBT;

public class Samochod {
    private int nr_samochodu;
    private String vin;
    private String rok_produkcji;
    private String rodzaj_paliwa;
    private int przebieg;
    private int liczba_miejsc;
    private String klimatyzaja; //T lub N, tak lub nie
    private float pojemnosc_silnika;
    private String nr_rejestracyjny;
    private String typ_nadwozia;
    private int nr_salonu;
    private int nr_klienta;
    private int nr_modelu;

    public Samochod(int nr_samochodu, String vin, String rok_produkcji, String rodzaj_paliwa, int przebieg, int liczba_miejsc, String klimatyzaja, float pojemnosc_silnika, String nr_rejestracyjny, String typ_nadwozia, int nr_salonu, int nr_klienta, int nr_modelu) {
        this.nr_samochodu = nr_samochodu;
        this.vin = vin;
        this.rok_produkcji = rok_produkcji;
        this.rodzaj_paliwa = rodzaj_paliwa;
        this.przebieg = przebieg;
        this.liczba_miejsc = liczba_miejsc;
        this.klimatyzaja = klimatyzaja;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.nr_rejestracyjny = nr_rejestracyjny;
        this.typ_nadwozia = typ_nadwozia;
        this.nr_salonu = nr_salonu;
        this.nr_klienta = nr_klienta;
        this.nr_modelu = nr_modelu;
    }

    public int getNr_samochodu() {
        return nr_samochodu;
    }

    public String getVin() {
        return vin;
    }

    public String getRok_produkcji() {
        return rok_produkcji;
    }

    public String getRodzaj_paliwa() {
        return rodzaj_paliwa;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public int getLiczba_miejsc() {
        return liczba_miejsc;
    }

    public String getKlimatyzaja() {
        return klimatyzaja;
    }

    public float getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public String getTyp_nadwozia() {
        return typ_nadwozia;
    }

    public int getNr_salonu() {
        return nr_salonu;
    }

    public int getNr_klienta() {
        return nr_klienta;
    }

    public int getNr_modelu() {
        return nr_modelu;
    }

    public void setNr_samochodu(int nr_samochodu) {
        this.nr_samochodu = nr_samochodu;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setRok_produkcji(String rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public void setRodzaj_paliwa(String rodzaj_paliwa) {
        this.rodzaj_paliwa = rodzaj_paliwa;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setLiczba_miejsc(int liczba_miejsc) {
        this.liczba_miejsc = liczba_miejsc;
    }

    public void setKlimatyzaja(String klimatyzaja) {
        this.klimatyzaja = klimatyzaja;
    }

    public void setPojemnosc_silnika(float pojemnosc_silnika) {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public void setNr_rejestracyjny(String nr_rejestracyjny) {
        this.nr_rejestracyjny = nr_rejestracyjny;
    }

    public void setTyp_nadwozia(String typ_nadwozia) {
        this.typ_nadwozia = typ_nadwozia;
    }

    public void setNr_salonu(int nr_salonu) {
        this.nr_salonu = nr_salonu;
    }

    public void setNr_klienta(int nr_klienta) {
        this.nr_klienta = nr_klienta;
    }

    public void setNr_modelu(int nr_modelu) {
        this.nr_modelu = nr_modelu;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "nr_samochodu=" + nr_samochodu +
                ", vin='" + vin + '\'' +
                ", rok_produkcji='" + rok_produkcji + '\'' +
                ", rodzaj_paliwa='" + rodzaj_paliwa + '\'' +
                ", przebieg=" + przebieg +
                ", liczba_miejsc=" + liczba_miejsc +
                ", klimatyzaja='" + klimatyzaja + '\'' +
                ", pojemnosc_silnika=" + pojemnosc_silnika +
                ", nr_rejestracyjny='" + nr_rejestracyjny + '\'' +
                ", typ_nadwozia='" + typ_nadwozia + '\'' +
                ", nr_salonu=" + nr_salonu +
                ", nr_klienta=" + nr_klienta +
                ", nr_modelu=" + nr_modelu +
                '}';
    }


}
