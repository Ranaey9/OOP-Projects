package interface_abstract.şekil;

abstract class sekil {
    String ad;

    abstract double alanhesapla();

    public void bilgilerigoster() {
        System.out.println("sekil adi: " + ad);
        System.out.println("alan: " + alanhesapla());
    }
}
