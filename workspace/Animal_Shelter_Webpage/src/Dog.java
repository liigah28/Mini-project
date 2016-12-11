
/**
 * Subclass of the RunningAnimal class
 * implements the interface class Carnivore
 *
 * @author Liigah
 */
public class Dog extends RunningAnimal implements Carnivore {

    //constructor
    public Dog(String name, int age, int weight, String breed) {
        super(name, age, weight, breed);
    }

    /**
     * method for the dog to make a sound
     */
    public void bark() {
        System.out.println("Bark! Bark!");

    }

    /**
     *  method for the dog objects to get the name
     *
     * @return returns the name
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    /**
     *  method for getting the time that dog objects have run
     *
     * @return returns the time
     */
    @Override
    public int getTimeRun() {
        // TODO Auto-generated method stub
        return timeRun;
    }

    @Override
    public void carnivore() {
        // TODO Auto-generated method stub

    }

    /**
     *  method for the specific way how dog objects eat
     */
    @Override
    public void eatMeat() {
        // TODO Auto-generated method stub

    }

}
