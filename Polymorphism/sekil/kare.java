package Polymorphism.sekil;

public class kare implements sekil {
    int kenar;
    public kare(int kenar) {
        this.kenar = kenar;
    }
    @Override
    public double alanHesapla() {
        return kenar * kenar;
     }
    @Override
    public double cevreHesapla() {
        return 4 * kenar;  
}
}