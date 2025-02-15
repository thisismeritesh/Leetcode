class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int res=0;
        for(int i:piles){
            pq.add(i);
            res+=i;
        }
        while(k>0)
        {
            int num=pq.poll();
            res-=num/2;
            pq.add(num-num/2);
            k--;
        }
        
        return res;
    }
}