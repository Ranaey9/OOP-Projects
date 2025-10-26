package interface_abstract.urun;

abstract  class urun implements satilabilir {
    String urunAdi;
    double fiyat;
    int stokadedi;
    
    public urun(String urunAdi, double fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.stokadedi = 0;
    }
    @Override
    public void urunbilgileri() {
        System.out.println("Ürün Adı: " + urunAdi);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Stok Adedi: " + stokadedi);
    }
    
}
