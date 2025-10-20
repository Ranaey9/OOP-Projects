package interface_abstract.odeme;

public class krediKart implements odeme {
    @Override
    public void odemeYap(double tutar) {
        if (tutar <= 0) {
            System.out.println("Geçersiz tutar.");
            return;
        }
        else

        System.out.println("Kredi kartı ile "+tutar+" TL ödeme yapıldı.");
    }   
    
}
