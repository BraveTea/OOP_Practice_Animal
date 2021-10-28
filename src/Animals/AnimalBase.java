package Animals;

import interfaces.Ialive;

public abstract class AnimalBase implements Ialive {

    public String toString(){ //So if I type this here, all Animals will automatically be printed as a name.
        return name;
    }

    protected String name;
    protected String dominantColour;
    protected int numberOfLegs;
    protected double age;
    protected boolean sentience;
    protected boolean alive;
    public boolean predator;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDominantColour(String dominantColour) {
        this.dominantColour = dominantColour;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setSentience(boolean sentience) {
        this.sentience = sentience;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public String getName() {
        return name;
    }

    public String getDominantColour() {
        return dominantColour;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isAlive() {
        return alive;
    }

    public double getAge() {
        return age;
    }

    public boolean isSentience() {
        return sentience;
    }

    public boolean isPredator() {
        return predator;
    }

    private String surname;

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }


    public void consume() {
        System.out.printf("%s is eating. NomNomNom%n",name);
    }

    public void excrete() {
        System.out.printf("Pooperdeepoop%n");
    }

    public void breathe() {
        System.out.printf("InOutInOut%n");
    }


    public void procreate(double procreationAge) {

        if (name != null) {
            if (age >= procreationAge) {
                System.out.printf("%s is %.2f years old, which is old enough, so now it is time for 'sexy times'%n", name, age);
            } else {
                System.out.printf("%s is only %.2f years old, which isn't old enough to procreate%n" +
                        "Please wait another %.2f years.", name, age, procreationAge - age);
            }
        }
        else {
            System.out.printf("Name was not set%n");
        }
    }
}
