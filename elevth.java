// Self dividing number Input: left = 1 right = 22
// output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
import java.util.*;
class Soultion11 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> self_diving_nums = new ArrayList<>();

        for (int i=left; i<=right; i++) {
            if (isSelfDividing(i)) self_diving_nums.add(i);
        }

        return self_diving_nums;
    }

    public boolean isSelfDividing(int num) {
        for (char c: String.valueOf(num).toCharArray()) {
            if (c == 0 || num % (c-'0') > 0) {
                return false;
            }
        }
        return true;
    }

}

