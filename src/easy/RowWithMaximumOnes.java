package easy;

public class RowWithMaximumOnes {

    public int[] rowAndMaximumOnes(int[][] mat) {

        int[] res = {0, 0};
        int maxOnes = 0;
        int temp = 0;

        for (int x = 0; x < mat.length; x++) {
            temp = 0;
            for (int y = 0; y < mat[x].length; y++) {
                if (mat[x][y] == 1) {
                    temp++;
                    if (maxOnes < temp) {
                        maxOnes = temp;
                        res[0] = x;
                        res[1] = maxOnes;
                    }
                }

            }
        }

        return res;
    }
}
