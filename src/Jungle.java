import java.util.ArrayList;

public class Jungle extends HabitatBase implements IliveOnLand {

    public ArrayList<IliveOnLand> animalsThatLiveOnLand = new ArrayList<>();

    Jungle(String name, double minTemp, double maxTemp) {
        super(name, minTemp, maxTemp);
    }

    public void canLiveOnLand() {

    }

    public void addAnimal(IliveOnLand animal){
        animalsThatLiveOnLand.add(animal);
    }


}
