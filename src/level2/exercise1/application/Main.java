package level2.exercise1.application;

import level2.exercise1.model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Samsung", "Galaxy S25");

        phone1.phoneCall("647530867");
        phone1.takePhoto();
        phone1.alarm();
    }
}
