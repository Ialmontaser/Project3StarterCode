////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number)
// 
//  Project:  NCRoutes
//  File:     City
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////

public class City implements Comparable<City>
{
	private String city;	 // City name
	private double gpsX;	 // Longitide in degrees
	private double gpsY;	 // Latitide in degrees
	private int population;	 // Population size
	private int vertIndex;	 // index in the Vertex ArrayList

	/** Construct a City object and initialize the instance variables */

	public City (String name, double x, double y, int size, int index)
	{
		// add code
	}

	/** Return the City name */

	public String getCity()
	{
		// add code
	}

	/** Return the City longitude */

	public double getLongitude()
	{
		// add code
	}

	/** Return the City latitude */

	public double getLatitude()
	{
		// add code
	}

	/** Return the City poulation */

	public int getPopulation()
	{
		// add code
	}

	/** Return the City index in the vertex ArrayList */

	public int getIndex()
	{
		// add code
	}

	/** Set the City index of the vertex ArrayList */

	public void setIndex (int index)
	{
		// add code
	}

	/** Compare the City poulations */

	@Override
	public int compareTo (City c)
	{
		// add code	
	}

	/** Return true, when the City names are the same */

	@Override
	public boolean equals (Object c)
	{
		// add code
	}

	/**
	 * Return the City info as a String
	 * Example: Mars Hill: [1]:[82.55 W, 35.83 N]:(1869)
	 * Round the GPS coordinates to 2 decimal places for display
	 */

	public String printCity()
	{
		// add code as above
	}

	/** Return the City name as a String */

	public String toString()
	{
		// add code
	}
}

