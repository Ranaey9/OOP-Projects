package interface_abstract.ogrenci;

public class mat extends dersler implements notHesapla {
    public mat(String derssAd, double not) {
        this.dersAd = derssAd;
        this.not = not;
    }

    @Override
    public double notHesapla() {
        return not;
    }
}
