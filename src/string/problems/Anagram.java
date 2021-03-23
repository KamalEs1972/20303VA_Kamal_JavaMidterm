package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */



        public boolean checkAnagram(char[] str1, char[] str2)
        {
// Finding lengths of strings
            int len1 = str1.length;
            int len2 = str2.length;
// If lengths do not match then they cannot be anagrams
            if (len1 != len2)
                return false;
// Sort both strings
            Arrays.sort(str1);
            Arrays.sort(str2);
// Comparing the strings which are sorted earlier
            for (int i = 0; i < len1; i++)
                if (str1[i] != str2[i])
                    return false;
            return true;
        }

        {
          char[] str1 = { 'f', 'r', 'i','e','d'};
          char[] str2 = { 'f', 'i', 'r','e','d'};
            if (checkAnagram(str1, str2))
                System.out.println(" Fired and Fried are" + " anagram of each other");
            else
                System.out.println("Fired and Fried not" + " anagram of each other");
        }
    }
