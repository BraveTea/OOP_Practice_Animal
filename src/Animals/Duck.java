package Animals;

import interfaces.*;

public class Duck extends Bird implements ImoveOnLand, Ifly, IliveOnLand, IswimOnWater {

    public Duck(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }


    public void Fly() {

    }

    public void moveOnLand() {

    }


    public void canLiveOnLand() {

    }

    public void canSwimOnWater() {

    }
}
