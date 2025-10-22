package interface_abstract.şekil;

class daire extends sekil {
    double yaricap;

    public daire(double yaricap) {
        this.yaricap = yaricap;
        ad = "daire";
    }

    @Override
    double alanhesapla() {
        return Math.PI * yaricap * yaricap;
    }

}
