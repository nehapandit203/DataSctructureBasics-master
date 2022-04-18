package problems;

import java.util.Arrays;
import java.util.List;

public class ValidSequence {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> seq = Arrays.asList(1, 6, -1, 10);
        boolean validorNot = isValidSubsequence(array, seq);
        System.out.println(validorNot);

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int pos = 0;

        for (int i = 0; i < array.size(); i++) {
            if (sequence.get(pos) == array.get(i)) {
                pos++;
            }
            if (pos == sequence.size())
                return true;
        }
        return false;
    }
}
