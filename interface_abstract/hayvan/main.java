package interface_abstract.hayvan;

public class main {
    public static void main(String[] args) {
        kedi kedi1 = new kedi();
        kus kus1 = new kus();

        kedi1.hareketet();
        kedi1.sescikar();

        kus1.hareketet();
        kus1.sescikar();
        
        kopek kopek1 = new kopek();
        kopek1.hareketet();
        kopek1.sescikar();
        kopek1.koruma();
    }
}
