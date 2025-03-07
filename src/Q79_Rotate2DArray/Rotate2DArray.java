package Q79_Rotate2DArray;

public class Rotate2DArray {

        public static void rotate(int[][] matrix) {
            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                int left = 0;
                int right = n - 1;
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3,1},
                    {4, 5, 6,1},
                    {7, 8, 9,10},
                    {17,18, 19,1},

            };

            System.out.println("Given:");
            printMatrix(matrix);

            rotate(matrix);

            System.out.println("Rotated:");
            printMatrix(matrix);
        }


}
