package kalıtım.arac;

public class araba extends arac{
 int kapisayisi;
 int gunlukucret;
 @Override
    public void kiralamaucreti(int gun){
         double sum=gun*gunlukucret;
        if(gun>7){
         sum*=0.90;
        }
        System.out.println("araba kiralama ucreti: "+sum);
    }
}
     

