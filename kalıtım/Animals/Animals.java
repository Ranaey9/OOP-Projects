package kalıtım.Animals;

public class Animals {
    String name;
    int age;
    public  void sescikar(){
        System.out.println("Hayvan ses cikariyor");
    }

}
 class Cat extends Animals{
    public void sescikar(){
        System.out.println("Miyav");
    }
 }
    class Dog extends Animals{
        public void sescikar(){
            System.out.println("Hav hav");
        }
    }