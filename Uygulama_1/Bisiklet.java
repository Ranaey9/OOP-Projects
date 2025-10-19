public class Bisiklet extends MotorsuzKaraTasiti {
    boolean VitesliMi;
    public Bisiklet(String model, int modelYili, String renk, int tekerSayisi, int KapiSayisi, String YakitTuru, boolean VitesliMi) {
        super(model, modelYili, renk, tekerSayisi, KapiSayisi, YakitTuru);
    }

    public boolean isVitesliMi() {
        return VitesliMi;
    }

    public void setVitesliMi(boolean VitesliMi) {
        this.VitesliMi = VitesliMi;
    }
public void pedalCevir() {
        System.out.println(model + " pedallarla ilerliyor 🚴‍♂️");
    }

    public void frenYap() {
        System.out.println(model + " yavaşladı ve durdu 🛑");
    }

    public void bilgiGoster() {
        System.out.println("Model: " + model);
        System.out.println("Model yılı: " + modelYili);
        System.out.println("Renk: " + renk);
        System.out.println("Teker sayısı: " + tekerSayisi);
        System.out.println("Vitesli mi: " + (VitesliMi ? "Evet" : "Hayır"));
        System.out.println("Yakıt türü: İnsan gücü");
    }

}
