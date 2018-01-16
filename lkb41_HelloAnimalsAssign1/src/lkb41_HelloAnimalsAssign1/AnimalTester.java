package lkb41_HelloAnimalsAssign1;


import java.util.ArrayList;

/**
 * Class AnimalTester
 * @author lbley
 * Created: 01/14/18
 */
public class AnimalTester {

	public static void main(String[] args) {
		

		//create different Animal objects
		Fish fishOne = new Fish("3", "blue", 11, 6);
		Fish fishTwo = new Fish("1", "red", 6, 5);
		
		Mammal mammalOne = new Mammal("10", "gray", 200, 140);
		Mammal mammalTwo = new Mammal("12", "black", 150, 145);
		
		Bird birdOne = new Bird("4", "yellow", 5, 3);
		Bird birdTwo = new Bird("9", "brown", 15, 10);
	
		//add Animal objects to an ArrayList
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(fishOne);
		animalList.add(fishTwo);
		animalList.add(mammalOne);
		animalList.add(mammalTwo);
		animalList.add(birdOne);
		animalList.add(birdTwo);
		
		//make animals eat and move 
		fishOne.eat();
		fishOne.swim();
		fishTwo.eat();
		fishTwo.swim();
		
		mammalOne.eat();
		mammalOne.run();
		mammalTwo.eat();
		mammalTwo.run();
		
		birdOne.eat();
		birdOne.fly();
		birdTwo.eat();
		birdTwo.fly();
		
		
		 /*print final information about the animals using the output method of the Animal class. The
		   enhance for loop uses the output method with each element of the Animal ArrayList until 
		   there are no more objects left */
		for(Animal element: animalList) {
			element.output();
		}
		
	}//end of main

}//end of AnimalTester class
