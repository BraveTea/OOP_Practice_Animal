package Habitats;

import interfaces.IliveOnLand;

public class Jungle extends HabitatBase<IliveOnLand> implements IliveOnLand {

    public Jungle(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }

    public void canLiveOnLand() {

    }
}
