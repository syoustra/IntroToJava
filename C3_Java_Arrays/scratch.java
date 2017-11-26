import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

String[] friends = {
	"Treasure",
	"Ben",
	"Alena",
	"Pasan",
	"Craig"
};


public String pickLunchSpot(String... spots) {
	System.out.printf("Randomly picking %d lunch spots. %n",
		spots.length);
	if (spots.length == 0) {
		return "Someplace with tacos";
	}
	Random random = new Random();
	return spots[random.nextInt(spots.length)];
}
