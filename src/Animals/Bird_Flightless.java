package Animals;

import interfaces.IliveOnLand;
import interfaces.ImoveOnLand;

public class Bird_Flightless extends Bird implements ImoveOnLand, IliveOnLand {

    Bird_Flightless(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }

    public void moveOnLand() {
        System.out.printf("%s is moving on land", name);
    }

    public void canLiveOnLand() {

    }
}
