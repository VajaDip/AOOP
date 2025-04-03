public class practical4{
    public static void main(String[] args) {
        int[][] array1 = {{3,2,1}, {6,5,4}, {9,8,7}};
        int[][] array2 = {{7,8,9}, {4,5,6}, {1,2,3}};

        int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int x = 0; x < array1.length; x++) {
            for (int y = 0; y < array1[x].length; y++) {
                result[x][y] = array1[x][y] + array2[x][y];
            }
        }
        for (int x = 0; x < result.length; x++) {
            for (int y = 0; y < result[x].length; y++) {
                System.out.print(result[x][y]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
