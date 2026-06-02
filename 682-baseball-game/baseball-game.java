class Solution {
    public int calPoints(String[] a) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<a.length;i++){
            if(a[i].equals("D")) st.push(st.peek()*2);
            else if(a[i].equals("C")) st.pop();
            else if(a[i].equals("+")){
                int A=st.pop();
                int B=st.pop();
                st.push(B);
                st.push(A);
                st.push(A+B);
            }
            else st.push(Integer.parseInt(a[i]));
        }
        int sum=0;
        while(!st.isEmpty()) sum+=st.pop();
        return sum;
    }
}