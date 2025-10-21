package interface_abstract.ogrenci;

import java.util.ArrayList;
import java.util.List;

abstract class dersler {
    String dersAd;
    double not;
    double proje;
    List<notHesapla> dersler= new ArrayList<>();

    public void dersBilgisiGoster() {
        System.out.println(dersAd + " dersi, not: " + not);
    }

    double ortalamaHesapla() {
        double toplam = 0;
        for (notHesapla ders : dersler) {
            toplam += ders.notHesapla();
        }
        return toplam / dersler.size();
    }

    public void dersEkle(notHesapla ders) {
        dersler.add(ders);
    }
}
