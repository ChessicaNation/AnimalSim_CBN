/**
 * This subclass represents a brown bear
 * @author chessicanation
 * Final Programming Project
 * CS131ON
 */
public class BrownBear extends Animal implements Walkable, Swimmable{

	private String subSpecies;
	
	/**
	 * Empty-argument constructor
	 */
	public BrownBear() {
		
		super();
		subSpecies = "Alaskan";
		
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		
		super(simID, l);
		setSubSpecies(subSpecies);
		full = false;
		rested = true;
		
	}//end preferred constructor

	/**
	 * This method simulates the BrownBear swimming
	 * @param direction
	 */
	public void swim(int direction) {
		
		Location newLoc = new Location();
		newLoc = this.getLocation();
		int[] position = newLoc.getCoordinates();
		
		//North
		if(direction==1)
		{
			newLoc.update(position[0], position[1]+2);
			setLocation(newLoc);
		}
			//East
			else if(direction==2)
			{	
				newLoc.update(position[0]+2, position[1]);
				setLocation(newLoc);
			}
			//South
			else if(direction==3)
			{
				newLoc.update(position[0], position[1]-2);
				setLocation(newLoc);
			}
			//West
			else if(direction==4)
			{
				newLoc.update(position[0]-2, position[1]);
				setLocation(newLoc);
			}
			else
				System.out.println("Please enter 1 for North, 2 for East, 3 for South, or 4 for West.");
	
	}//end swim

	/**
	 * This method simulates the BrownBear walking
	 * @param direction
	 */
	public void walk(int direction) {
				
		Location newLoc = new Location();
		newLoc = this.getLocation();
		int[] position = newLoc.getCoordinates();
		
		//North
		if(direction==1)
		{
			newLoc.update(position[0], position[1]+3);
			setLocation(newLoc);
		}
			//East
			else if(direction==2)
			{	
				newLoc.update(position[0]+3, position[1]);
				setLocation(newLoc);
			}
			//South
			else if(direction==3)
			{
				newLoc.update(position[0], position[1]-3);
				setLocation(newLoc);
			}
			//West
			else if(direction==4)
			{
				newLoc.update(position[0]-3, position[1]);
				setLocation(newLoc);
			}
			else
				System.out.println("Please enter 1 for North, 2 for East, 3 for South, or 4 for West.");
			
	}//end walk
	
	/**
	 * Getter for subSpecies
	 * @return
	 */
	public String getSubSpecies() {
		
		return subSpecies;
	
	}//end getSubSpecies

	/**
	 * Setter for subSpecies
	 * @param subSpecies
	 */
	public void setSubSpecies(String subSpecies) {
		
		if(subSpecies!=null && (subSpecies.equalsIgnoreCase("Alaskan") || subSpecies.equalsIgnoreCase("Asiatic") ||   
				subSpecies.equalsIgnoreCase("European") || subSpecies.equalsIgnoreCase("Grizzly") ||
				subSpecies.equalsIgnoreCase("Kodiak") || subSpecies.equalsIgnoreCase("Siberian")))			
			this.subSpecies = subSpecies;
		else
			this.subSpecies = "Alaskan";
	
	}//end setSubSpecies

	@Override
	public String toString() {
	
		return "BrownBear [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
				+ ", subSpecies=" + subSpecies + "]";
	
	}//end toString

}//end class
