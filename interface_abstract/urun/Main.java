package interface_abstract.urun;

public class Main {
    public static void main(String[] args) {
        elektorinikurun laptop = new elektorinikurun("Laptop", 7500.0, 24);
        laptop.urunbilgileri();
    }
    gidaurunu sebze = new gidaurunu("Domates", 5.0, 20) {
        @Override
        public void fiyzthesapla() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'fiyzthesapla'");
        }
    };
    
}
