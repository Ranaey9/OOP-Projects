
public class HavaTasiti extends Tasit {
    int Yukseklik;
    int MotorSayisi;

    public HavaTasiti(String model, int modelYili, String renk, int Yukseklik, int MotorSayisi) {
        super(model, modelYili, renk);
        this.Yukseklik = Yukseklik;
        this.MotorSayisi = MotorSayisi;
    }

    public int getYukseklik() {
        return Yukseklik;
    }

    public int getMotorSayisi() {
        return MotorSayisi;
    }

    public void KalkisYap() {
        System.out.println("Uçak Kalkış yaptı!");
    }

    public void İnisYap() {
        System.out.println("Uçak iniş yaptı!");
    }

    public void DriftYap() {
        System.out.println("Drift yapılldı");
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Yükseklik:" + Yukseklik);
        System.out.println("motor sayısı:" + MotorSayisi);
    }

}
