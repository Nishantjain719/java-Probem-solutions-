/* input: [[1,2],
           [3,4]]
           r = 1, c= 4
    output:[[1,2,3,4]] */
class Solutin42 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;

        if ((rows * columns) != (r * c)) return nums;

        int[][] output_arr = new int[r][c];
        int row_num = 0;
        int cloumn_num = 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                output_arr[row_num][cloumn_num] = nums[i][j];
                cloumn_num++;
                if (cloumn_num == c) {
                    cloumn_num = 0;
                    row_num++;

                }
            }
        }
        return output_arr;
    }
}
