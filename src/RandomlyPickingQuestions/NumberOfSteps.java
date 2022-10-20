package RandomlyPickingQuestions;

public class NumberOfSteps {
    public int numberOfSteps(int n){
        int count = 0;
        while(n != 0){
            if(isEven(n)){
                n /= 2;
                count++;
            }
            else{
                n -=1;
                count++;
            }
        }
        return count;
    }
    public static boolean isEven(int n){ return n%2 ==0;}
}
