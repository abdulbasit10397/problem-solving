package problem4;

/** Works but a very bad solution. A lot of patches */
public class CanPaceFlowersProblem {
    public static void main(String[] args) {
        int[] flowerbed = {0,0};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers = 0;
        if(flowerbed.length ==1 && flowerbed[0] == 0 && n==1) return true;
        if(flowerbed.length==2 && flowerbed[0] == 0 && flowerbed[1] == 0 && n==1) return true;
        if(flowerbed.length==3 && flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2]==0 && n==2) return true;


        for (int i = 1; i < flowerbed.length - 1; i++) {
            if(i-1==0 && flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                flowers++;
                continue;
            }

            if(i+1==flowerbed.length-1 && flowerbed[i+1] == 0 && flowerbed[i] == 0) {
                flowers++;
                continue;
            }

            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowers++;
                i = i+2 == flowerbed.length-1 ? i : ++i;
            }
        }

        return flowers >= n;
    }
}
