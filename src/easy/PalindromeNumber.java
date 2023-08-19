package easy;

public class PalindromeNumber {

    int reversedInt = 0;
    boolean b = true;
    public boolean isPalindrome(int x) {

        if (x < 0) {
            b = false;
        } else {
            reverseInt(x);
        }
        if (x == reversedInt) {
            return b;
        } else {
            return b = false;
        }
    }
    public int reverseInt(int i) {

        while (i != 0) {
            int rest = i % 10;
            i = i / 10;
            reversedInt = reversedInt * 10 + rest;
        }
        return reversedInt;
    }
}
