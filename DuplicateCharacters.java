import java.util.HashMap;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "hello world";
        findDuplicateCharacters(inputString);
    }

    public static void findDuplicateCharacters(String input) {
       
        input = input.toLowerCase();

        
        int[] charCount = new int[26]; 
        
       
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']++;
            }
        }

       
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) ('a' + i));
            }
        }
    }
}
