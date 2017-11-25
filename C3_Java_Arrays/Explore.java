public class Explore {

	public static void main(String[] args) {
		// Create new friends array using the array literal shortcut.
		// Include Ben, Alena, Pasan
		String[] friends = {"Ben", "Alena", "Pasan"};
		for (String friend : friends) {
			System.out.printf("Hey %s! This movie starts at 7, C U there! %n",
				friend);
		}
	}

}