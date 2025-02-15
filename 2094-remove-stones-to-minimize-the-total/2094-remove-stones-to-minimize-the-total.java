class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:piles){
            pq.add(i);
        }
        while(k>0)
        {
            int num=pq.poll();
            int removed=(int)Math.floor(num/2);
            pq.add(num-removed);
            k--;
        }
        int sum=0;
        while(!pq.isEmpty()){
            int num=pq.poll();
            sum+=num;

        }
        return sum;
    }
}