package interface_abstract.odeme;

public class havale implements odeme {
    @Override
    public void odemeYap(double tutar)
    {
         if (tutar <= 0) {
            System.out.println("Geçersiz tutar.");
            return;
        }
        else
        System.out.println("havale ile "+tutar+" tl ödendi");
    }   
    
}
