package interface_abstract.Arac;

public class bisiklet extends arac {
    @Override
    void calistir() {
        System.out.println("bisiklet çalıştı");
    }
    @Override
    void hareketEt() {
        System.out.println("bisiklet hareket etti");
    }
}
