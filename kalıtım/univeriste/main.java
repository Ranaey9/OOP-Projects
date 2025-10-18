package kalıtım.univeriste;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<ogrenci> ogrenciler = new ArrayList<>();


   

        // Döngü ile tüm öğrencilerin bilgilerini göster
        for(ogrenci o : ogrenciler) {
            o.bilgilerigoster();

            // Eğer bilgisyar_ogrenci ise kodYaz metodunu çağır
            if(o instanceof bilgisyar_ogrenci) {
                ((bilgisyar_ogrenci) o).kodyaz();
            }
        }
    }
}
