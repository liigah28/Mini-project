
/**
 * Abstract subclass of the Animal superclass
 *
 * @author Liigah
 */
public abstract class RunningAnimal extends Animal {

    //instance variables
    int speed = 0;
    int distanceCovered = 0;
    int timeRun = 0;

    //constructor
    public RunningAnimal(String name, int age, float weight, String breed) {
        super(name, age, weight, breed);
        //this.speed = speed;//km/h
        //this.distanceCovered = distanceCovered;
        //this.timeRun = timeRun;

    }

    /**
     * method for getting the distance that the running animals have covered
     *
     * @return distance
     */
    public int getDistanceCovered() {
        return distanceCovered;
    }

    /**
     * method to get how long the running animals have run
     *
     * @return returns the time
     */
    public abstract int getTimeRun();

    /**
     * method to get the speed of the running animals
     *
     * @return returns the speed
     */
    public double getSpeed() {

        if (timeRun > 0) { //if animals have run, their timeRun would be more than 0
            speed = distanceCovered / timeRun; //formula for calculating the speed
        } else {
            speed = 0; //if they have not run at all, then the speed is 0

        }
        return speed;

    }

    /**
     * method for how the running animals move
     *
     * @param min
     * @param distance
     */
    public void run(int min, int distance) {
        distanceCovered += min * distance;
        timeRun += min;
    }
}
