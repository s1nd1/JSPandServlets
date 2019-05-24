package ru.ivmiit;

public class Table {
    String zagolovok;
    String fon;
    int stroki;
    int stolbci;

    public Table(String zagolovok, String fon, int stroki, int stolbci) {
        this.zagolovok = zagolovok;
        this.fon = fon;
        this.stroki = stroki;
        this.stolbci = stolbci;
    }

    public String getZagolovok() {
        return zagolovok;
    }

    public void setZagolovok(String zagolovok) {
        this.zagolovok = zagolovok;
    }

    public String getFon() {
        return fon;
    }

    public void setFon(String fon) {
        this.fon = fon;
    }

    public int getStroki() {
        return stroki;
    }

    public void setStroki(int stroki) {
        this.stroki = stroki;
    }

    public int getStolbci() {
        return stolbci;
    }

    public void setStolbci(int stolbci) {
        this.stolbci = stolbci;
    }
}
