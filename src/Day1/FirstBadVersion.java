package Day1;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low<=high)
        {
            int mid = low + ((high - low) / 2);
            if(isBadVersion(mid)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean isBadVersion(int n)
    {
        /*
            //Normally, this part is API call.
         */
        return true;
    }

}
