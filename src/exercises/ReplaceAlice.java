package exercises;

import java.util.Scanner;

public class ReplaceAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.print("Enter Search Term: ");
        String searchTerm = input.nextLine();


        int location = sentence.toLowerCase().indexOf(searchTerm.toLowerCase());
        int termLength = searchTerm.length();
        System.out.println("Index of search term: " + location + " and length of string: " + termLength);

        String outSentence = sentence.substring(0, location) + sentence.substring(location + termLength);
        System.out.print("Output: " + outSentence);
    }
}
