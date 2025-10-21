package interface_abstract.personel;

abstract class personel {
    String ad;
    int yas;

    abstract void gorevyap();

    static int personelsayisi(String ad, int yas) {
        int sayac = 1;
        sayac++;
        return sayac;
    }
}
