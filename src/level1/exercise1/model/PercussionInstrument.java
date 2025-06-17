package level1.exercise1.model;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void playInstrument() {
        System.out.println("A percussion instrument is playing");
    }

    static {
        System.out.println("Entering the class Percussion Instrument");
    }

}
