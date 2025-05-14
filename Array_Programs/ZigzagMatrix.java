package Array_Pgms;

public class ZigzagMatrix {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        int num = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Right to left
                for (int j = cols - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
