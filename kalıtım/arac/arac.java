package kalıtım.arac;

public class arac {
    String marka;
    String model;
    int gunlukucret;
    public void kiralamaucreti(int gun){
        System.out.println("kiralama ucreti: "+(gun*gunlukucret));
    }
}
