import java.util.ArrayList;

public class Programme {

    public static void main(String[] args){
        System.out.println("test");

//        Dodo dodo1 = new Dodo("Ralph", "Red", 2, 2, false, false, false);
//        System.out.printf("%s%n", dodo1.name);
//        dodo1.procreate(4,3);
//        dodo1.setSurname("The Third");
//        System.out.println(dodo1.getSurname());
//
//        Duck duck1 = new Duck("Donald", "Green", 2, 3, false, true, false);
//        duck1.setSurname("Duck");
//
//        System.out.printf("%s %s%n",duck1.name, duck1.getSurname());

        Aquarium aquarium1 = new Aquarium("oceanAquarium", 5,25);
        Jungle jungle1 = new Jungle("BorneoJungle", 15,45);

        DoctorFish doctorFish1 = new DoctorFish("Dory", "Blue", 0, 3, false, true, false);
        DoctorFish doctorFish2 = new DoctorFish("Dory2", "Blue", 0, 3, false, true, false);

        Dodo dodo1 = new Dodo("Ralph", "Red", 2, 2, false, false, false);

        aquarium1.addAnimal(doctorFish1);
        aquarium1.addAnimal(doctorFish2);
//        aquarium1.addAnimal(dodo1);

        jungle1.addAnimal(dodo1);

        System.out.println(aquarium1.allIwaterBreathableAnimals);
        System.out.println(jungle1.animalsThatLiveOnLand);
    }
}
