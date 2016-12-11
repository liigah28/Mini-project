
/**
 * Subclass of the Reptile class that implements the Carnivore interface
 *
 * @author Liigah
 */
public class Snake extends Reptile implements Carnivore {

    //constructor
    public Snake(String name, int age, int weight, String breed) {
        super(name, age, weight, breed);
        // TODO Auto-generated constructor stub
    }

    /**
     *  method for the snake objects to get the name
     *
     * @return returns the name
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    /**
     * method for the specific way a snake moves
     */
    public void slither() {

    }

    @Override
    public void carnivore() {
        // TODO Auto-generated method stub

    }

    /**
     *  method from the Carnivore interface how the Snake object eat
     */
    @Override
    public void eatMeat() {
        // TODO Auto-generated method stub

    }

}
