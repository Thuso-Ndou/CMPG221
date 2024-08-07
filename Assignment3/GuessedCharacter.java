// 37853058 TP NDOU
public class GuessedCharacter {
    private char character;
    private boolean guessed;
  
    public GuessedCharacter(char character) {
      this.character = character;
      this.guessed = false;
    }
  
    public char getCharacter() {
      return this.character;
    }
  
    public boolean getGuessed() {
      return this.guessed;
    }
  
    public void guess(char guess) {
      this.guessed = guess == character;
    }
  
    @Override
    public String toString() {
      return guessed ? String.valueOf(character) : "_";
    }
  } 
