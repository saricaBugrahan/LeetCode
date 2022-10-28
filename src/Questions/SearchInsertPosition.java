package Questions;

public class SearchInsertPosition {
    public static int insert(int[] nums, int target)
    {
        int low = 0, high = nums.length-1,mid = 0;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            if(target == nums[mid]) {
                return mid;
            }
            else if(target> nums[mid]) {
                low = mid+1;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(insert(nums,4));
    }
}
