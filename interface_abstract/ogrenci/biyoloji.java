package interface_abstract.ogrenci;

public class biyoloji extends dersler implements notHesapla {
    public biyoloji(String dersAd, double not) {
        this.dersAd = dersAd;
        this.not = not;
    }

    @Override
    public double notHesapla() {
        return not + 10;
    }
}
