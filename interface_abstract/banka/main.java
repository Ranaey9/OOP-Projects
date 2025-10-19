package interface_abstract.banka;

public class main {
    public static void main(String[] args) {
        vadesiz h1 = new vadesiz(101, "Rana", 1000);
        vadeli h2 = new vadeli(102, "Ali", 5000, 180, false);

        h1.paraYatir(500);
        h1.paraCek(200);
        h1.bakiyeGoster();

        h2.paraCek(1000);
        h2.bakiyeGoster();
    }
}