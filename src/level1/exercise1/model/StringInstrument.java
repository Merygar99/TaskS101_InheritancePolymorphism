package level1.exercise1.model;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void playInstrument() {
        System.out.println("A string instrument is playing");
    }

    static {
        System.out.println("Entering the class String Instrument");
    }

}
