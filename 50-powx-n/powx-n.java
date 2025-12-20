class Solution {
    public double myPow(double x, int n) {
        long N=n;
            if(N>0) return Math.pow(x,N);
           else return 1/(Math.pow(x,-N));
    }
}