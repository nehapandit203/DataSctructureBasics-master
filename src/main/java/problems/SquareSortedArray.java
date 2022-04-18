package problems;

import java.util.Arrays;
import java.util.List;

public class SquareSortedArray {

    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        final int[] ints = sortedSquaredArray(num);
        System.out.println(ints);

    }


    public static int[] sortedSquaredArray(int[] array) {
        int sqr[] = new int[array.length];
        for(int i=0 ;  i< array.length;  i++){
            sqr[i] = array[i]*array[i];
        }
        // Write your code here.
        return sqr;
    }
}
