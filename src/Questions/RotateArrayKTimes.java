package Questions;

import java.util.Arrays;
/*
    Steps:
        1.Reverse the array
        2.Reverse the first k elements in the array
        3.Reverse the  elements in this range =>(k to nums.length -1)
 */
public class RotateArrayKTimes {
    public static void rotate(int[] nums, int k){
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    public static void reverse(int nums[],int start,int lastPointer){
        while(start<lastPointer){
            int temp = nums[start];
            nums[start++] = nums[lastPointer];
            nums[lastPointer--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        rotate(nums,2);
        Arrays.stream(nums).forEach(x -> System.out.print(x+" "));

    }
}
