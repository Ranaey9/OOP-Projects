package interface_abstract.şekil;

class kare extends sekil {
    double kenar;

    public kare(double kenar) {
        this.kenar = kenar;
        ad = "kare";
    }

    @Override

    double alanhesapla() {
        return kenar * kenar;
    }

}
