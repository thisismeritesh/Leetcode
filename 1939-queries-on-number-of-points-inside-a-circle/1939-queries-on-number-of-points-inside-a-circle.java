class Solution {
    // (x - h)² + (y - k)² = r² where (h, k) represents the center of the circle and r is the radius. 
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res=new int[queries.length];
    
        for(int i=0;i<queries.length;i++){
            int h=queries[i][0], k=queries[i][1], r=queries[i][2];
            for(int j=0;j<points.length;j++){
                int x=points[j][0],y=points[j][1];
                if( (x-h)*(x-h) + (y-k)*(y-k)<=r*r )
                res[i]++;
            }
          

        }
        return res;
    }
}