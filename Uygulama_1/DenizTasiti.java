
public class DenizTasiti extends Tasit {
    double Agrlilk;
    int YolcuKapistesi;
    String GemiTipi;

    public DenizTasiti(String model, int modelYili, String renk, double Agrlilk, int YolcuKapistesi, String GemiTipi) {
        super(model, modelYili, renk);
        this.Agrlilk = Agrlilk;
        this.GemiTipi = GemiTipi;
        this.YolcuKapistesi = YolcuKapistesi;
    }

    public double getAgrlilk() {
        return Agrlilk;
    }

    public int getYolcuKapistesi() {
        return YolcuKapistesi;
    }

    public String getGemiTipi() {
        return GemiTipi;
    }

    public void RotaBelirle() {
        System.out.println("rota belirlendi");
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Ağırlık: " + Agrlilk);
        System.out.println("yolcu kapistesi:" + YolcuKapistesi);
        System.out.println("Gemi tipi:" + GemiTipi);
    }

}
