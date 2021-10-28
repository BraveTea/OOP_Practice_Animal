import java.util.ArrayList;

public class Aquarium extends HabitatBase implements IsustainsSwimming {

    public ArrayList<IwaterBreathable> allIwaterBreathableAnimals = new ArrayList<>();


    Aquarium(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }

    public void addAnimal(IwaterBreathable animal){
//        if (animal instanceof IwaterBreathable) {
            allIwaterBreathableAnimals.add(animal);
//        }
//        else{
//            System.out.printf("%s has not been added for it cannot breathe under water.", animal);
//        }
    }


    public void hasWater() {

    }

    public void hasWaterBasedSustenance() {

    }
}
