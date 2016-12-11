
import secure.Adoption_Form;
import java.util.ArrayList;
import secure.Submission;

public class AnimalShelter {

    /**
     * The class with the main method
     *
     * @param args that include new animal objects that are added to an
     * ArrayList
     *
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dog dog1 = new Dog("Jenny", 1, 13, "Rotweiler");
        Dog dog2 = new Dog("Sam", 3, 34, "Bulldog");
        Cat cat1 = new Cat("Max", 2, 4, "Siamese");
        Bunny bunny1 = new Bunny("Lilly", 5, 1, "English Angora");
        Snake snake1 = new Snake("Bo", 2, 3, "Corn snake");
        Tortoise tortoise1 = new Tortoise("Didi", 4, 7, "Russian tortoise");
        Snake snake2 = new Snake("Red", 2, 2, "Rosy Boa");

        bunny1.graze();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(bunny1);
        animals.add(new Dog("Suzy", 6, 15, "Poodle"));
        animals.add(new Cat("Roxy", 2, 8, "Persian"));
        animals.add(new Bunny("Bobby", 2, 5, "American"));
        animals.add(snake1);
        animals.add(snake2);
        animals.add(tortoise1);
        animals.remove(tortoise1);
        animals.add(new Snake("Lila", 1, 20, "Python"));

        /**
         * method to get the size of the animals returns the size
         */
        int theSize = animals.size();
        //System.out.println(theSize);

        /**
         * method that returns the position of the animal in the ArrayList
         */
        int index = animals.indexOf(cat1);
        //System.out.println(index);

        //System.out.println(animals);
        boolean notDone = true;
        /**
         * while loop that gives the options to the users to choose from
         */
        while (notDone) {
            System.out.println("Welcome to the Animal Shelter! We can offer to you the following activities:");
            System.out.println("adopt: You can adopt an animal from our shelter.");
            System.out.println("leave: You can leave an animal in our shelter.");
            System.out.println("walk: You can walk a dog.");
            System.out.println("play: You can play with an animal.");
            System.out.println("quit: You want to quit the program");

            String choice = TextIO.getlnString();
        /**
         * switch statement that allows possible execution paths based on the user input
         */
            switch (choice) {
                case "adopt":
                    new Adoption_Form().setVisible(true);
                    //Animal a = adoptAnimal();
                    //animals.add(a);
                    break;
                case "leave":
                    Animal b = leaveAnimal();
                    animals.add(b);
                    break;
                case "walk":
                    System.out.println("Great! You want to walk one or more of our dogs!");
                    break;
                case "play":
                    System.out.println("Awesome! Let�s go and play with some animals!");
                    break;
                case "print":
                    for (Animal an : animals) {
                        System.out.println(an);
                    }
                case "quit":
                    System.out.println("Thank you for your time and have a nice day!");
                    break;
                default:
                    System.out.println("I am sorry, but it seems you entered an invalid name.");
                    break;
            }
        }
    }
    /**
     * method for adopting an animal
     * opens the GUI interface 
     */
    public static void adoptAnimal() {
        Animal a = new Dog ("Jenny", 1, 13, "Rotweiler");
		/*System.out.println("Fantastic! What kind of animal would you like to adopt?");
		System.out.println("At the moment the shelter can offer:\n dog,\n cat,\n bunny,\n tortoise,\n snake.\n");
		String choice = TextIO.getlnString();
		if (choice.equalsIgnoreCase("dog")){
			
			System.out.println("Great! You want to adopt a dog!");
		}else if (choice.equalsIgnoreCase("cat")){
			System.out.println("Great! You want to adopt a cat!");
		}else if (choice.equalsIgnoreCase("bunny")){
			System.out.println("Great! You want to adopt a bunny!");
		}else if (choice.equalsIgnoreCase("tortoise")){
			System.out.println("Great! You want to adopt a tortoise!");
		}else if (choice.equalsIgnoreCase("snake")){
			System.out.println("Great! You want to adopt a snake!");
		}else {
			System.out.println("Hmm... Seems like there was a mistake. Try to enter the name of the chosen animal again.");
				
		}*/
        new Adoption_Form().setVisible(true); //when you write "adopt", the Adoption_Form JFrame pops up

    }

    /**
     * method for leaving an animal at the animal shelter if/else if/ else
     * statements provide the replies based on the user input
     *
     * @return
     */
    public static Animal leaveAnimal() {
        Animal b = new Dog("Jenny", 1, 13, "Rotweiler");
        System.out.println("Ok, you want to leave an animal in our shelter. What kind of animal is it?");
        System.out.println("You want to leave a:\n dog,\n cat,\n bunny,\n tortoise,\n snake.\n");
        String choice = TextIO.getlnString();
        if (choice.equalsIgnoreCase("dog")) {
            System.out.println("You want to leave a dog at our shelter.");
        } else if (choice.equalsIgnoreCase("Cat")) {
            System.out.println("You want to leave a cat at our shelter.");
        } else if (choice.equalsIgnoreCase("bunny")) {
            System.out.println("You want to leave a bunny at our shelter.");
        } else if (choice.equalsIgnoreCase("tortoise")) {
            System.out.println("You want to leave a tortoise at our shelter.");
        } else if (choice.equalsIgnoreCase("snake")) {
            System.out.println("You want to leave a snake at our shelter.");
        } else {
            System.out.println("Hmm... Seems like there was a mistake. Try to enter the name of the chosen animal again.");
        }
        return b;
    }

}
/**
 * method for playing with an animal in the shelter
 * if/else if/else statements provide possible executions based on the user input
 */	
/*public static Animal playAnimal(){
      String userInput;

		System.out.println("Which animal would you like to play with?");
		userInput = TextIO.getln();
		if(userInput.equalsIgnoreCase("Dog")){
				System.out.println("We have two dogs at the moment - " + dog1.getName() + " and " + dog2.getName() + ".");
				System.out.println("Which dog would you like to see?");
				userInput = TextIO.getln();
				if (userInput.equalsIgnoreCase(dog1.getName())) {
					System.out.println("OK, let�s go see " + dog1.getName() + "!");
					System.out.println(dog1.getName() + " is a " + dog1.getBreed()+ " and is " + dog1.getAge() + " years old.");
				}else {
					System.out.println("OK, let�s go see " + dog2.getName() + "!");
					System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " and is " + dog2.getAge() + " years old.");
				}
		} else if (userInput.equalsIgnoreCase("Cat")){
			System.out.println("We have a cat named " + cat1.getName() + " at the moment.");
		}else if (userInput.equalsIgnoreCase("Bunny")){
			System.out.println("We have a bunny named " + bunny1.getName() + " at the moment.");
		}else {
			System.out.println("Sorry, we don�t have this type of animal at the moment.");

		}

		System.out.println(dog1.getName() + " is " + dog1.getAge() + " year old.");
		System.out.println(bunny1.getName() + " has played for " + bunny1.getTimePlayed() + " minutes.");
		System.out.println(bunny1.getName() + " likes to hop a lot.");
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
		System.out.println(cat1.getName() + " has run for " + cat1.getTimeRun() + " minutes and had a speed of "
				+ cat1.getSpeed() + " km per hour.");
		System.out.println(cat1.getName());

	}

	}*/
