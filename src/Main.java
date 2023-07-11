import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/*
* Lab 1
* Authors: Brandon Arriaga, Nicholas Kang
*
*
*  Find out if an array are all prime numbers through using iteration and recursion
*
* */

public class Main {
    // Default Array size
    private static final int SORT_MAX_SIZE = 16;
    public static int index = 0;

    public static boolean isArrayPrimeIter(int[] primeArr, int size) {
        System.out.println("Entering isArrayPrimeIter");

          /*
        This method iterates over an array of integers to check for prime numbers
        Pre: primeArr - a non-empty array of integer numbers
             size - the size of the array
             Entering isArrayPrimeIter
         Post:
            Return: true or false
            Print:  Exiting IsArrayPrimeIter
         */
        /*
            loop (i = 0 and i less than array's size)
                if (array index is equal to 1)
                    Print Exit function isArrayPrimeIter
                    returns false
                loop ends if (index = 1)
                loop (j = 2 and j less than array index)
                    if (array index modulo j is equal to 0)
                        Print exit function isArrayPrimeIter
                        return false
                loop ends if (index mod j = 0)

             Otherwise, method will print exit function isArrayPrimIter and return true
         */
        for (int i = 0; i < size; i++) {
            if (primeArr[i] == 1) {
                System.out.println("Exiting isArrayPrimeIter");
                return false;
            }
            for (int j = 2; j < primeArr[i]; j++) {
                if (primeArr[i] % j == 0) {
                    System.out.println("Exiting isArrayPrimeIter");
                    return false;
                }
            }
        }
        System.out.println("Exiting isArrayPrimeIter");
        return true;
    }


    public static boolean IsArrayPrimeRecur(int[] primeArr, int size) {

        /*
        This helper method uses recursion with helper method IsPrimeRecur to check array's elements for prime numbers
        Pre: primeArr - A non-empty array of integer numbers
             size - The size of the array
             Entering IsArrayPrimeRecur
         Post:
           Return: true or false
           Exiting IsArrayPrimeRecur
         */

        /*
           Prints enter IsArrayPrimeRecur
           if (primeArr index equals to array size)
               All elements verified
               Prints exit IsArrayPrimRecur
               returns true
           if (IsPrimeRecur method returns false)
               Prints exit IsArrayPrimRecur
               returns false
           index will increment by 1
           return IsArrayPrimeRecur until conditions meet

         */
        System.out.println("Entering IsArrayPrimeRecur");
        if (index == size) {
            System.out.println("Exiting IsArrayPrimeRecur");

            return true;
        }
        if (!IsPrimeRecur(primeArr[index], 2)) {
            System.out.println("Exiting IsArrayPrimeRecur");

            return false;
        }
        ++index;

        return IsArrayPrimeRecur(primeArr, size);
    }

    private static boolean IsPrimeRecur(int numberCheck, int divisor) {
        /*
        This method does the checking for prime numbers of IsArrayPrimeRecur's array through recursion
        Pre: numberCheck - the number/element from primeArr to check
             divisor - the number to divide numberCheck by
         Post:
             Return: true or false
             rerun IsPrimeRecur within IsPrimeRecur until conditions are met in IsArrayPrimeRecur
         */

        /*
          if (number to check is less than or equal to 1)
               return false
          if (the divisor by divisor are greater than the number to check)
               return true
          if (the number to check modulo divisor equals to zero)
               return false
          rerun IsPrimeRecur with the number to check from the array given and incrementing divisor

         */
        System.out.println("Entering IsPrimeRecur");
        if (numberCheck <= 1) {
            System.out.println("Exiting IsPrimeRecur");
            return false;
        }

        if (divisor * divisor > numberCheck) {
            System.out.println("Exiting IsPrimeRecur");
            return true;
        }

        if (numberCheck % divisor == 0) {
            System.out.println("Exiting IsPrimeRecur");
            return false;
        }
        return IsPrimeRecur(numberCheck, divisor / 2);
    }

    // Main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[SORT_MAX_SIZE];

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        System.out.println("Enter element (From 1 to 9999): ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        boolean iterPrime = isArrayPrimeIter(array, size);

        if (iterPrime) {
            System.out.println("Prime Array using iteration");
        } else {
            System.out.println("Not a Prime Array using iteration");
        }

        boolean recurPrime = IsArrayPrimeRecur(array, size);

        if (recurPrime) {
            System.out.println("Prime Array using recursion");
        } else {
            System.out.println("Not a Prime Array using recursion");
        }
    }
}