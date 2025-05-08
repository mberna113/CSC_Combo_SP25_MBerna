package version2;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class WeatherDriver {

	
	/// https://api.weather.gov/gridpoints/CYS/73,15/forecast
	///
	///This is the website to look up weather for Ault. 
	///
	///
	///
	///
	///File myFile = "https://api.weather.gov/gridpoints/CYS/73,15/forecast"
	
	
	public static void main(String[] args) {
		ArrayList<Weather> weatherAL = new ArrayList<>();
		
		File myFile = "https://api.weather.gov/gridpoints/CYS/73,15/forecast";
			

		
		try {
			
			URI uri = URI.create("https://api.weather.gov/gridpoints/CYS/73,15/forecast");
			URL url = uri.toURL();

			Scanner reader = new Scanner(url.openStream());
			
			ArrayList<Weather> myList = readFile(weatherAL, reader);
			reader.close();
			
//			System.out.println(Arrays.toString(myList));
			System.out.println(myList.get(0));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		System.out.println("Number of events: " + weatherAL.size());
		
//		prettyPrint(events);
	}//end main
	
	
	
	
	private static ArrayList<Weather> readFile(ArrayList<Weather> weatherAL, Scanner reader) {
		
		//Declare all variables:
		String name = "";
		double temp = -999;
		
		
		//Run while loop to search through each line
		while (reader.hasNextLine() ) {
			String line = reader.nextLine().trim();
			
			if (line.startsWith("\"name\"")) {
				name = line.split(":")[1].replace("\"", "").replace(",","").trim();
			}
			else if (line.startsWith("\"temp\"")) {
				temp = Double.parseDouble(line.split(":")[1].replace(",", "").trim());
			}
			
			
			if (name != null && temp != -999) {
				// now that you have all info, create an Event
		        Weather weather = new Weather(name, temp);
		        weatherAL.add(weather);
		        System.out.println("Weather Added");
			}
			
			
			
					
		}//end while
		
		
		
		
		return weatherAL;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}//end class
