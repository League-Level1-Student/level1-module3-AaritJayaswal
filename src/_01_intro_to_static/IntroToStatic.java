package _01_intro_to_static;

public class IntroToStatic {

	
	public class Athlete {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	    	Athlete jeff = new Athlete("Jeff", 100);
	    	jeff.bibNumber=4;
	    	Athlete bob = new Athlete("Bob", 110);
	        //print their names, bibNumbers, and the location of their race. 
	    	System.out.println(jeff.name + jeff.bibNumber + raceLocation );
	
	    }
	}
	
}
