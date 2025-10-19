public class Main {
    public static void main(String[] args) {

        System.out.println("=== OTOMOBİL ===");
        Otomobil oto = new Otomobil("Toyota Corolla", 2021, "Beyaz", 4, 4, "Benzin", "Otomatik",
                1600, 120, 200, true, true);
        oto.bilgiGoster();
        oto.hizlan(50);
        oto.yavasla(20);
        oto.kornaCal();
        System.out.println();

        System.out.println("=== MOBILET ===");
        Mobilet mob = new Mobilet("Yamaha", 2023, "Mavi");
        mob.MotorCalistir();
        mob.kornaCal();
        mob.MotorDurdur();
        System.out.println();

        System.out.println("=== BİSİKLET ===");
        Bisiklet bisiklet = new Bisiklet("Salcano XRS", 2022, "Kırmızı", 2, 0, "İnsan gücü", true);
        bisiklet.pedalCevir();
        bisiklet.frenYap();
        bisiklet.bilgiGoster();
        System.out.println();

        System.out.println("=== FAYTON ===");
        Fayton fayton = new Fayton("Klasik Fayton", 2018, "Kahverengi", 4, 2, "At");
        fayton.ilerle();
        fayton.dur();
        fayton.BilgileriGoster();
        System.out.println();

        System.out.println("=== DENİZ TAŞITI ===");
        DenizTasiti gemi = new DenizTasiti("Titanic", 1912, "Beyaz", 52310, 2400, "Yolcu Gemisi");
        gemi.RotaBelirle();
        gemi.BilgileriGoster();
    }
}
