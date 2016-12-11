
/**
 * Subclass of the Animal superclass
 *
 * @author Liigah
 */
public class Reptile extends Animal {

    //constructor
    public Reptile(String name, int age, int weight, String breed) {
        super(name, age, weight, breed);
        // TODO Auto-generated constructor stub
    }

    /**
     *  method for the Reptile objects to get the name     
     * @return returns the name
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

}
