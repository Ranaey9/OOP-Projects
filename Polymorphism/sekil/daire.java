package Polymorphism.sekil;

public class daire implements sekil {
    double pi = 3.14;
    int yaricap;

    public daire(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return pi * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * pi * yaricap;
    }
}
