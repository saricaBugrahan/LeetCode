package Questions;

public class ReverseString {
    public static void reverseString(char[] s){
        int head = 0, tail = s.length-1;
        while(head<= tail){
            char temp = s[head];
            s[head++] = s[tail];
            s[tail--] = temp;
        }
    }

    public static void main(String[] args) {
        char[] arr = "Hello".toCharArray();
        reverseString(arr);
        for(char c: arr) System.out.print(c+" ");
    }
}
