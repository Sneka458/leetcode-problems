class Solution {
    public int f(int speed,int[] p){
        int time = 0;
        for(int i=0;i<p.length;i++){
            time+=Math.ceil((double)p[i]/speed);
        }
        return time;
    }
    public int minEatingSpeed(int[] p, int h) {
        int maxi=0;
        for(int i=0;i<p.length;i++){
            maxi = Math.max(maxi,p[i]);
        }
        int l=1,h1=maxi;
        while(l<=h1){
            int mid = (l+h1)/2;
            int timetaken=f(mid,p);
            if(timetaken>h){
                l=mid+1;
            }
            else{
                h1=mid-1;
            }
        }
        return l;
    }
}