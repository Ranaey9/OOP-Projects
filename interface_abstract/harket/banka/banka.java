package interface_abstract.banka;

abstract class banka {
    int hesapNo;
    String ad;
    double bakiye;

    abstract void paraYatir(double tutar);

    abstract void paraCek(double tutar);

    void bakiyeGoster() {
        System.out.println(ad + " adlı müşterinin bakiyesi: " + bakiye + " TL");
    }
}
