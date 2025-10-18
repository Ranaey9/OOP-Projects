package kalıtım.okul;

public class ogretemn extends kisi{
   String brans;
   int deneyim;
    public ogretemn(String ad, int yas, String brans, int deneyim) {
        super(ad, yas);
        this.brans = brans;
        this.deneyim = deneyim;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Branş: "+brans);
        System.out.println("Deneyim: "+deneyim);

    } 
public void dersver(){
    System.out.println(ad+"ders veriyor");  }
}
