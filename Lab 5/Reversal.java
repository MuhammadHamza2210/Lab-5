package reversal;
import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reversedWord = reverseWord(word);
        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }

    public static String reverseWord(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
    }
}
