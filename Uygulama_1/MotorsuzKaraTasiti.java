public class MotorsuzKaraTasiti extends KaraTasiti {

    public MotorsuzKaraTasiti(String model, int modelYili, String renk, int tekerSayisi, int KapiSayisi,
            String YakitTuru) {
        super(model, modelYili, renk, tekerSayisi, KapiSayisi, YakitTuru);
    }

    public void hareketEt() {
        System.out.println("Motorsuz kara taşıtı hareket ediyor...");
    }

    public void dur() {
        System.out.println("Motorsuz kara taşıtı durdu.");
    }
}
