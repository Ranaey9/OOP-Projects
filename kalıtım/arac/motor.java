package kalıtım.arac;

public class motor extends arac {
    @Override
    public void kiralamaucreti(int gun) {
        double sum=gun*gunlukucret;
        if(gun>3){
           sum*=0.95;
            System.out.println("motor kiralama ucreti: "+sum);     
        }
    
}
}