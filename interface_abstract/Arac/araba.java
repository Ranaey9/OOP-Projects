package interface_abstract.Arac;

public class araba extends arac implements CevreEtkisi {
    @Override
    void calistir() {
        System.out.println("araba çalıştı");
    }

    @Override
    void hareketEt() {
        System.out.println("araba hareket etti");
    }
    @Override
    public void KarbonSal() {
        System.out.println("araba karbon salınımı yapıyor");
    }
}
