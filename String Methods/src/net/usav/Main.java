package net.usav;

public class Main {
    public static void main(String[] args) {
        String sentence = "There's vomit on his sweater already, mom's spaghetti.";
        System.out.println(sentence);

        System.out.println("\nThe length of this sentence is " + sentence.length() + " characters.");

        System.out.println("\nThe first character is: " + sentence.charAt(0)); // 0-based index
        System.out.println("The last character is: " + sentence.charAt(sentence.length() - 1)); // -1 because the first character is at index 0

        System.out.println("\nThe first word is: " + sentence.substring(0, sentence.indexOf(" "))); // 0-based index
        System.out.println("The last word is: " + sentence.substring(sentence.lastIndexOf(" ") + 1));

        System.out.println("\nThe sentence in uppercase is: " + sentence.toUpperCase());
        System.out.println("The sentence in lowercase is: " + sentence.toLowerCase());

        System.out.println("\nThe word 'spaghetti' is found at position: " + (sentence.indexOf("spaghetti") + 1));

        System.out.println("\n" + sentence.replace("vomit", "puke"));
        System.out.println("Sentence starts with <There's> = " + sentence.startsWith("There's"));
        System.out.println("Sentence ends with <spaghetti.> = " + sentence.endsWith("spaghetti."));

        String s = "";
        boolean isEmpty = s.isEmpty();
        System.out.println("\nIs the string empty? " + isEmpty);

        System.out.println(sentence.contains("spaghetti"));
    }
}