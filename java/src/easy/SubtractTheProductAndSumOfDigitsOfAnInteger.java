package easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {

        int prod  = 1;
        int sum = 0;

        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            prod *= i;
            sum += i;
        }
        int res = prod - sum;

        return res;
    }
}
