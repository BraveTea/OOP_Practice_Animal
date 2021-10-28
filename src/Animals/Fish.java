package Animals;

import interfaces.Iswim;
import interfaces.IwaterBreathable;

public class Fish extends AnimalBase implements Iswim, IwaterBreathable {

    protected int numberOfFins;

    Fish(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }

    public void Swim() {
        System.out.printf("%s is swimming", name);
    }


    public void canBreatheUnderWater() {

    }


}
