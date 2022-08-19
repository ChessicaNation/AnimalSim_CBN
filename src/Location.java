/**
 * This class encapsulates a point on a simulation map
 * @author chessicanation
 * Final Programming Project
 * CS131ON
 *
 */
public class Location {

	private int xCoord;
	private int yCoord;
	
	/**
	 * Empty-argument constructor
	 */
	public Location() {
		
		xCoord = 0;
		yCoord = 0;
	
	}//end empty-argument constructor

	/**
	 * Preferred constructor
	 * @param x
	 * @param y
	 */
	public Location(int x, int y) {
		
		xCoord = x;
		yCoord = y;
	
	}//end preferred constructor
	
	/**
	 * This method updates the xCoord and yCoord with the
	 * coordinates passed in
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		
		xCoord = x;
		yCoord = y;
		
	}//end update
	
	/**
	 * This method returns an array that contains
	 * the xCoord and yCoord
	 * @return
	 */
	public int[] getCoordinates() {
		
		int[] coordArray = {xCoord, yCoord};

		return coordArray;
		
	}//end getCoordinates

	@Override
	public String toString() {
		
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	
	}//end toString
	
}//end class
