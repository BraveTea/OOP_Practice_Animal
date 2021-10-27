public abstract class AnimalBase implements iLive {

    protected String name;
    protected String dominantColour;
    protected int numberOfLegs;
    protected double age;
    protected boolean sentience;
    protected boolean alive;
    protected boolean predator;

    //Trying to find out how a constructor works in parent classes.
    AnimalBase(String name, String dominantColour, int numberOfLegs, double age, boolean sentience, boolean alive, boolean predator){
       this.name = name;
       this.dominantColour = dominantColour;
       this.numberOfLegs = numberOfLegs;
       this.age = age;
       this.sentience = sentience;
       this.alive = alive;
       this.predator = predator;
    }

    private String surname;

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }


    public void consume() {
        System.out.printf("NomNomNom%n");
    }

    public void excrete() {
        System.out.printf("Pooperdeepoop%n");
    }

    public void breathe() {
        System.out.printf("InOutInOut%n");
    }


    public void procreate(double currentAge, double procreationAge) {

        if (name != null) {
            if (currentAge >= procreationAge) {
                System.out.printf("%s is %.2f years old, which is old enough, so now it is time for 'sexy times'%n", name, currentAge);
            } else {
                System.out.printf("%s is only %.2f years old, which isn't old enough to procreate%n" +
                        "Please wait another %.2f years.", name, currentAge, procreationAge - currentAge);
            }
        }
        else {
            System.out.printf("Name was not set%n");
        }
    }
}
