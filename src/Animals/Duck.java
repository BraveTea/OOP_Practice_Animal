package Animals;

import interfaces.Ifly;
import interfaces.IliveOnLand;
import interfaces.ImoveOnLand;
import interfaces.Iswim;

public class Duck extends Bird implements ImoveOnLand, Ifly, Iswim, IliveOnLand {

    public Duck(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }


    public void Fly() {

    }

    public void moveOnLand() {

    }

    public void Swim() {

    }

    public void canLiveOnLand() {

    }
}
