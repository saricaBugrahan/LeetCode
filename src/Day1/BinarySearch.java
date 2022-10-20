/*
    Binary Search
    Steps:
        1. Use two pointer to one in beginning of the array, other one end of the array
        2. While low is not higher than high
            -Find the middle index using pointer values
            -if nums[mid] is higher than target, we need to decrease the value, so shift the high to mid+1
            -if nums[mid] is lower than target, we need to increase the value, so shift the low to mid-1
            -if nums[mid] equal to target, return mid
        3. return -1 because it is not found
 */
package Day1;
public class BinarySearch {
    public static int search(int[] nums, int target){
        int low = 0, high = nums.length-1, mid;
        while(low<= high)
        {
            mid =  low + ((high - low) / 2);
            if(target == nums[mid]) return mid;
            else if(target> nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12,13};
        System.out.println(search(nums,9));
    }
}
