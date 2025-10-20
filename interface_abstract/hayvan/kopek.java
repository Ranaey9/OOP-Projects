package interface_abstract.hayvan;

public class kopek extends hayvan implements koruma {
    @Override
    void sescikar() {
        System.out.println("köpek havladı");
    }

    @Override
    void hareketet() {
        System.out.println("köpek hareket etti");
    }

    @Override
    public void koruma() {
        System.out.println("köpek koruma yapıyor");
    }

}
