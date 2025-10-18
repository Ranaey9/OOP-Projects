package kalıtım.okul;

public class ogrnci extends kisi {
 int ogrnciNo;
 double not;
    public ogrnci(String ad, int yas, int ogrnciNo, double not) {
        super(ad, yas);
        this.ogrnciNo = ogrnciNo;
        this.not = not;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Öğrenci No: "+ogrnciNo);
        System.out.println("Not: "+not);

    }
public void derscalis(){
    System.out.println(ad+"ders çalışıyor");
}
}