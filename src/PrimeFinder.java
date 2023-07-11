public class PrimeFinder {


    public static int index = 0;
    public boolean isArrayPrimeIter(int[] primeArr, int size) {
        System.out.println("Entering isArrayPrimeIter");

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

    public boolean IsArrayPrimeRecur(int[] primeArr, int size) {

        /*
           Prints enter IsArrayPrimeRecur
           if (primeArr index equals to array size)
               Prints exit IsArrayPrimRecur
               returns true
           if (IsPrimeRecur method returns false)
               Prints exit IsArrayPrimRecur
               returns false
           index will increment by 1
           return IsArrayPrimeRecur until conditions meet

         */
        if (index == size) {
            System.out.println("Exiting IsArrayPrimeRecur");

            return true;
        }
        if (!IsPrimeRecur(primeArr[index], 2)) {
            System.out.println("Exiting IsArrayPrimeRecur");

            return false;
        }
        ++index;
        System.out.println("Entering IsArrayPrimeRecur");

        return IsArrayPrimeRecur(primeArr, size);
    }

    private boolean IsPrimeRecur(int numberCheck, int divisor) {

        /*
          if (number to check is less than or equal to 1)
               return false
          if (the divisor by divisor are greater than the number to check)
               return true
          if (the number to check modulo divisor equals to zero)
               return false
          rerun IsPrimeRecur with the number to check from the array given and incrementing divisor

         */
        if (numberCheck <= 1) {
            return false;
        }

        if (divisor * divisor > numberCheck) {
            return true;
        }

        if (numberCheck % divisor == 0) {
            return false;
        }

        return IsPrimeRecur(numberCheck, divisor+1);
    }
}
