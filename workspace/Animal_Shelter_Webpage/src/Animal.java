
/**
 * abstract superclass with the instance variables that apply to all it´s subclasses
 *
 * @author Liigah
 */
public abstract class Animal {
    //instance variables

    public String name;
    public int age;
    public float weight;
    public String breed;
    public int timePlayed;

    public Animal(String name, int age, float weight, String breed) { //constructor
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        timePlayed = 0;
    }

    /**
     * abstract method to get the name of the animal
     *
     * @return
     */
    public abstract String getName();

    {

    }

    /**
     * method to get the breed of the animal
     *
     * @return returns the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * method to get the age of the animal
     *
     * @return returns the age
     */
    public int getAge() {
        return age;
    }

    /**
     * method for playing with the animal
     *
     * @param min
     */
    public void play(int min) {
        timePlayed = timePlayed + min;
        System.out.println(name + " has played for " + min + " minutes");

    }

    /**
     * method to get the time played with the animal
     * @return returns the time
     */
    public int getTimePlayed() {
        return timePlayed;

    }

    /**
     * method for the animal to sleep
     */
    public void sleep() {
        System.out.println("ZZzzzzz");
    }

    /**
     *method that prints out the actual names of the animals 
     * instead of their reference to the animal objects
     */
    public String toString() {
        return name;
    }
}
