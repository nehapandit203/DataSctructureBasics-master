package problems;

import java.util.Arrays;

public class SmallestDifferene {
    public static void main(String[] args) {
        int A[] = {-1, 3, 5, 10, 20, 28};
        int B[] = {15, 17, 26, 134, 135};
        int result[] = smallestDifference(A, B);
        System.out.println(result);
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] pair = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int i = 0;
        int j = 0;
        int smallest = Integer.MAX_VALUE;
        while (i < arrayOne.length && j < arrayTwo.length) {
            int diff = 0;
            int firstNum = arrayOne[i];
            int secondNum = arrayTwo[j];
            if (firstNum < secondNum) {
                diff = secondNum - firstNum;
                i++;
            } else if (firstNum > secondNum) {
                diff = firstNum - secondNum;
                j++;
            } else
               return new int[]{firstNum, secondNum};

            if (smallest > diff) {
                smallest = diff;
                pair = new int[]{firstNum, secondNum};
            }
        }
        return pair;
    }
}

