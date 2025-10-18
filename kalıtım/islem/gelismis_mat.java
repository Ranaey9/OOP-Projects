package kalıtım.islem;

public class gelismis_mat extends islem{
    int a;
    int b;

@Override
public void hesapla(int a,int b){
super.hesapla(a, b);
super.hesapla(a, b);  
System.out.println("Fark: "+(a-b));

}
public void usal(int a,int b){
    System.out.println("us"+Math.pow(a,b));
}
}