package interface_abstract.hayvan;

public  class kedi extends hayvan {
    @Override
    void sescikar() {
        System.out.println("kedi miyavladı");
    }

    @Override
    void hareketet() {
        System.out.println("kedi hareket etti");
    }
    
}
