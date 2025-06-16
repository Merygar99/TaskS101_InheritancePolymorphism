package level2.exersice1.model;

public class Telephone {
    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void phoneCall(String phoneNumber) {
        System.out.println("Calling the phone number " + phoneNumber);
    }
}
