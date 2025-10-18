package kalıtım.okul;

public class memur extends kisi     {
    String görev;
    
    public memur(String ad, int yas, String görev) {
        super(ad, yas);
        this.görev = görev;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Görev: "+görev);
    }
public void calis(){
    System.out.println(ad+"çalışıyor");
}
}
