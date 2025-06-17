package level2.exersice1.model;

public class Smartphone extends Telephone implements Camera, Watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}
