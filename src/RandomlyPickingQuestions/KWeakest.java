package RandomlyPickingQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class KWeakest {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] unsorted = new int[mat.length];
        int[] sortedKTimes = new int[k];
        for(int i = 0;i<mat.length;i++){
            int val = 0;
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 0) break;
                val++;
            }
            unsorted[i] = val-mat[0].length;
        }
        int m = 0;
        while(m<k){
            sortedKTimes[m] = findLowIndex(unsorted);
            unsorted[sortedKTimes[m]] = Integer.MAX_VALUE;
            m++;
        }
        return sortedKTimes;
    }
    public static int findLowIndex(int[] num){
        int min = 0;
        for(int i = 1;i<num.length;i++){
            if(num[min] > num[i])
                min = i;
        }
        for(int i = 0;i<num.length;i++){
            if(i == min) continue;
            else{
                if(num[min] == num[i]){
                    if(min>i) min = i;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] temp =
                {{1,1,1,1,1},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,0},{1,1,1,1,1}};
        Arrays.stream(kWeakestRows(temp,3)).forEach(System.out::println);
    }
}
