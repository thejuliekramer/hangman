public class Hangman {
  public static void main (String[] args) {
    Game game = new Game("answer");
    Prompter prompter = new Prompter(game);
    prompter.displayProgress();
    boolean isHit = prompter.promptForGuess();
    if (isHit) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    prompter.displayProgress();
  }
}
