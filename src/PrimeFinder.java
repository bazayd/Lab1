public class PrimeFinder {


    public static int index = 0;
    public boolean isArrayPrimeIter(int[] primeArr, int size) {
        System.out.println("Entering isArrayPrimeIter");

        // First loop iterating over primeArr (Our array with user's inputted elements)
        for (int i = 0; i < size; i++) {
            // Statement will check individual elements to check for 1
            if (primeArr[i] == 1) {
                System.out.println("Exiting isArrayPrimeIter");
                return false;
            }
            // Second loop that will check for prime numbers
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
        if (index == size) {
            System.out.println("Exiting IsArrayPrimeRecur");

            return true;
        }
        if (!IsPrimeRecur(primeArr[index],2)) {
            System.out.println("Exiting IsArrayPrimeRecur");

            return false;
        }
        ++index;
        System.out.println("Entering IsArrayPrimeRecur");

        return IsArrayPrimeRecur(primeArr, size);
    }

    private boolean IsPrimeRecur(int numberCheck, int divisor) {

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
