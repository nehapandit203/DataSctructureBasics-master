package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        int array[] = {-8, -6, 1, 2, 3, 5, 5, 12};
        ThreeNumberSum.threeNumberSum(array, 0);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> list = new ArrayList<>();
        for(int i =0; i< array.length-2; i++)
        {
            int current = i;
            int l= i+1;
            int r= array.length-1;

            while(l < r){
                int totalSum = current + l + r;
                if(totalSum < targetSum){
                    l++;
                }else if(totalSum > targetSum){
                    r++;
                }else{
                    Integer[] result= {array[l],array[r],array[current]};
                    list.add(result);
                    l++;
                    r--;
                }
            }
        }
        return list;
    }


}
