package Animals;

public class Bird extends AnimalBase {

    protected int numberOfWings;


    Bird(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }
}
