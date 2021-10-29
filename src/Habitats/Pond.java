package Habitats;

import interfaces.Iswim;
import interfaces.IswimOnWater;

import java.util.ArrayList;


// TODO How to have this take 2 different types/interfaces? Because a fish van also swim in a pond. Ducks are dicks!


public class Pond extends HabitatBase<IswimOnWater> implements Iswim, IswimOnWater {


    Pond(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }

    public void Swim() {

    }

    public void canSwimOnWater() {

    }
}
