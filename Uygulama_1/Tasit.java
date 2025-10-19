public class Tasit {
    String model;
    int modelYili;
    String renk;

    public Tasit(String model, int modelYili, String renk) {
        this.model = model;
        this.modelYili = modelYili;
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public int getModelYili() {
        return modelYili;
    }

    public String getRenk() {
        return renk;
    }

    public void BilgileriGoster() {
        System.out.println("Model: " + model + "Model Yılı: " + modelYili + "Renk: " + renk);
    }
}
