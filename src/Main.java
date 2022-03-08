import Prog1Tools.IOTools; 

public class Main {

	public static void main(String[] args) {

		double kapital, zinsen, prozentsatz;
		
		kapital = IOTools.readDouble("Geben Sie den Kapital ein: ");
		zinsen = IOTools.readDouble("Geben Sie Zinsen ein: ");
		prozentsatz = 0;
		
		if (kapital <= 0 || zinsen <= 0) {
			System.out.println("Fehler! Zinsen <= 0.");
		} else {
			prozentsatz = zinsen * 100 / kapital;
			System.out.println("Prozentsatz beträgt: " + prozentsatz + "%");
		}
		
	}

}
