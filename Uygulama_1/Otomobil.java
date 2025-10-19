public class Otomobil extends MotorluKaraTasiti {
    int motorHacmi;
    int beygirGucu;
    int hiz;
    int maksimumHiz;
    boolean absVarMi;
    boolean klimaVarMi;

    /**
     * @param model
     * @param modelYili
     * @param renk
     * @param tekerSayisi
     * @param KapiSayisi
     * @param YakitTuru
     * @param VitesTipi
     * @param motorHacmi
     * @param beygirGucu
     * @param maksimumHiz
     * @param absVarMi
     * @param klimaVarMi
     */
    public Otomobil(String model, int modelYili, String renk,
            int tekerSayisi, int KapiSayisi, String YakitTuru, String VitesTipi,
            int motorHacmi, int beygirGucu, int maksimumHiz,
            boolean absVarMi, boolean klimaVarMi) {

        super(model, modelYili, renk, tekerSayisi, KapiSayisi, YakitTuru, VitesTipi, maksimumHiz);
        this.motorHacmi = motorHacmi;
        this.beygirGucu = beygirGucu;
        this.maksimumHiz = maksimumHiz;
        this.absVarMi = absVarMi;
        this.klimaVarMi = klimaVarMi;
        this.hiz = 0;
    }

    public void hizlan(int miktar) {
        hiz += miktar;
        if (hiz > maksimumHiz) {
            hiz = maksimumHiz;
            System.out.println(model + " " + hiz + "km/h hız ile ilerliyor");
        }
    }

    public void yavasla(int miktar) {
        hiz -= miktar;
        if (hiz < 0)
            hiz = 0;
        System.out.println(model + " " + hiz + " km/h hızla gidiyor.");
    }

    public void bilgiGoster() {
        System.out.println("Model: " + model);
        System.out.println("Motor: " + motorHacmi + "L " + beygirGucu + "HP");
        System.out.println("Vites: " + VitesTipi);
        System.out.println("Kliması var mı: " + (klimaVarMi ? "Evet" : "Hayır"));
        System.out.println("ABS: " + (absVarMi ? "Var" : "Yok"));
    }

    public void kornaCal() {
        System.out.println(model + " bip bip!");
    }
}