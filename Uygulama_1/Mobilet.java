public class Mobilet extends MotorluKaraTasiti {

  public Mobilet(final String model, final int modelYili, final String renk) {
    super(model, modelYili, renk, 2, 0, "Benzin", "Manuel", modelYili);
  }

  public void kornaCal() {
    System.out.println(model + " tin tin!");
  }
}