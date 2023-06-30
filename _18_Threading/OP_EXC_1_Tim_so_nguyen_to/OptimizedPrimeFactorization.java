package _18_Threading.OP_EXC_1_Tim_so_nguyen_to;

class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int number = 2; ; number++) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization: " + number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 6; i <= sqrt; i += 6) {
            if (number % (i - 1) == 0 || number % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
}