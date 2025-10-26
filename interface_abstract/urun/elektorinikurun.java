package interface_abstract.urun;

public class elektorinikurun extends urun {
    int garantiSuresi; // in months

    public elektorinikurun(String urunAdi, double fiyat, int garantiSuresi) {
        super(urunAdi, fiyat);
        this.garantiSuresi = garantiSuresi;
    }

    @Override
    public void urunbilgileri() {
        super.urunbilgileri();
        System.out.println("Garanti Süresi: " + garantiSuresi + " ay");
    }

    @Override
    public void fiyzthesapla() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fiyzthesapla'");
    }

}
