class Solution {
    public int mySqrt(int x) {
        int power=0;
        for(int i=1;i<=x;i++){
            if((long)i*i<=x){
                power=i;
            }
            else{
                break;
            }
        }
        return power;
        
    }
}