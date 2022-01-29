public class Q8 {
        public int numberOfBoomerangs(int[][] points) {
            
            HashMap<Integer, Integer> hm = new HashMap<>();
            int boomCount = 0;
            
            //Iterate through each point
            for(int i = 0; i < points.length; i++ ){
            
                //Check the distance for other points from the point[i]
                for(int j = 0; j < points.length; j++ ){
                    if (i == j) continue;
                    int dist = getDist(points[i], points[j]);
                    //Count how many points are there in the same distance
                    hm.put(dist, hm.getOrDefault(dist,0) + 1);
                }
                
                for(Integer key: hm.keySet()){
                    int size = hm.get(key);
                    if(size >= 2) boomCount += size*(size-1);
                }
                
                hm.clear();
            }
            
            return boomCount;
        }
        
        private int getDist(int[] p1, int[] p2){
            int a = p1[0] - p2[0];
            int b = p1[1] - p2[1];
            
            return a*a + b*b;
        }
    }
    

