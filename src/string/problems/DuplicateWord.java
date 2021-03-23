package string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    public void duplicateWords(String inputString) {

        String[] st = inputString.split(" ");


        // Creating one HashMap with words as key and their count as value
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        // Checking each word
        for (String word : st) {
            // whether it is present in wordCount
            if (wordCount.containsKey(word)) {
                // If it is present, incrementing it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If it is not present, put that word into wordCount with 1 as
                // it's value
                wordCount.put(word, 1);
            }
        }

        // Extracting all keys of wordCount
        Set<String> wordsInString = wordCount.keySet();

        // Iterating through all words in wordCount

        for (String word : wordsInString) {
            // if word count is greater than 1

            if (wordCount.get(word) > 1) {
                // Printing that word and it's count
                System.out.println(word + " : " + " is duplicated "  + wordCount.get(word)+ " times and its length is  " + word.length() );

            }
        }
    }


   // public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming language . Java is also an Island of Indonesia. Java is widely used Language";


    //}

}
