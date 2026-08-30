package easy;

public class ArrangingCoins {

    public static int arrangeCoins(int n) {

        int counter = 0;
        int lvl = 1;

        while (n >= lvl) {
            counter++;
            n -= counter;
            lvl++;
        }

        return counter;
    }
}
