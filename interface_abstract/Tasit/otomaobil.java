package interface_abstract.Tasit;

public class otomaobil extends arac {

    int kapısayisi;

    public otomaobil(String marka, String model, int motorgucu, int vitesSayisi) {
        super(marka, model, motorgucu);
        this.kapısayisi = kapısayisi;
    }

    @Override
    public void yakitTuketimiHesapla() {
        double tuketim = (motorgucu / 100.0) * 8; 
        System.out.println("Otomobil yakıt tüketimi: " + tuketim + " litre/100km");
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Motor Gücü: " + motorgucu + " HP");
    }
    
}
