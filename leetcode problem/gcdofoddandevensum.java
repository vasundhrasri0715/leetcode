class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<n*2;i++){
            if(i%2==0){
                sumeven=sumeven+i;
            }
            else if(i%2!=0){
                sumodd=sumodd+i;
            }
        }
        return gcd(sumodd,sumeven);}
        public int gcd(int a,int b){
            while(b!=0){
            int temp=b;
             b=a%b;
             a=temp;

        }
        
        return a;
        
    }
}

