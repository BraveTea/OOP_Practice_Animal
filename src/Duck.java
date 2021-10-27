public class Duck extends Bird implements iMoveOnLand, iFly, iSwim{

    Duck(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator) {
        super(name, dominantColour, numberOfLegs, age, sentience, alive, predator);
    }


    public void Fly() {

    }


    public double MaxSpeedFlying(double airResistance, double fatigue) {
        return 0;
    }


    public void moveOnLand() {

    }


    public double maxSpeedLand(double gradientGround, double fatigue) {
        return 0;
    }


    public void Swim() {

    }


    public double MaxSpeedSwimming(double currentPower, double fatigue) {
        return 0;
    }
}
