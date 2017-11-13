////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number)
// 
//  Project:  NCRoutes
//  File:     CityRoadMap
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class CityRoadMap<V> extends WeightedGraph<V>
{
	/** Construct an empty road map */

	public CityRoadMap()
	{
	}

	/** Construct a CityRoadMap using cities and roads stored in lists */

	public CityRoadMap (List<V> vertices, List<WeightedEdge> edges)
	{
	    // Let the WeightedGraph superclass build the graph/map
	    // Call the superclass constructor passing in parameters
		
	    // code this line
	}

	/**
	 * Return the neighbors of the City object vertex
	 *    as an ArrayList of City objects
	 */

	public List<V> getNeighbors (V v)
	{
	    // Create the ArrayList to return
		
	    // code this line
                
	    // Find the index of City v
		
	    // code this line

	    // Loop through the neighbors adjacency list of Edges
	    // Then add the adjacent City to the ArrayList to return

	    // code this for each loop that adds adjacent City to ArrayList 

    	    // Return the ArrayList of Vertices (Cities)
	}

	/** Display cities and roads with distances and direction */

	public String printRoads()
	{
	    // Initialize String to return

	    // code this line

	    // Loop through the vertices ArrayList, retrieving the City
	    // vertex and then the corresponding neighbors adjacency list

	    // code this for loop that adds adjacent City to ArrayList

		    // Retrieve the vertex and cast it to a City object
		    
		    // code this line

		    // Call the printCity method of the City object and add to String
		    
		    // code this line

		    // Loop through the neighbors adjacency list for the adjacent City 
	            // retrieving each edge
	    
		    // code this for each loop that adds the edge to the string    	
	    
				// Cast the Edge to a Road and call the Road printRoad method
				
				// code this line

				// Add the method output to the string to return
				
				// code this line
	    // return the String
	}

	/** Display cities with GPS coordinates and population */

	public String printCities()
	{
	    // Initialize String to return

	    // code this line

	    // Loop through the vertices ArrayList, retrieving the City

	    // code this for loop that adds City information to String

			// Retrieve the vertex and cast it to a City object
			
			// code this line
			
			// Call the printCity method of the City object	to get
		
			// code this line

		// return the String
   	}
}
