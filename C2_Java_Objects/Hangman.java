// Link to Trello planning board https://trello.com/b/uMzWKu98/java-course-example-for-development

public class Hangman {

  public static void main(String[] args) {
    // Your incredible code goes here...
  	if (args.length == 0) {
  		System.out.println("Usage:  java Hangman <answer>");
  		System.err.println("answer is required");
  		System.exit(1);
  	} 
  // MY CODE TO GIVE SOME SPACE BETWEEN ANSWER AND GUESSES
      else {
        System.out.printf("%n %n %n %n %n %n %n %n %n %n");
      }
  // END MY ADD-ON CODE
    Game game = new Game(args[0]);
    Prompter prompter = new Prompter(game);
    while (game.getRemainingTries() > 0 && !game.isWon()) {
	    prompter.displayProgress();
	    prompter.promptForGuess();
    }
    prompter.displayOutcome();
  }
}