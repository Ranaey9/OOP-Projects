public class MotorluKaraTasiti extends KaraTasiti {
    int VitesTipi;

    public MotorluKaraTasiti(String model, int modelYili, String renk, int tekerSayisi, int KapiSayisi,
            String YakitTuru, String vitesTipi2, int VitesTipi) {
        super(model, modelYili, renk, tekerSayisi, KapiSayisi, YakitTuru);
        this.VitesTipi = VitesTipi;
    }

    public int getVitesTipi() {
        return VitesTipi;
    }

    public void MotorCalistir() {
        System.out.println("motor çalıştı");
    }

    public void MotorDurdur() {
        System.out.println("motor durdu");
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Vites Tipi: " + VitesTipi);

    }

}
