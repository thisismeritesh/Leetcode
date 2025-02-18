class Solution {
    // (x - h)² + (y - k)² = r² where (h, k) represents the center of the circle and r is the radius. 
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res=new int[queries.length];
        int index=0;
        for(int[] q:queries){
            int count=0;
            for(int[] p:points){
                if(check(p,q))res[index]++;
            }
            index++;

        }
        return res;
    }
    public boolean check(int[] points,int[] circle){
        int x=points[0],y=points[1];
        int h=circle[0],k=circle[1],r=circle[2];
        if( ((x-h)*(x-h)) + ((y-k)*(y-k))<=r*r  )return true;
        return false;

    }
}