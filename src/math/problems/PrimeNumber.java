package math.problems;

public class PrimeNumber {

  //  public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
  String primeNumbers = "";
        {
            int i = 0;
            int num = 0;
            //Empty String

                //1,000,000 not printing I couldn't figure it out
            for (i = 1; i <= 100; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }

        }
    }



