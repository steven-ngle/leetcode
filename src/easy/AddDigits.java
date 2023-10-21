package easy;

public class AddDigits {

    public int addDigits(int num) {

        int rest = 0;

        while (num > 9) {
            rest = num % 10;
            num = num / 10 + rest;
        }

        return num;
    }
}
