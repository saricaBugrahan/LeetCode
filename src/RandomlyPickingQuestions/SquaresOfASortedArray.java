package RandomlyPickingQuestions;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int [] nums){
        int head = 0, tail = nums.length-1,index = tail;
        int[] resultArray = new int[tail+1];
        while(head<=tail){
            if(Math.abs(nums[head])>Math.abs(nums[tail])){
                resultArray[index] = (int)Math.pow(nums[head],2);
                head+=1;
            }
            else{
                resultArray[index] = (int)Math.pow(nums[tail],2);
                tail -=1;
            }
            index-=1;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int nums[] = {-5,-3,-2,-1};
        Arrays.stream(sortedSquares(nums)).forEach(System.out::println);
    }
}
