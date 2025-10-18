package kalıtım.okul;

public class kisi {
    String ad;
    int yas;
    public kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }
    public void bilgileriGoster(){
        System.out.println("Ad: "+ad);
        System.out.println("Yaş: "+yas);

    }
}
