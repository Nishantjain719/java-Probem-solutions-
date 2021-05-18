// sort the array so that whenever A[i] is odd i is odd and when A[i] is even, i is even.
// input: [4,2,5,7] output: [4,5,2,7] space complexity: O[1]

class Soultion12 {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0; // i be the pointer to even indexes
        int j = 1; // j be pointer to odd indexes

        int n = A.length;
        while(i < n && j < n) {
            while(i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while(j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                // in-place sort means don't need to create new Array.
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }

            
        }
        return A;
    }
}