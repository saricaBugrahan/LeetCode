package RandomlyPickingQuestions;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int head = 0, tail = s.length()-1;
        while(head <= tail){
            if(isVowel(arr[head]) && isVowel(arr[tail])){
                char temp = arr[head];
                arr[head++] = arr[tail];
                arr[tail--] = temp;
            }
            else if(isVowel(arr[head]) && !isVowel(arr[tail])){
                tail--;
            }
            else if(!isVowel(arr[head]) && isVowel(arr[tail])){
                head++;
            }
            else{
                head++;
                tail--;
            }
        }
        return String.valueOf(arr);
    }
    public static boolean isVowel(char letter){
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode").compareTo("leotcede"));
    }
}
