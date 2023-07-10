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
            for (int j = 2; j < primeArr[i]; j++) {
                if (primeArr[i] % j == 0) {
                    arrayPrime = false;
                }
            }
        }
        System.out.println("Exiting isArrayPrimeIter");
        return arrayPrime;
    }

    public boolean IsArrayPrimeRecur(int[] primeArr, int size) {
        int i = 0;
        boolean isPrime = true;
        if (i < size) {
            int divisor = 2;
            isPrime = IsPrimeRecur(primeArr[i], divisor);
        }
        System.out.println("Exiting IsArrayPrimeRecur");
        return isPrime;
    }

    private boolean IsPrimeRecur(int numberCheck, int divisor) {
        System.out.println("Enter IsArrayPrimeRecur");
        boolean isPrime = true;

        if (numberCheck <= 1) {
            isPrime = false;
        }

        if (divisor < numberCheck) {
            if (numberCheck % divisor == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}
