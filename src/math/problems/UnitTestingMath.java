package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        // Apply unit testing from each class contained within this package, here.
        System.out.println("\nFactorial :");
        Factorial math1 = new Factorial();
        System.out.println(" 5! = " + math1.factorial);
        System.out.println("\n**********************************************");

        System.out.println("\nFibonacci :");
        Fibonacci math2 = new Fibonacci();
       System.out.print("Fibonacci Series of  number 40"+  math2.minNumber  + " numbers:");
        System.out.println("\n**********************************************");

        System.out.print("\nFindLowestDifference :");
        FindLowestDifference math8 = new FindLowestDifference();
        System.out.println(FindLowestDifference.lowestDiff(math8.array1, math8.array2));
        System.out.println("\n**********************************************");

        System.out.print("\nFindMissingNumber :");
        FindMissingNumber math4 = new FindMissingNumber();
        System.out.println("The Missing number is " + math4.miss);
        System.out.println("\n**********************************************");

        System.out.println("\nLowestNumber :");
        LowestNumber math5 = new LowestNumber();
        System.out.println(LowestNumber.getSmallest(math5.array,26));
        System.out.println("\n**********************************************");

        System.out.print("\nPattern:");
        Pattern math7 = new Pattern();

        System.out.println();
        System.out.println("\n**********************************************");

        System.out.print("\nPrimeNumber :");
        PrimeNumber math6 = new PrimeNumber();
        System.out.println(math6.primeNumbers);
        System.out.println("\n**********************************************");










    }
}
