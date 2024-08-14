// 37853058 TP NDOU
import java.util.Random;

public class LoadWord {
    public static MyArrayList<GuessedCharacter> loadWord(MyArrayList<String> words) {
        // create a new random instance
        Random random = new Random();
        
        // Get a random word
        String word = words.get(random.nextInt(words.size()));
        
        MyArrayList<GuessedCharacter> guessWord = new MyArrayList<>();
        
        for (int i = 0; i < word.length(); i++) 
        {
            guessWord.add(i, new GuessedCharacter(word.charAt(i)));
        }
        
        return guessWord;
    }
}