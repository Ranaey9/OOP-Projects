package interface_abstract.urun;

abstract  class gidaurunu extends urun {
    int kaloris;
    
    public gidaurunu(String urunAdi, double fiyat, int kaloris) {
        super(urunAdi, fiyat);
        this.kaloris = kaloris;
    }
    
    @Override
    public void urunbilgileri() {
        super.urunbilgileri();
        System.out.println("Kalori: " + kaloris);
    }
    
}
