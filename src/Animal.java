import java.util.Random;

/**
 * This class encapsulates a generic animal that can be subclassed
 * @author chessicanation
 * Final Programming Project
 * CS131ON
 *
 */
public abstract class Animal {

	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	/**
	 * Empty-argument constructor
	 */
	public Animal() {
		
		Location l = new Location();
		
		simID = 0;
		location = l; 
		full = false;
		rested = true;
		
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l) {
		
		this.simID = simID;
		location = l;
		full = false;
		rested = true;
		
	}//end preferred constructor
	
	/**
	 * This method generates a random number between 0 and 1
	 * to determine whether or not the animal is full
	 * @return
	 */
	public boolean eat() {
		
		Random generator = new Random();
		float satiety = generator.nextFloat();
		
		if(satiety<=.5)
			return full = false;
		return full = true;
	}//end eat
	
	/**
	 * This method generates a random number between 0 and 1
	 * to determine whether or not the animal is rested
	 * @return
	 */
	public boolean sleep() {
		
		Random r = new Random();
		float rest = r.nextFloat();
		
		if(rest<=.5)
			return rested = false;
		return rested = true;
	}//end rested

	/**
	 * Getter for simID
	 * @return
	 */
	public int getSimID() {
		
		return simID;
	
	}//end getSimID

	/**
	 * Setter for simID
	 * @param simID
	 */
	public void setSimID(int simID) {
		
		if(simID>0)
			this.simID = simID;
	
	}//end setSimID

	/**
	 * Getter for location
	 * @return
	 */
	public Location getLocation() {
		
		return location;
	
	}//end getLocation

	/**
	 * Setter for location
	 * @param location
	 */
	public void setLocation(Location location) {
		
		this.location = location;
	
	}//end setLocation

	/**
	 * Getter for full
	 * @return
	 */
	public boolean isFull() {
		
		return full;
	
	}//end isFull

	/**
	 * Setter for full
	 * @param full
	 */
	public void setFull(boolean full) {
		
		this.full = full;
	
	}//end setFull

	/**
	 * Getter for rested
	 * @return
	 */
	public boolean isRested() {
		
		return rested;
	
	}//end isRested

	/**
	 * Setter for rested
	 * @param rested
	 */
	public void setRested(boolean rested) {
		
		this.rested = rested;
	
	}//end setRested
	
}//end class
