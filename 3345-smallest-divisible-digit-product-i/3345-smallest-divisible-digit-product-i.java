class Solution {
    public boolean isPossible(int n,int t){
        int product=1;
        while(n>0){
            product*=n%10;
            n/=10;
        }
        if(product%t==0) return true;
        else return false;
    }
    public int smallestNumber(int n, int t) {
        while(!isPossible(n,t)){
            n++;
        }
        return n;
    }
}