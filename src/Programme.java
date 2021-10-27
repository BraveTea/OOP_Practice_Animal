public class Programme {

    public static void main(String[] args){
        System.out.println("test");

        Dodo dodo1 = new Dodo("Ralph", "Red", 2, 2, false, false, false);
        System.out.printf("%s%n", dodo1.name);
        dodo1.procreate(4,3);
        dodo1.setSurname("The Third");
        System.out.println(dodo1.getSurname());

        Duck duck1 = new Duck("Donald", "Green", 2, 3, false, true, false);
        duck1.setSurname("Duck");

        System.out.printf("%s %s%n",duck1.name, duck1.getSurname());
    }
}
