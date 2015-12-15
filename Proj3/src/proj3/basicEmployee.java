package proj3;

public class basicEmployee {
	
	// Generic information for all employee classes

	private static String name = "Unknown...";
	private static String last = "Unknown...";
	private static String town = "Unknown...";
	private static String state = "Unknown...";
	private static String zip = "Unknown...";
	private static String add = "Unknown...";
	private static String job = "Unknown...";
	
	//Get methods to allow other classes to read the private information
	// Same for all employee methods.
	
	public static String getName(){
		return name;
	}

	public static String getLast(){
		return last;
	}

	public static String getTown(){
		return town;
	}

	public static String getState(){
		return state;
	}

	public static String getZip(){
		return zip;
	}

	public static String getJob(){
		return job;
	}
	
	public static String getAdd(){
		return add;
	}
}

