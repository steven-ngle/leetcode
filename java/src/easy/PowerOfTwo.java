package easy;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        boolean b = false;

        if (n == 1) {
            return true;
        } else {
            for (int i = 1; i < 1000000000; i = i*2) {
                if (2*i == n) {
                    b = true;
                    return b;
                }
            }
        }
        return b;
    }
}
