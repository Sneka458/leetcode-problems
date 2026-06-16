class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            int a = p[0];
            int b = p[1];
            adj.get(b).add(a);
            indegree[a]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        int[] ans = new int[numCourses];
        int idx = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            ans[idx++] = node;
            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    q.offer(nei);
                }
            }
        }
        if (idx == numCourses) {
            return ans;
        }
        return new int[0];
    }
}