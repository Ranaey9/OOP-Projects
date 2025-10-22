package interface_abstract.şekil;

public class ucgen extends sekil {
    int a;
    int b;
    int c;

    @Override
    double alanhesapla() {
        double u = (a + b + c) / 2;
        return Math.sqrt(u * (u - a) * (u - b) * (u - c));
    }

}
