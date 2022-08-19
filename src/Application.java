import java.util.*;

/**
 * This class contains a main method to test the
 * Location, Animal, Goldfinch, and BrownBear classes
 * and the Flyable, Walkable, and Swimmable interfaces.
 * @author chessicanation
 * Final Programming Project
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
	
		// *****************************************************************************
		//
		//                                 Location Tests
		//		
		// *****************************************************************************
		
		//testing empty-argument constructor and toString
		Location l1 = new Location();
		System.out.println(l1.toString());
		
		//testing update
		l1.update(2, 3);
		System.out.println(l1.toString());
		
		//testing preferred constructor
		Location l2 = new Location(1,4);
		System.out.println(l2.toString());
		
		//testing getCoordinates
		int[] testCoords = l2.getCoordinates();
		for(int i=0; i<testCoords.length; i++) 
			System.out.print(testCoords[i] + " ");
		
		//separator println
		System.out.println();
		System.out.println();
		
		// *****************************************************************************
		//
		//                                 Animal Tests
		//		
		// *****************************************************************************
		
		//testing empty-argument constructor 
		//(uncomment line below to see that Animal cannot be instantiated)
		//Animal a1 = new Animal();
		
		//instantiating Goldfinch object with Animal reference
		Animal gf1 = new Goldfinch();
		
		//testing getters and setters with simID bounds check
		gf1.setSimID(-4385);
		System.out.println(gf1.getSimID());
		gf1.setSimID(5932);
		System.out.println(gf1.getSimID());
		gf1.setLocation(l1);
		System.out.println(gf1.getLocation());
		gf1.setFull(true);
		System.out.println(gf1.isFull());
		gf1.setRested(false);
		System.out.println(gf1.isRested());
		
		//testing eat
		System.out.println(gf1.eat());
		
		//testing sleep
		System.out.println(gf1.sleep());
		
		//separator println
		System.out.println();
		
		// *****************************************************************************
		//
		//                                 Goldfinch Tests
		//		
		// *****************************************************************************
		
		//testing empty-argument constructor and toString
		Goldfinch gf2 = new Goldfinch();
		System.out.println(gf2.toString());
		
		//testing wingSpan getters and setters with bounds checks
		gf2.setWingSpan(11.6);
		System.out.println(gf2.getWingSpan());
		gf2.setWingSpan(4.9);
		System.out.println(gf2.getWingSpan());
		gf2.setWingSpan(7.3);
		System.out.println(gf2.getWingSpan());
		
		//testing Animal getters and setters with simID bounds check
		gf2.setSimID(-789);
		System.out.println(gf2.getSimID());
		gf2.setSimID(2048);
		System.out.println(gf2.getSimID());
		gf2.setLocation(l1);
		System.out.println(gf2.getLocation());
		gf2.setFull(true);
		System.out.println(gf2.isFull());
		gf2.setRested(false);
		System.out.println(gf2.isRested());
		
		//testing Animal methods
		System.out.println(gf2.eat());
		System.out.println(gf2.sleep());

		//testing walk (north)
		gf2.walk(1);
		System.out.println(gf2.getLocation());
		
		//testing walk (east)
		gf2.walk(2);
		System.out.println(gf2.getLocation());
		
		//testing walk (south)
		gf2.walk(3);
		System.out.println(gf2.getLocation());
		
		//testing walk (west)
		gf2.walk(4);
		System.out.println(gf2.getLocation());
		
		//testing walk (bounds check)
		gf2.walk(6);
		System.out.println(gf2.getLocation());
		
		//testing fly
		gf2.fly(l2);
		System.out.println(gf2.getLocation());
		
		//separator println
		System.out.println();
		
		// *****************************************************************************
		//
		//                                 BrownBear Tests
		//		
		// *****************************************************************************
		
		//testing empty-argument constructor and toString
		BrownBear bb1 = new BrownBear();
		System.out.println(bb1.toString());
		
		//testing subSpecies getters and setters with bounds checks
		bb1.setSubSpecies(null);
		System.out.println(bb1.getSubSpecies());
		bb1.setSubSpecies("Eurasian");
		System.out.println(bb1.getSubSpecies());
		bb1.setSubSpecies("asiatic");
		System.out.println(bb1.getSubSpecies());
		bb1.setSubSpecies("EUROPEAN");
		System.out.println(bb1.getSubSpecies());
		bb1.setSubSpecies("GriZZly");
		System.out.println(bb1.getSubSpecies());
		bb1.setSubSpecies("kOdIaK");
		System.out.println(bb1.getSubSpecies());
		bb1.setSubSpecies("Siberian");
		System.out.println(bb1.getSubSpecies());
		
		//testing Animal getters and setters with simID bounds check
		bb1.setSimID(-123);
		System.out.println(bb1.getSimID());
		bb1.setSimID(7364);
		System.out.println(bb1.getSimID());
		bb1.setLocation(l2);
		System.out.println(bb1.getLocation());
		bb1.setFull(true);
		System.out.println(bb1.isFull());
		bb1.setRested(false);
		System.out.println(bb1.isRested());
		
		//testing Animal methods
		System.out.println(bb1.eat());
		System.out.println(bb1.sleep());
		
		//testing preferred constructor
		BrownBear bb2 = new BrownBear(3298, l1, "European");
		System.out.println(bb2.toString());
		
		//testing walk (north)
		bb2.walk(1);
		System.out.println(bb2.getLocation());
		
		//testing walk (east)
		bb2.walk(2);
		System.out.println(bb2.getLocation());
		
		//testing walk (south)
		bb2.walk(3);
		System.out.println(bb2.getLocation());
		
		//testing walk (west)
		bb2.walk(4);
		System.out.println(bb2.getLocation());
		
		//testing walk (bounds check)
		bb2.walk(8);
		System.out.println(bb2.getLocation());
		
		//testing swim (north)
		bb2.swim(1);
		System.out.println(bb2.getLocation());
		
		//testing swim (east)
		bb2.swim(2);
		System.out.println(bb2.getLocation());
		
		//testing swim (south)
		bb2.swim(3);
		System.out.println(bb2.getLocation());
		
		//testing swim (west)
		bb2.swim(4);
		System.out.println(bb2.getLocation());
		
		//testing swim (bounds check)
		bb2.swim(10);
		System.out.println(bb2.getLocation());
		
		//separator println
		System.out.println();
		
		// *****************************************************************************
		//
		//                                 Generics Tests
		//		
		// *****************************************************************************
		
		//instantiating ArrayList object
		ArrayList<Animal> arList = new ArrayList<Animal>(4);
		
		//adding two Goldfinches and two BrownBears
		arList.add(gf1);
		arList.add(gf2);
		arList.add(bb1);
		arList.add(bb2);
		
		//iterating through the ArrayList and printing the data
		for(Animal eachAnimal : arList)
			System.out.println(eachAnimal.toString());
		
	}//end main

}//end class
