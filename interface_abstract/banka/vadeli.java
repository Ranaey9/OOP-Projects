package interface_abstract.banka;

public class vadeli extends banka {
    int sure;
    boolean doldu;

    public vadeli(int hesapNo, String ad, double bakiye, int sure, boolean doldu) {
        this.hesapNo = hesapNo;
        this.ad = ad;
        this.bakiye = bakiye;
        this.sure = sure;
        this.doldu = doldu;
    }

    @Override
    void paraYatir(double tutar) {
        bakiye += tutar;
        System.out.println(tutar + "tl.yatirldi yeni bakiye" + bakiye);
    }

    @Override
    void paraCek(double tutar) {
        if (bakiye >= tutar) {
            double ceza = 0;
            if (!doldu) {
                ceza = tutar * 0.10;
                System.out.println("ceza miktarı " + ceza + "TL");
            }
            bakiye -= tutar + ceza;
            System.out.println("yeni bakiyeniz " + bakiye + "Tl");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }
}
