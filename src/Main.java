import Prog1Tools.IOTools; 

public class Main {

	public static void main(String[] args) {

		double kapital, zinsen, prozentsatz;
		
		kapital = IOTools.readDouble("Geben Sie den Kapital ein: ");
		zinsen = IOTools.readDouble("Geben Sie Zinsen ein: ");
		prozentsatz = 0;
		
		if (zinsen > 0) {
			
			prozentsatz = zinsen * 100 / kapital;
			
		} else {
			
			System.out.println("Fehler! Zinsen <= 0.");
			
		}
		
		System.out.println("Prozentsatz beträgt: " + prozentsatz + "%");

	}

}
