import java.util.*;

public class WordCount {
    public static void main(String args[]) 
    {
        String inputString = "Hello world, this is a test string. Hello world!";
        HashMap<String, Integer> Saloni = countWords(inputString);
        
        System.out.println("Word Count:");
        for (String word : Saloni.keySet()) { 
            System.out.println(word + ": " + Saloni.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String input) {
        HashMap<String, Integer> Saloni = new HashMap<>();
        String[] words = input.split("\\s+"); // Split the input string by whitespace

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) 
            {
               Saloni.put(word, Saloni.getOrDefault(word, 0) + 1);
            }
        }
        return Saloni;
    }
}
