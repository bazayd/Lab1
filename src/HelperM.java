public class HelperM {
    public boolean isArrayPrimeIter(int[] primeArr, int size) {
        System.out.println("Entering isArrayPrimeIter");
        boolean arrayPrime = true;

        // First loop iterating over primeArr (Our array with user's inputted elements)
        for (int i = 0; i < size; i++) {
            // Statement will check individual elements to check for 1
            if (primeArr[i] == 1) {
                arrayPrime = false;
            }
            // Second loop that will check for prime numbers
            for (int j = 2; j < primeArr[i] / 2; j++) {
                if (primeArr[i] % j == 0) {
                    arrayPrime = false;
                    break;
                }
            }
        }
        System.out.println("Exiting isArrayPrimeiter");
        return arrayPrime;
    }

    public boolean IsArrayPrimeRecur(int[] primeArr, int size) {
        int i = 0;
        return IsPrimeRecur(primeArr[i], primeArr[i]);
    }

    private boolean IsPrimeRecur(int numberCheck, int divisor) {
        System.out.println("Enter IsArrayPrimeRecur");

        if (numberCheck / divisor == 1) {
            return true;
        }else {
            return false;
        }

    }
}
