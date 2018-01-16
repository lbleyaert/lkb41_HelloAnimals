package lkb41_HelloAnimalsAssign1;

/**
 * Class Fish
 * @author lbley
 * Created: 01/14/18
 */
public class Fish extends Animal {

	/**
	 * Constructor creates an instance of class Fish
	 * @param age - age of fish (inherited)
	 * @param color - color of fish (inherited)
	 * @param weight - weight of fish (inherited)
	 * @param minimumWeight - minimum weight the fish can be (inherited)
	 */
	public Fish(String age, String color, int weight, int minimumWeight) {
		/*because the 'type' is determined by the object we're creating (Fish), the type is not an 
		input of this subclass constructor- so we must define the animal type when calling the animal
		(superclass) constructor - because the user is creating a Fish object, we know the type to be 
		"fish"*/
		super(age, color, "fish", weight, minimumWeight);
	}
	
	/**
	 * The swim method gets the current weight and minimum weight of the fish using getters for 
	 * those superclass properties.  Those values are compared - if the current weight is greater than 
	 * the minimum weight, then the fish swims and its weight is decreased by 1.  If the current weight
	 * isn't greater than the minimum, the user is notified that the fish cannot swim and needs food.
	 */
	public void swim() {
		
		int currentWeight = this.getWeight();
		int minWeight = this.getMinimumWeight();
		if(currentWeight>minWeight) {
			int newWeight = currentWeight - 1;
			this.setWeight(newWeight);
			//System.out.println("Swimming!");
		}else {
			System.out.println("Your fish can't swim, it needs food!");
			
		}
		
	}
	
	
}//end of class Fish
