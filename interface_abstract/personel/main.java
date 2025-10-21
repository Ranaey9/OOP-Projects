package interface_abstract.personel;

public class main {
    public static void main(String[] args) {
        muhendis m1 = new muhendis();
        m1.ad = "ali";
        m1.yas = 30;
        m1.gorevyap();

        sekreter s1 = new sekreter();
        s1.ad = "ayşe";
        s1.yas = 25;
        s1.gorevyap();

        System.out.println("personel sayısı: " + personel.personelsayisi("ali", 30));
    }
}
