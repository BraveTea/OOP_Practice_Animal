package Habitats;

import java.util.ArrayList;

public abstract class HabitatBase<T> {



    private String name;
    private double minTemp;
    private double maxTemp;

    HabitatBase(String name, double minTemp, double maxTemp){
        this.name = name;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }


    public ArrayList<T> animals = new ArrayList<>();

    public void addAnimal(T animal){
        animals.add(animal);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getName() {
        return name;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }


}

