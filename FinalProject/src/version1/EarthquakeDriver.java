package version1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

//
//"C:\\Users\\micha\\Desktop\\School\\CSC 1060 Java\\Final Project\\significantMonthUSGS.txt"; // This is the hard coded for my test .txt file

public class EarthquakeDriver {
	
	public static void main(String[] args) {
		//Set conditions -------------------------------------
		ArrayList<Event> events = new ArrayList<>();
		String pathFile = "C:\\Users\\micha\\Desktop\\School\\CSC 1060 Java\\Final Project\\significantMonthUSGS.txt";
		File sigMonth = new File(pathFile);
		
		
		//Read file ------------------------------------------
		readFile(events, sigMonth);
		System.out.println("\nCurrently the file contains " + events.size() + " significant events from the last 30 days.\n\n");
				
		//Sort based on user input-----------------------------
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to sort this file? (Y) \n" +
							"Or just print the record as it is now (N)");
		String choice = input.next();
		choice = choice.toLowerCase().trim();
		
		if (choice.equals("y")) {
			System.out.println("------------ Sorting ---------------");
			String sorting = sortType();
			String sortDir = sortDirection();
			sort(events,sorting, sortDir);
			
		}
		else {
		//Print out the results -------------------------------
		System.out.println(" ---------------- Pretty Print Here -----------------");
		prettyPrint(events);
		}
		
		
	}//end main

	
	
	public static void prettyPrint(ArrayList<Event> events) {
		int count = 1;
		System.out.println("\nEvent List");
		for (Event event: events) {
			System.out.println("-------------------- Record - " + count + " --------------------");
			System.out.println("	Magnitude: " + event.getMag() + ", ");
			System.out.println("	Place: " + event.getPlace() + ", ");
			System.out.println("	Time: " + event.getTime() + ", ");
			System.out.println("	URL: " + event.getUrl() + ", ");
			System.out.println("	Title: " + event.getTitle() + ", ");
			System.out.println("	GeoType: " + event.getGeoType() + ", ");
			System.out.println("	Latitude: " + event.getLatitude() + ", ");
			System.out.println("	Longitude: " + event.getLongitude() + ", ");
			System.out.println("	Depth: " + event.getDepth() + ", ");

			
			
			System.out.println("-----------------------------------------------------\n\n\n");
			count++;
		}
	}
	
	
	
	private static void readFile(ArrayList<Event> events, File sigMonth) {
		
		//Declare all variables:
		
		
		
		double mag = 0;
		String place = "";
		double time = 0;
		double updated = 0;
		String url = "";
		String title = "";
		String geoType = "";
		double latitude = 0;
		double longitude = 0;
		double depth = 0;
		
		boolean insideFeatures = false;
		
		//set up high end of numbers to search through
//		int count = 0;
//		int limit = 100; 
		//&& count < limit ---- to be used in while loop for shorter runs of long data
		
		
		
		try { 
			Scanner reader = new Scanner(sigMonth);
			//Run while loop to search through each line
			while (reader.hasNextLine() ) {
				String line = reader.nextLine().trim();
				
				if (line.contains("\"features\"")) {
					insideFeatures = true;
				}
				
				if (insideFeatures) {
					if (line.startsWith("\"mag\"")) {
						mag = Double.parseDouble(line.split(":")[1].replace(",", "").trim());
					}
					else if (line.startsWith("\"place\"")) {
						place = line.split(":")[1].replace("\"", "").replace(",","").trim();
					}
					else if (line.startsWith("\"time\"")) {
				        time = Double.parseDouble(line.split(":")[1].replace(",", "").trim());
				    } 
					else if (line.startsWith("\"updated\"")) {
				        updated = Double.parseDouble(line.split(":")[1].replace(",", "").trim());
				    }
					else if (line.startsWith("\"url\"")) {
				        url = line.split(":")[1].replace("\"", "").replace(",", "").trim();
				    } 
					else if (line.startsWith("\"title\"")) {
				        title = line.split(":")[1].replace("\"", "").replace(",", "").trim();
					}
					else if (line.startsWith("\"type\"")) {
						geoType = line.split(":")[1].replace("\"", "").replace(",", "").trim();
					}
					else if (line.startsWith("\"coordinates\"")) {
				        // coordinates are [longitude, latitude, depth]
				        String coordLine = line.substring(line.indexOf("[") + 1, line.indexOf("]")); // pull full substring - from the start of the bracket to the end
				        String[] parts = coordLine.split(",");
				        longitude = Double.parseDouble(parts[0].trim());
				        latitude = Double.parseDouble(parts[1].trim());
				        depth = Double.parseDouble(parts[2].trim());

				        // now that you have all info, create an Event
				        Event event = new Event(mag, place, time, updated, url, title, geoType, latitude, longitude, depth);
				        events.add(event);
//				        count++;
					}
				
			    }//end if insideFeatures
						
			}//end while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
	}//end readFile
	
	public static void sort(ArrayList<Event> events, String sortType, String sortDir) {
		Scanner input = new Scanner(System.in);

		System.out.println("Sort Type is: " + sortType);
		if (sortType.equals("mag") && sortDir.equals("high")) {
	        // Sort the list by magnitude from high to low
	        events.sort((e1, e2) -> Double.compare(e2.getMag(), e1.getMag()));
	        System.out.println("Sorted by magnitude (high to low).");
	    }
		else if (sortType.equals("mag") && sortDir.equals("low")) {
			//Sort the list by mag from low to high
			events.sort((e1, e2) -> Double.compare(e1.getMag(), e2.getMag()));
		}
		else if (sortType.equals("depth") && sortDir.equals("high")) {
	        // Sort the list by depth from high to low
	        events.sort((e1, e2) -> Double.compare(e2.getDepth(), e1.getDepth()));
	        System.out.println("Sorted by depth (deepest to shallowest).");
		}
		else if (sortType.equals("depth") && sortDir.equals("low")) {
	        // Sort the list by depth from low to high
	        events.sort((e1, e2) -> Double.compare(e1.getDepth(), e2.getDepth()));
	        System.out.println("Sorted by depth (deepest to shallowest).");
		}
		else {
	        System.out.println("Invalid sort type. No sorting applied.");
	        return;
	    }
		
		
		System.out.println("Would you like the full list or just the raw data? (data or full) ");
		String respLen = input.next();
		
		
	    // Print the magnitudes after sorting
	    
    	if (respLen.toLowerCase().trim().equals("data")) {
    		for (Event event : events) {
		    	if (sortType.equals("mag")) {
			        System.out.println(event.getMag());
		    	}
		    	else if (sortType.equals("depth")) {
		    		System.out.println(event.getDepth());
		    	}
		    	else {
		    		System.out.println(event.getTitle());
		    	}
    		}
    	}
    	else {
    		prettyPrint(events);
    	}
	    
		
	}// end of sort
	
	
	public static String sortType() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please pick a feature to sort the events by \n(MAG) / (DEPTH) / (NONE)");
		String userSelect = input.next();
		
		String sortType = userSelect.toLowerCase().trim();
		
		// mag // depth // none
		return sortType;
	}
	public static String sortDirection() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please pick a direction to sort the events by (high) - high to low OR (low) - low to high ");
		String userSelect = input.next();
		
		String sortDir = userSelect.toLowerCase().trim();
		
		// high // low
		return sortDir;
	}
}//end Class
