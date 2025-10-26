package interface_abstract.Tasit;

abstract  class arac implements tasit {
    String marka;
    String model;
    int motorgucu;

    public arac(String marka, String model, int motorgucu) {
        this.marka = marka;
        this.model = model;
        this.motorgucu = motorgucu;
    }


}
