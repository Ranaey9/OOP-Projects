package interface_abstract.odeme;

public class main {
    public static void main(String[] args) {
        kasa kasa = new kasa();

        odeme nakitOdeme = new nakit();
        kasa.odemeYap(nakitOdeme, 150.0);

        odeme krediKartodeme = new krediKart();
        kasa.odemeYap(krediKartodeme, 3435);

        odeme havaleodeme = new havale();
        kasa.odemeYap(havaleodeme, 3546);

    }

}
