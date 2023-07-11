import java.util.Arrays;
import java.util.Scanner;

/*
* Lab 1
* Brandon Arriaga
*
* This program checks an array through the use of iteration & recursion to check if all numbers are prime or not.
*
* */

public class Main {
    // Default Array size
    private static final int SORT_MAX_SIZE = 16;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[SORT_MAX_SIZE];

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

       // int[] temp = Arrays.copyOf(array, size);


        System.out.println("Enter element (From 1 to 9999): ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        PrimeFinder primeFinder = new PrimeFinder();

        boolean iterPrime = primeFinder.isArrayPrimeIter(array, size);

        if (iterPrime) {
            System.out.println("Prime Array using iteration");
        } else {
            System.out.println("Not a Prime Array using iteration");
        }

        boolean recurPrime = primeFinder.IsArrayPrimeRecur(array, size);

        if (recurPrime) {
            System.out.println("Prime Array using recursion");
        } else {
            System.out.println("Not a Prime Array using recursion");
        }
    }
}