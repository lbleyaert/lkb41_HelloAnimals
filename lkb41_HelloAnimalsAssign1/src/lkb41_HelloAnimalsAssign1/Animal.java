package lkb41_HelloAnimalsAssign1;

/**
 * Class Animal
 * @author lbley
 * Created: 01/14/18
 */

public class Animal {
	
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
	
	/**
	 * Constructor creates an instance of Animal class
	 * @param age - age of the animal
	 * @param color - color of the animal 
	 * @param weight - weight of the animal 
	 * @param minimumWeight - minimum weight the animal can be
	 */
	public Animal(String age, String color, String type, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	//eat method adds 1 to the object's weight
	public void eat() {
		this.weight += 1;
		//System.out.println("Yum!");
	}
	
	//getter returns the weight of the animal object
	public int getWeight() {
		return weight;
	}
	
	//setter sets the weight of the animal object to the input value
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//getter returns the minimum weight of the animal object (needed for deciding if an animal can move)
	public int getMinimumWeight() {
		return minimumWeight;
	}
	
	/**
	 *The output method prints the information about the Animal object in a formatted manner.  The 
	 *output method first determines what type of animal the object is using if/else if statements.
	 *If the animal is determined to be a fish (by the type- a property of the animal class), then
	 *the type will be printed along with the age, color, current weight, and minimum weight.  If it
	 *is not a Fish object, then it checks to see if the type is Mammal.  If it is not Mammal, type 
	 *Bird will be checked.
	 */
	public void output() {

		if (type.equalsIgnoreCase("fish")) {
			System.out.println("FISH:\tAge: " + age + "\n\tColor: " + color + "\n\tWeight: " + 
		weight + "\n\tMinimum Weight: " + minimumWeight + "\n");
		}else if(type.equalsIgnoreCase("mammal")){
			System.out.println("MAMMAL:\tAge: " + age + "\n\tColor: " + color + "\n\tWeight: " + 
					weight + "\n\tMinimum Weight: " + minimumWeight + "\n");
		}else if(type.equalsIgnoreCase("bird")) {
			System.out.println("BIRD:\tAge: " + age + "\n\tColor: " + color + "\n\tWeight: " + 
					weight + "\n\tMinimum Weight: " + minimumWeight + "\n");
		}else {
			System.out.println("The animal type provided doesn't match one of the three options.");
		}
	}
	
	
}//end of class animal
