package Questions;

public class ReverseStringIII {
    public static String reverseWords(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i< arr.length;i++){
            char[] t = arr[i].toCharArray();
            reverse(t);
            sb.append(String.valueOf(t));
            sb.append(" ");
        }

        return sb.substring(0,sb.length()-1);
    }
    public static void reverse(char[] arr){
        int head =0,tail = arr.length-1;
        while(head<tail){
            char temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("God Ding"));
    }
}
