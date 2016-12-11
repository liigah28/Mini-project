
public class Bunny extends Animal implements Herbivore {
	//instance variable that is specific to the Bunny class
	int numOfHops;
	
	// constructor
        public Bunny(String name, int age, int weight, String breed){
		super(name, age, weight, breed);
		
	}
	
        /**
         * method for the bunny to hop around
         */
	public void hop(){
		System.out.println("Hop Hop!");
	}

        /**
         *  method for the bunny objects to get the name 
         * @return returns the name
         */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

        /**
         *  method from the interface class Herbivore
         */
	@Override
	public void herbivore() {
		// TODO Auto-generated method stub
		
	}

        /**
         *  method for eating as it has a different method than other animal classes
         */
	@Override
	public void graze() {
		// TODO Auto-generated method stub
		
	}
}
