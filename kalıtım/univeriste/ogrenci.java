package kalıtım.univeriste;

public class ogrenci {
    private String ad;
   private int yas;
   private int ogrno;
   private int notort;
   public ogrenci(String ad, int yas,int ogrno,int notort){
    this.ad=ad;
    this.yas=yas;
    this.ogrno=ogrno;
    this.notort=notort;
   }
    public void bilgilerigoster(){
        System.out.println("ad:"+ad+"yas"+yas+"ogrno"+ogrno+"notort"+notort);
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setNotort(int notort) {
        this.notort = notort;
    }
    public void setOgrno(int ogrno) {
        this.ogrno = ogrno;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
    public String getAd() {
        return ad;
    }
    public int getNotort() {
        return notort;
    }public int getOgrno() {
        return ogrno;
    }
    public int getYas() {
        return yas;
    }
    
}
