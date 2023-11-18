package easy;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {
                boolean nextEmpty = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);
                boolean previousEmpty = (i == 0) || (flowerbed[i-1] == 0);

                if (nextEmpty && previousEmpty) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}
