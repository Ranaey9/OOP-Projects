package interface_abstract.banka;

public class vadesiz extends banka {
    public vadesiz(int hesapNo, String ad, double bakiye) {
        this.hesapNo = hesapNo;
        this.ad = ad;
        this.bakiye = bakiye;
    }

    @Override
    void paraYatir(double tutar) {
        bakiye += tutar;
        System.out.println("para yatirldi");
    }

    @Override
    void paraCek(double tutar) {
        if (bakiye >= tutar) {
            bakiye -= tutar;
            System.out.println(tutar + " TL çekildi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }
}
