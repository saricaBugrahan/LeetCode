package RandomlyPickingQuestions;

public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if(x<0) return false;
        String s = String.valueOf(x);
        int low = 0, high = s.length()-1;
        while (low < high){
            if(s.charAt(low) == s.charAt(high)){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(3));
    }
}
