package _18_Threading.OP_EXC_1_Tim_so_nguyen_to;

class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int number = 2; ; number++) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization: " + number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
