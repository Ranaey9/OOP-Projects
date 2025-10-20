package interface_abstract.Arac;

public class uçak extends arac {
    @Override
    void calistir() {
        System.out.println("uçak çalıştı");
    }

    @Override
    void hareketEt() {
        System.out.println("uçak hareket etti");
    }

    public void KarbonSal() {
        System.out.println("uçak karbon salınımı yapıyor");
    }
}
