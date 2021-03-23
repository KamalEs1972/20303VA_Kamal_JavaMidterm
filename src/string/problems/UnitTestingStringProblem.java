package string.problems;

import javax.swing.*;
import java.sql.SQLOutput;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here
        System.out.println("\nAnagram  :");
        Anagram obj1 = new Anagram();
        System.out.println("\n**********************************************");

        System.out.println("\nDuplicate Words are :");
        DuplicateWord obj2 = new DuplicateWord();
        obj2.duplicateWords(obj2.st.toLowerCase());
        System.out.println("\n**********************************************");

        System.out.println("\nPalindrome words  :");
        Palindrome obj3 = new Palindrome();
        System.out.println(obj3.isPalindrome("MADAM"));
        System.out.println(obj3.isPalindrome("Forest"));
        System.out.println("\n**********************************************");

        Permutation obj4 = new Permutation();

        System.out.println("\nPermutations for " + obj4.s1 + " are: \n" + obj4.permutationFinder(obj4.s1));
        System.out.println("\n**********************************************");


        }












    }
