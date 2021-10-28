import Animals.*;
import Habitats.*;

public class Programme {

    public static void main(String[] args){
        System.out.println("test");


        Aquarium aquarium1 = new Aquarium("oceanAquarium", 5,25);
        Jungle jungle1 = new Jungle("BorneoJungle", 15,45);

        DoctorFish doctorFish1 = new DoctorFish("Dory", "Blue", 0, 3, false, true, false);
        DoctorFish doctorFish2 = new DoctorFish("Dory2", "Blue", 0, 3, false, true, false);

        Dodo dodo1 = new Dodo("Ralph", "Red", 2, 2, false, false, false);

        Duck duck1 = new Duck("Darkwing", "white", 2, 30, true, true, false);

        aquarium1.addAnimal(doctorFish1);
        aquarium1.addAnimal(doctorFish2);

        jungle1.addAnimal(dodo1);
        jungle1.addAnimal(duck1);

        System.out.println(aquarium1.animals);
        System.out.println(jungle1.animals);

        duck1.consume();

        if (duck1.isPredator() == false) {
            System.out.printf("%s is not a predator%n", duck1.getName());
        }

        //TODO dit moet ik nog uitwerken, want dit werk niet :(
//        for (int i =0; i<jungle1.animals.size(); i++){
//            if (jungle1.animals.get(i).isPredator()){
//                System.out.printf("Do not add prey%n");
//            }
//            else    System.out.println("Go ahead");
//        }
    }
}
