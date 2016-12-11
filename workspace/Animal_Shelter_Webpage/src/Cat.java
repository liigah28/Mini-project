/**
 * Subclass of the Running Animal class with the interface of the Carnivore class
 * @author Liigah
 */
public class Cat extends RunningAnimal implements Carnivore {

        //constructor
	public Cat(String name, int age, int weight, String breed){
		super(name, age, weight, breed);
	}
	
        /**
         * method for the cats to make a sound
         */
	public void meow(){
		System.out.println("Meow! Meow!");
}
        /**
         * method for the cats to climb things
         */
	public void climb(){
	}
	
        /**
         *  method for the cat objects to get the name 
         * @return returns the name
         */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

        /**
         *  method for getting the time that cat objects have run
         * @return returns the time
         */
	@Override
	public int getTimeRun() {
		// TODO Auto-generated method stub
		return timeRun;
	}

        /**
         * override method for the specific way how cat objects eat
         */
	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		
        }

	@Override
	public void carnivore() {
		// TODO Auto-generated method stub
		
	}

}
