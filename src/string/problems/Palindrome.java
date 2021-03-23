package string.problems;

public class Palindrome  {
     static boolean isPalindrome(String original) {

        char[] data = original.toCharArray();

        int i = 0;
        int j = data.length - 1;

        while (j > i) {

            if (data[i] != data[j]) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }


//    public static void main(String[] args) {
//        /*
//          If a String is reversed and it remains unchanged, that is called a palindrome.
//            Example: MOM, DAD, MADAM are palindromes.
//
//            Write a method to check if a given String is a palindrome or not.
//         */
//
//    }
}
