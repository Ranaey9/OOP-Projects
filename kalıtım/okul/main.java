package kalıtım.okul;

import kalıtım.univeriste.ogrenci;

public class main {
    public static void main(String[] args) {
        // Polymorphism ile farklı nesneleri Kisi[] içinde tutuyoruz

        // Döngü dışında tek tek nesne oluşturma
        memur m = new memur("Ahmet", 40, "Sekreter");
        m.bilgileriGoster();

        ogretemn o = new ogretemn("Fatma", 35, "Fizik", 10);
        o.bilgileriGoster();

        ogrenci og = new ogrenci("Ali", 20, 12345, 85);
        og.bilgilerigoster();
    }
}
