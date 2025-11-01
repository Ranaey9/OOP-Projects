package Polymorphism.sekil;

public class Main {
    public static void main(String[] args) {
        sekil[] sekiller = new sekil[2];
        sekiller[0] = new kare(5);
        sekiller[1] = new daire(7);
        for (sekil s : sekiller) {
            System.out.println("Alan: " + s.alanHesapla());
            System.out.println("Cevre: " + s.cevreHesapla());
        }
    }
}
