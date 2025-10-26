package interface_abstract.Tasit;

public class Main {
    public static void main(String[] args) {
        otomaobil myCar = new otomaobil("Toyota", "Corolla", 130, 5);
        myCar.bilgileriGoster();
        myCar.yakitTuketimiHesapla();
    }
}
