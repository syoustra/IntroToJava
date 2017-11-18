import java.util.Scanner;

class Prompter {
	private Game game;

	public Prompter(Game game) {
		this.game = game;
	}

	public boolean promptForGuess() {
		Scanner scanner = new Scanner(System.in);
		boolean isHit = false;
		boolean isAcceptable = false;

		do {
			System.out.print("Enter a letter:  ");
			String guessInput = scanner.nextLine();
			try {
				isHit = game.applyGuess(guessInput);
				isAcceptable = true;
			} catch(IllegalArgumentException iae) {
				System.out.printf("%s. Please try again. %n",
				iae.getMessage());
			}
	
		} while(! isAcceptable);
		return isHit;
	}

	public void displayProgress() {
		System.out.printf("You have %d tries left to solve:  %s%n",
			game.getRemainingTries(),
			game.getCurrentProgress());
	}


// MY ATTEMPT .... only difference is the message in the output, and that he did If Winner Else Lose; I did If Loser Else Win
	public void displayOutcome() {
		if (game.getRemainingTries() == 0) {
			System.out.printf("Sorry, you have used all your tries, and still couldn't guess %s. *insert sad trombone here* %n",
				game.getAnswer());
		} else {
			System.out.printf("Congratulations! You guessed the word %s with %d tries remaining. And there was much rejoicing! %n",
				game.getAnswer(),
				game.getRemainingTries());
		}
	}
}