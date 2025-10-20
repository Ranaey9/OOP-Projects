package interface_abstract.odeme;

public class nakit implements odeme {
    @Override
    public void odemeYap(double tutar) {
        System.out.println("Nakit ödeme yapıldı: " + tutar + " TL");
    }
}
