package com.example.AplikacjaBDBT.baza;

import java.sql.Timestamp;

public class Sprzedaz {

    private Timestamp DATA_SPRZEDAZY;
    private int NR_PRACOWNIKA;
    private int NR_SAMOCHODU;
    private int NR_KLIENTA;

    public Sprzedaz() {

    }

    public Sprzedaz(Timestamp DATA_SPRZEDAZY, int NR_PRACOWNIKA, int NR_SAMOCHODU, int NR_KLIENTA) {
        super();
        this.DATA_SPRZEDAZY = DATA_SPRZEDAZY;
        this.NR_PRACOWNIKA = NR_PRACOWNIKA;
        this.NR_SAMOCHODU = NR_SAMOCHODU;
        this.NR_KLIENTA = NR_KLIENTA;
    }
    public String data(){
        return DATA_SPRZEDAZY.toString().substring(0, 19);
    }

    public Timestamp getDATA_SPRZEDAZY() {
        return DATA_SPRZEDAZY;
    }

    public void setDATA_SPRZEDAZY(Timestamp DATA_SPRZEDAZY) {
        this.DATA_SPRZEDAZY = DATA_SPRZEDAZY;
    }

    public int getNR_PRACOWNIKA() {
        return NR_PRACOWNIKA;
    }

    public void setNR_PRACOWNIKA(int NR_PRACOWNIKA) {
        this.NR_PRACOWNIKA = NR_PRACOWNIKA;
    }

    public int getNR_SAMOCHODU() {
        return NR_SAMOCHODU;
    }

    public void setNR_SAMOCHODU(int NR_SAMOCHODU) {
        this.NR_SAMOCHODU = NR_SAMOCHODU;
    }

    public int getNR_KLIENTA() {
        return NR_KLIENTA;
    }

    public void setNR_KLIENTA(int NR_KLIENTA) {
        this.NR_KLIENTA = NR_KLIENTA;
    }
}
