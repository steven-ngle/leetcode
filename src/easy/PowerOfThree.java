package easy;

public class PowerOfThree {
    // EASY
    public boolean isPowerOfThree(int n) {

        if (n == 0) {
            return false;
        }

        for (int i = 0; i < 20; i++) {
            if (Math.pow(3, i) == n) {
                return true;
            }
        }
        return false;
    }
}
