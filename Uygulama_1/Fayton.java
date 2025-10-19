public class Fayton extends MotorsuzKaraTasiti {
    public Fayton(String model, int modelYili, String renk, int tekerSayisi, int KapiSayisi, String YakitTuru) {
        super(model, modelYili, renk, tekerSayisi, KapiSayisi, YakitTuru);
    }

    public void ilerle() {
        System.out.println(model + " atlar tarafından çekiliyor...");
    }

    @Override
    public void dur() {
        System.out.println(model + " durdu. Atlar bekliyor.");
    }
}
