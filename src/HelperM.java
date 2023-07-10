public class HelperM {
    public boolean isArrayPrimeIter(int[] primeArr, int size) {
        boolean arrayPrime = true;

        for (int i = 0; i < size; i++) {
            if (primeArr[i] / i != 0){
                arrayPrime = false;
            }
        }
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
