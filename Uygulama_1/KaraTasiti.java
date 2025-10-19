public class KaraTasiti extends Tasit {
    int tekerSayisi;
    String YakitTuru;
    int KapiSayisi;

    public KaraTasiti(String model, int modelYili, String renk, int tekerSayisi, int KapiSayisi, String YakitTuru) {
        super(model, modelYili, renk);
        this.tekerSayisi = tekerSayisi;
        this.KapiSayisi = KapiSayisi;
        this.YakitTuru = YakitTuru;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public String getYakitTuru() {
        return YakitTuru;
    }

    public int getKapiSayisi() {
        return KapiSayisi;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Teker sayısı:" + tekerSayisi);
        System.out.println("Yakıt Türü :" + YakitTuru);
        System.out.println("Kapı sayısı:" + KapiSayisi);
    }

}
