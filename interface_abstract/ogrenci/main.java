package interface_abstract.ogrenci;

public class main {
    public static void main(String[] args) {
        fizik f = new fizik("fizik", 50, 70);

        mat m = new mat("mat", 70);

        biyoloji b = new biyoloji("biyoloji", 90);

        dersler d = new dersler() {
        };
        d.dersEkle(f);
        d.dersEkle(m);
        d.dersEkle(b);

        for (notHesapla ders : d.dersler) {
            System.out.println("Ders: " + ((dersler) ders).dersAd + ", not: " + ders.notHesapla());
        }

        // Ortalamayı hesapla ve yazdır
        System.out.println("Ortalama: " + d.ortalamaHesapla());

    }
}