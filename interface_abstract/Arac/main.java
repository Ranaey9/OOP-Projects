package interface_abstract.Arac;

public class main {
    public static void main(String[] args) {
        bisiklet b1 = new bisiklet();
        b1.marka = "Bianchi";
        b1.modelyili = 2020;
        b1.calistir();
        b1.hareketEt();

        uçak u1 = new uçak();
        u1.marka = "Boeing";
        u1.modelyili = 2018;
        u1.calistir();
        u1.hareketEt();
        u1.KarbonSal();

        araba a1 = new araba();
        a1.marka = "Toyota";
        a1.modelyili = 2021;
        a1.calistir();
        a1.hareketEt();
        a1.KarbonSal();
    }
}
