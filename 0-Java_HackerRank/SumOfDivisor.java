package Java_HackerRank;

class SumOfDivisor {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum + n;
    }

    public static void main(String[] args) {

    }
}