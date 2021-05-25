// given 2D matrix rotate the image by 90 degrees(clockwise)
/* i = 0; j = 0;
   temp = matrix[0][0]; // 1
   matrix[0][0] = matrix[0][0]; // 1
   matrix[0][0] = temp; // 1
   
   i = 0; j= 1;
   temp = matrix[0][1]; // 2
   matrix[0][1] = matrix[1][0]; // matrix[1][0] = 4 so 2 and 4 swap;
   matrix[1][0] = temp; so on continue
   the idea was (1)fist transpose the matrix and (2)flip it horizontally.
  [
   [1, 2, 3],
   [4, 5, 6],
   [7, 8, 9]
   ]
   
   1 4 7
   2 5 8
   3 6 9
   
   7 4 1
   8 5 2
   9 6 3 */
class Solutin42 {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        for (int i=0; i<N; i++) {
            for (int j=i; j<N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=i; j<(N/2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }

    }
}
