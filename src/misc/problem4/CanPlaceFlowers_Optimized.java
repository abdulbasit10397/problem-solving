package misc.problem4;

/**
 * Optimized Solution for can place flowers problem
 */
public class CanPlaceFlowers_Optimized {
    public static void main(String[] args) {
        int[] flowerbed = {0, 0, 0, 1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(flowerbed, 3));
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowersThatCanBePlanted = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty.
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty.
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    flowersThatCanBePlanted++;
                    if (flowersThatCanBePlanted >= n) {
                        return true;
                    }
                }
            }
        }
        return flowersThatCanBePlanted >= n;
    }
}
