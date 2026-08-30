package medium;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int water = 0;

        while (left < right) {

            if (height[left] >= height[right]) {
                water = (right - left) * height[right];
                if (water > maxArea) {
                    maxArea = water;
                }
                right--;
            } else if (height[right] >= height[left]) {
                water = (right - left) * height[left];
                if (water > maxArea) {
                    maxArea = water;
                }
                left++;
            } else {
                left++;
                right--;
            }
        }

        return maxArea;
    }
}
