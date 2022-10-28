package Questions;

/*
    Sorted Array Two Sum
    Steps:
    1. Use two pointer to one in beginning of the array, other one end of the array
    2. Find the sums of the indexes head and tail.
    3. Check their situation against target
        -if target is less than sum, we need to decrease the number. That means we need to shift to tail by one to left.
        -if target is higher than sum, we need to increase the number. That means we need to shift to head by one to right.
        -if target is equal to sum, we need to return the indexes.
    4- if it's not found we will return empty array.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers,int target){
       int head = 0;
       int tail = numbers.length-1;
       while(head<=tail){
           int sum = numbers[head]+numbers[tail];
           if(sum>target) tail-=1;
           else if(sum<target) head +=1;
           else return new int[] {head+1,tail+1};
       }
       return new int[] {};
    }
}
