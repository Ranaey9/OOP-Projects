package kalıtım.kitap;

public class roman extends kitap {
    String yazar;
@Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
                System.out.println("yazar adi: " + yazar);
    }
}