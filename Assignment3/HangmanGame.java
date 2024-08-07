// 37853058 TP NDOU
import java.io.IOException;
import java.util.Scanner;

public class HangmanGame {
    private static MyArrayList<GuessedCharacter> guessWord;
    
    public static void main(String[] args) throws IOException 
    {
        // clear console
        System.out.print("\f");
        
        // Read words
        MyArrayList<String> words = ReadList.readWordsFromFile("words.txt");
        
        // Load a random word
        guessWord = LoadWord.loadWord(words);
        
        // maximum attempts
        int maxAttempts = 6;
        // initial attempts
        
        int attempts = 0;

        while (attempts < maxAttempts && !isWordGuessed(guessWord)) 
        {
            // display
            System.out.println("Secret Word: " + guessWord);
            System.out.println("Attempts left: " + (maxAttempts - attempts));
            
            // user input
            char guess = getUserInput();
            
            // for a correct guess
            boolean correctGuess = processGuess(guessWord, guess);

            if (!correctGuess) 
            {
                attempts++;
            }
        }

        if (isWordGuessed(guessWord)) 
        {
            System.out.println("\nCongratulations! You win!");
        } 
        else 
        {
            System.out.println("\nYou lose! The word was: " + getWordFromGuessableWord(guessWord));
        }
    }
    
    public static boolean isWordGuessed(MyArrayList<GuessedCharacter> guessableWord) 
    {
        for (int i = 0; i < guessWord.size(); i++) 
        {
            if (!guessableWord.get(i).getGuessed()) 
            {
                return false;
            }
        }
        return true;
    }

    public static char getUserInput() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a letter: ");
        return Character.toLowerCase(scanner.next().charAt(0));
    }

    public static boolean processGuess(MyArrayList<GuessedCharacter> guessableWord, char guess) 
    {
        boolean correctGuess = false;
        for (int i = 0; i < guessWord.size(); i++) 
        {
            if (guessableWord.get(i).getCharacter() == guess) 
            {
                guessableWord.get(i).guess(guess);
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    public static String getWordFromGuessableWord(MyArrayList<GuessedCharacter> guessableWord) 
    {
        char[] charArray = new char[guessableWord.size()];
        
        for (int i = 0; i < guessableWord.size(); i++) 
        {
            charArray[i] = guessableWord.get(i).getCharacter();
        }
        return new String(charArray);
    }
}