package Habitats;

import interfaces.Iswim;


// TODO need to write an interface for the Generic here. HabitatBase is Raw now and needs to get a <type>
public class Pond extends HabitatBase implements Iswim {

    Pond(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }

    public void Swim() {

    }



}
