package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int array[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        // int[] result1=twoSumProblemBruteForce(array,targetSum);

        //int[] result2=twoSumProblemMap(array,targetSum);

        int[] result3 = twoSumProblemsort(array, targetSum);
        System.out.println(result3);

    }

    private static int[] twoSumProblemsort(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum =array[left] + array[right];

            if ( sum < targetSum) {
                left++;
            } else if (sum > targetSum) {
                right--;
            } else {
                return new int[]{array[left], array[right]};
            }
        }


        return new int[0];
    }

    private static int[] twoSumProblemMap(int[] array, int targetSum) {
        Set set = new HashSet();
        for (int i = 0; i < array.length; i++) {
            int rem = targetSum - array[i];

            if (set.contains(rem)) {
                return new int[]{array[i], rem};
            } else
                set.add(array[i]);
        }

        return new int[0];
    }

    //Brute Force
    private static int[] twoSumProblemBruteForce(int[] a, int targetSum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == targetSum && a[i] != a[j]) {
                    return new int[]{a[i], a[j]};
                }
            }
        }
        return new int[0];
    }

    //Map

}
