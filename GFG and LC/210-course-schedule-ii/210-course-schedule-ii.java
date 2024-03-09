class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        
        // Graph-> Edge from CourseId to a list of courses 
        HashMap<Integer, Set<Integer>> graph = new HashMap<>();
        
        for(int i=0;i<numCourses;i++){
            graph.put(i, new HashSet<>());
        }
        
        for(int[] prereq: prerequisites){
            int course = prereq[0];
            int dependingCourse = prereq[1];
            
            // Edge from depending Course to curr course
            graph.get(dependingCourse).add(course);
            indegree[course]++;
        }
        
        Queue<Integer> bfs = new ArrayDeque<>();
        // add nodes with indegree 0 to bfs Q
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                bfs.add(i);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        while(!bfs.isEmpty()){
            int size = bfs.size();
            while(size-->0){
                int head = bfs.remove();
                
                if(indegree[head] == 0){
                    ans.add(head);
                }
                
                for(Integer children : graph.get(head)){
                    indegree[children]--;
                    if(indegree[children]==0){
                        bfs.add(children);
                    }
                }
            }
        }
        
        int i=0;
        int[] order = new int[ans.size()];
        for(Integer el : ans){
            order[i]=el;
            i++;
        }
        
        if(order.length!=numCourses){
            return new int[]{};
        }
        return order;
    } 
}