package Animals;

import interfaces.Ifly;
import interfaces.ImoveOnLand;

public class Bird_Classic extends Bird implements Ifly, ImoveOnLand {

    Bird_Classic(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }

    public void Fly() {
        System.out.printf("%s is flying", name);
    }


    public void moveOnLand() {

    }

}
