import java.util.*;
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int maxscore=0;
        while(i<=j){
            if(power>=tokens[i]){
                power=power-tokens[i];
                score++;
                maxscore =Math.max(maxscore,score);
                i++;
            }
            else if(score>0){
                power=power+tokens[j];
                score--;
                j--;

            }
            else{
                break;
            }

        }
        return maxscore;
        
        
        
    }
}
