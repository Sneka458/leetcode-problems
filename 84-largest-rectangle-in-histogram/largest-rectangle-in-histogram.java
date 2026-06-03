class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int cur =h[i];
            while(!st.isEmpty() && h[st.peek()]>=cur){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        int [] pse = new int[n];
        st.clear();
        for(int i=0;i<n;i++){
            int cur=h[i];
            while(!st.isEmpty() && h[st.peek()]>=cur){
                st.pop();
            }
        if(st.isEmpty()) pse[i]=0;
            else pse[i]=st.peek()+1;
            st.push(i);
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            int cur=h[i]*(nse[i]-pse[i]);
            if(cur>maxi) maxi=cur;
        }
        return maxi;
    }
}