public class Pond extends HabitatBase implements Iswim{

    Pond(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }

    public void Swim() {

    }

    public double MaxSpeedSwimming(double currentPower, double fatigue) {
        return 0;
    }

}
