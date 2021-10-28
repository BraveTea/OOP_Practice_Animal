package Habitats;

import interfaces.IwaterBreathable;



public class Aquarium extends HabitatBase<IwaterBreathable> {



    public Aquarium(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }



    public void hasWater() {

    }

    public void hasWaterBasedSustenance() {

    }
}
