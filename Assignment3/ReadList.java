// 37853058 TP NDOU
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadList {
    public static MyArrayList<String> readWordsFromFile(String fileName) throws IOException 
    {
        MyArrayList<String> words = new MyArrayList<>();
        
        Scanner scanner = new Scanner(new File(fileName));
        
        int index = 0;
        
        while (scanner.hasNextLine()) 
        {
            words.add(index,scanner.nextLine().trim()); // Add trimmed word to the list
            index++;
        }
        
        scanner.close();
        return words;
    }

    public static void main(String[] args) throws IOException 
    {
        MyArrayList<String> words = readWordsFromFile("words.txt");
    }
}
