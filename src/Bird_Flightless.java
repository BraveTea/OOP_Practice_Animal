public class Bird_Flightless extends Bird implements ImoveOnLand, IliveOnLand {

    Bird_Flightless(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }

    public void moveOnLand() {

    }

    public double maxSpeedLand(double gradientGround, double fatigue) {
        return 0;
    }


    public void canLiveOnLand() {

    }
}
