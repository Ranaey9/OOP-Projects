package interface_abstract.ogrenci;

public class fizik extends dersler implements notHesapla {
    public fizik(String derssAd, double not, double proje) {
        this.dersAd = derssAd;
        this.not = not;
        this.proje = proje;
    }

    @Override
    public double notHesapla() {
        return not * 0.7 + proje * 0.3;
    }
}
