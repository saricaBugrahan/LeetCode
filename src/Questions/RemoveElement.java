package Questions;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val) nums[index++] = nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int k = removeElement(nums,2);
        System.out.println(k);
        Arrays.stream(nums).forEach(x -> System.out.print(x+" "));

    }
}
