// leaf nodes in complete binary tree(heap) = [n/2]+1 to n
// left child = 2*i right child of node i = (2*i)+1
// from largest index non-leaf node(n/2) we start Heapify method
// input: [1,2,3],[9,9,9] output: [1,2,4],[1,0,0,0]
class Solutin42 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i=n-1; i>=0; i++) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_number = new int[n+1];
        new_number[0] = 1;
        return new_number;
    }
}
