package OptimizareOOP;

public class LazyNumberDetails {

    private int number;
    private boolean isPrimeCalled;
    private boolean isPrime;
    private boolean isPerfectCalled;
    private boolean isPerfect;
    private boolean isMagicCalled;
    private boolean isMagic;


    public LazyNumberDetails(int number) {
        updateNumber(number);
    }

    public void updateNumber(int number) {
        this.number = number;
        isPrimeCalled = false;
        isPerfectCalled = false;
        isMagicCalled = false;
    }

    public boolean isPrime() {


        if (isPrimeCalled) {
            isPrimeH();
        } else {
            isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number (computed)");
            } else {
                System.out.println(number + " is not a prime number (computed)");
            }
            isPrimeCalled = true;
        }

        return isPrime;
    }

    public void isPrimeH() {

        if (isPrime) {
            System.out.println(number + " (cached) is prime");
        } else {
            System.out.println(number + " (cached) is not prime");
        }

    }

    public boolean isPerfect() {


        if (isPerfectCalled) {
            isPerfectH();
        } else {
            isPerfect = false;
            int sumDiv = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumDiv += i;
                }
            }
            if (sumDiv == number) {
                isPerfect = true;
            }
            if (isPerfect) {
                System.out.println(number + " is a perfect number (computed)");
            } else {
                System.out.println(number + " is not a perfect number (computed)");
            }
            isPerfectCalled = true;
        }

        return isPerfect;
    }

    public void isPerfectH() {

        if (isPerfect) {
            System.out.println(number + " (cached) is a perfect number");
        } else {
            System.out.println(number + " (cached) is not a perfect number");
        }

    }


    public boolean isMagic() {


        if (isMagicCalled) {
            isMagicH();
        } else {
            isMagic = false;
            int copyNum = number;
            int sumCif = 0;
            int sumCif2 = 0;

            while (copyNum != 0) {
                sumCif += copyNum % 10;
                copyNum /= 10;
            }

            if (sumCif == 3 || sumCif == 7 || sumCif == 9) {
                isMagic = true;
            }

            if (sumCif > 9) {
                while (sumCif != 0) {
                    sumCif2 += sumCif % 10;
                    sumCif /= 10;
                }
            }
            if (sumCif2 == 3 || sumCif2 == 7 || sumCif2 == 9) {
                isMagic = true;
            }


            if (isMagic) {
                System.out.println(number + " is a magic number (computed)");
            } else {
                System.out.println(number + " is not a magic number (computed)");
            }
            isMagicCalled = true;
        }

        return isMagic;
    }

    public void isMagicH() {

        if (isMagic) {
            System.out.println(number + " (cached) is a magic number");
        } else {
            System.out.println(number + " (cached) is not a magic number");
        }

    }


}

