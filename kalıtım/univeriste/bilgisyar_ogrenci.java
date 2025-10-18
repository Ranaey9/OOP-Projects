package kalıtım.univeriste;

public class bilgisyar_ogrenci extends ogrenci {
    public bilgisyar_ogrenci( String ad,int yas,int ogrno,int notort){
super(ad, yas, ogrno, notort);
  }
public void kodyaz(){
    System.out.println(getAd()+"kod yazıyor");
}
}
