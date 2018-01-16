package lkb41_HelloAnimalsAssign1;

/**
 * Class Mammal
 * @author lbley
 * Created: 01/14/18
 */
public class Mammal extends Animal {

	/**
	 * Constructor creates an instance of class Mammal
	 * @param age - age of the mammal (inherited)
	 * @param color - color of the mammal (inherited)
	 * @param weight - weight of the mammal (inherited)
	 * @param minimumWeight - minimum weight the mammal can be (inherited)
	 */
	public Mammal(String age, String color, int weight, int minimumWeight) {
		/*because the 'type' is determined by the object we're creating (Mammal), the type is not an 
		input of this subclass constructor- so we must define the animal type when calling the Animal
		(superclass) constructor - because the user is creating a Mammal object, we know the type to  
		be "mammal"*/
		super(age, color, "mammal", weight, minimumWeight);
	}
	
	/**
	 * The run method gets the current weight and minimum weight of the mammal using getters for 
	 * those superclass properties.  Those values are compared - if the current weight is greater than 
	 * the minimum weight, then the mammal runs and its weight is decreased by 1.  If the current weight
	 * isn't greater than the minimum, the user is notified that the mammal cannot run and needs food.
	 */
	public void run() {
		
		int currentWeight = this.getWeight();
		int minWeight = this.getMinimumWeight();
		if(currentWeight>minWeight) {
			int newWeight = currentWeight - 1;
			this.setWeight(newWeight);
			//System.out.println("Running!");
		}else {
			System.out.println("Your mammal can't run, it needs food!");
			
		}
		
	}

}//end of class Mammal
