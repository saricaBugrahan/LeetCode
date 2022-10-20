package RandomlyPickingQuestions;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int val = 0;
            for (int i : account) {
                val += i;
            }
            max = Math.max(max, val);
        }
        return max;
    }
}
