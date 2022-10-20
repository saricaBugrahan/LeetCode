package RandomlyPickingQuestions;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomArray = new int[26];
        for(int i = 0;i<magazine.length();i++) {
            ransomArray[magazine.charAt(i)%97]+=1;
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(ransomArray[ransomNote.charAt(i)%97] != 0){
                ransomArray[ransomNote.charAt(i)%97]-=1;
            }
            else{
                return false;
            }
        }
        for(int i = 0;i<ransomArray.length;i++)
        {
            if(ransomArray[i] < 0) return false;
        }
        return true;
    }
}
