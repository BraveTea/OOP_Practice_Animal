public class Fish extends AnimalBase implements iSwim{

    protected int numberOfFins;

    Fish(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }

    public void Swim() {

    }

    public double MaxSpeedSwimming(double currentPower, double fatigue) {
        return 0;
    }
}
