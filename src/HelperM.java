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
        System.out.println("Enter IsArrayPrimeRecur");
        int index = 0;
        if (index == size) {
            return true;
        }
        if (!IsPrimeRecur(primeArr[index],2)) {
            return false;
        }
        ++index;
        return isArrayPrimeIter(primeArr, size);
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
