public class Q12 {
        int count=0;
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] ans = new int[numCourses];
            List<Integer>[] list = new ArrayList[numCourses];
            for(int i=0; i < numCourses;i++){
                list[i] = new ArrayList<>();
            }
            for(int[] i : prerequisites){
                list[i[0]].add(i[1]);
            }
            Set<Integer> visited = new HashSet<>();
            Set<Integer> visiting = new HashSet<>();
            for(int i=0; i < numCourses; i++){
                if(!dfs(i, ans, visited, visiting, list)){
                    return new int[]{};
                }
            }
            return ans;
        }
        
        public boolean dfs(int i, int[] ans, Set<Integer> visited, Set<Integer> visiting, List<Integer>[] list){
            if(visited.contains(i)){
                return true;
            }
            if(visiting.contains(i)){
                return false;
            }
            
            visiting.add(i);
            List<Integer> l = list[i];
            for(int j=0; j < l.size(); j++){
                if(!dfs(l.get(j).intValue(), ans,visited, visiting, list)){
                    return false;
                }
            }
            visiting.remove(i);
            visited.add(i);
            ans[count++] =i;
            
            return true;
        }
    
    
}
