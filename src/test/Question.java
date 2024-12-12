package test;

public class Question {
    public static void main (String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for(int i=0; i< test.length; i++) {
            for(int j=0; j<test[i].length; j++) {
                int element = test[i][j];
                int[] row = test[i];
                if(isDuplicate(row, element)) {
                    test[i][j] = 0;
                }
            }
        }

        System.out.println(test);
    }

    private static boolean isDuplicate(int[] row, int element) {
        int count = 0;
        for(int n : row) {
            if(n==element) count ++;
            if(count > 1) return true;
        }

        return false;
    }
}
