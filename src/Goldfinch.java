/**
 * This subclass represents a goldfinch
 * @author chessicanation
 * Final Programming Project
 * CS131ON
 */
public class Goldfinch extends Animal implements Walkable, Flyable {

	private double wingSpan;
	
	/**
	 * Empty-argument constructor
	 */
	public Goldfinch() {
		
		super();
		wingSpan = 9.0;
		
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param simID
	 * @param l
	 * @param ws
	 */
	public Goldfinch(int simID, Location l, double ws) {
		
		super(simID, l);
		setWingSpan(ws);
		full = false;
		rested = true;
		
	}//end preferred constructor

	/**
	 * This method simulates the Goldfinch walking
	 * @param direction
	 */
	public void walk(int direction) {
		
		Location newLoc = new Location();
		newLoc = this.getLocation();
		int[] position = newLoc.getCoordinates();
		
		//North
		if(direction==1)
		{
			newLoc.update(position[0], position[1]+1);
			setLocation(newLoc);
		}
			//East
			else if(direction==2)
			{	
				newLoc.update(position[0]+1, position[1]);
				setLocation(newLoc);
			}
			//South
			else if(direction==3)
			{
				newLoc.update(position[0], position[1]-1);
				setLocation(newLoc);
			}
			//West
			else if(direction==4)
			{
				newLoc.update(position[0]-1, position[1]);
				setLocation(newLoc);
			}
			else
				System.out.println("Please enter 1 for North, 2 for East, 3 for South, or 4 for West.");
		
	}//end walk
	
	/**
	 * This method simulates the Goldfinch flying
	 * @param l
	 */
	public void fly(Location l) {
		
		Location newLoc = new Location();
		int[] position = l.getCoordinates();
		newLoc.update(position[0], position[1]);
		setLocation(l);
		
	}//end fly
	
	/**
	 * Getter for wingSpan
	 * @return
	 */
	public double getWingSpan() {
		
		return wingSpan;
	
	}//end getWingSpan

	/**
	 * Setter for wingSpan
	 * @param wingSpan
	 */
	public void setWingSpan(double wingSpan) {
		
		if(wingSpan>=5.0 && wingSpan<=11.0)
			this.wingSpan = wingSpan;
		else 
			this.wingSpan = 9.0;
	
	}//end setWingSpan

	@Override
	public String toString() {
	
		return "Goldfinch [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
				+ ", wingSpan=" + wingSpan + "]";
	
	}//end toString
	
}//end class
