package interface_abstract.şekil;

public class main {
    public static void main(String[] args) {
        kare k = new kare(5);
        k.ad = "kare";
        k.kenar = 5;
        k.bilgilerigoster();

        daire da = new daire(3);
        da.ad = "daire";
        da.yaricap = 3;
        da.bilgilerigoster();

        ucgen u = new ucgen();
        u.ad = "üçgen";
        u.a = 3;
        u.b = 4;
        u.c = 5;
        u.bilgilerigoster();

    }
}
