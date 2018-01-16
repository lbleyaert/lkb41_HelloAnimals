package lkb41_HelloAnimalsAssign1;

/**
 * Class Bird
 * @author lbley
 * Created: 01/14/17
 */
public class Bird extends Animal {

	
	/**
	 * Constructor creates an instance of class Bird
	 * @param age - age of the bird (inherited)
	 * @param color - color of the bird (inherited)
	 * @param weight - weight of the bird (inherited)
	 * @param minimumWeight -minimum weight the bird can be (inherited)
	 */
	public Bird(String age, String color, int weight, int minimumWeight) {
		/*because the 'type' is determined by the object we're creating (Bird), the type is not an 
		input of this subclass constructor- so we must define the animal type when calling the Animal
		(superclass) constructor - because the user is creating a Bird object, we know the type to  
		be "bird"*/
		super(age, color, "bird", weight, minimumWeight);
	}
	
	/**
	 * The fly method gets the current weight and minimum weight of the bird using getters for 
	 * those superclass properties.  Those values are compared - if the current weight is greater than 
	 * the minimum weight BY AT LEAST TWO, then the bird flies and its weight is decreased by 2.  If
	 * the current weight isn't greater than the minimum (or is only greater than the minimum by 1),
	 * the user is notified that the bird cannot fly and needs food.*/
	public void fly() {
		
		int currentWeight = this.getWeight();
		int minWeight = this.getMinimumWeight();
		if(currentWeight>(minWeight +1)) {
			int newWeight = currentWeight - 2;
			this.setWeight(newWeight);
			//System.out.println("Flying!");
		}else {
			System.out.println("Your bird can't fly, it needs food!");
			
		}
		
	}
	
	
}//end of class Bird
