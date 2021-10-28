public class Fish extends AnimalBase implements Iswim, IwaterBreathable{

    protected int numberOfFins;

    Fish(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }

    public void Swim() {

    }

    public double MaxSpeedSwimming(double currentPower, double fatigue) {
        return 0;
    }


    public void canBreatheUnderWater() {

    }

    @Override //This piece of code tells the compiler that an ArrayList of with a fish in it needs to be printed as a name, otherwise I would just get a memory location
    public String toString() {
        return name;
    }
}
