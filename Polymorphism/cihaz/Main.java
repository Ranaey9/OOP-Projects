package Polymorphism.cihaz;

public class Main {
    public static void main(String[] args) {
        cihaz[] cihazlar = new cihaz[2];
        cihazlar[0] = new bilgisayar();
        cihazlar[1] = new televizyon();
        for (cihaz c : cihazlar) {
            c.ac();
        }
    }
}
