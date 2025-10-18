package kalıtım.kitap;

public class main {
 public static void main(String[] args) {
    kitap k=new kitap();
    roman r=new roman();
    k.ad="Suç ve Ceza";
    k.sayfa_sayisi=500;
    k.bilgilerigoster();
    r.ad="Kürk Mantolu Madonna";
    r.sayfa_sayisi=300;
    r.yazar="Sabahattin Ali";
    r.bilgilerigoster();
 }   
}
