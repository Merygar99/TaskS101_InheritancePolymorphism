package level1.exercise1.application;

import level1.exercise1.model.PercussionInstrument;
import level1.exercise1.model.StringInstrument;
import level1.exercise1.model.WindInstrument;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a wind instrument");
        WindInstrument instrument1 = new WindInstrument("Flute", 15.0);
        WindInstrument instrument2 = new WindInstrument("Trombone", 150.0);
        WindInstrument instrument3 = new WindInstrument("Saxophone", 200.0);
        WindInstrument instrument4 = new WindInstrument("Bass Horne", 200.0);
        instrument1.playInstrument();

        System.out.println("-----------------");

        System.out.println(WindInstrument.getTotalInstrumentsCreated());

        System.out.println("-----------------");

        System.out.println("Creating a string instrument");
        StringInstrument instrument5 = new StringInstrument("Guitar", 150.0);
        instrument5.playInstrument();

        System.out.println("-----------------");

        System.out.println("Creating a percussion instrument");
        PercussionInstrument instrument6 = new PercussionInstrument("Tambourine", 40.0);
        instrument6.playInstrument();
    }
}




