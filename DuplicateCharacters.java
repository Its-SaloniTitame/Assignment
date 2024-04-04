// import java.util.HashMap;

// public class DuplicateCharacters {
//     public static void main(String[] args) {
//         String inputString = "hello world";
//         HashMap<Character, Integer> charCountMap = countCharacters(inputString);
        
//         // Print the duplicate characters
//         System.out.println("Duplicate Characters:");
//         for (char ch : charCountMap.keySet()) {
//             if (charCountMap.get(ch) > 1) {
//                 System.out.println(ch);
//             }
//         }
//     }

//     public static HashMap<Character, Integer> countCharacters(String input) {
//         HashMap<Character, Integer> charCountMap = new HashMap<>();

//         input = input.toLowerCase();
//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);
//             if (Character.isLetter(ch)) { 
//                 charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
//             }
//         }
//         return charCountMap;
//     }
// }
public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "hello world";
        findDuplicateCharacters(inputString);
    }

    public static void findDuplicateCharacters(String input) {
        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Initialize an array to track character occurrences
        int[] charCount = new int[26]; // Assuming only lowercase alphabets are considered
        
        // Count occurrences of each character in the string
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']++;
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) ('a' + i));
            }
        }
    }
}
