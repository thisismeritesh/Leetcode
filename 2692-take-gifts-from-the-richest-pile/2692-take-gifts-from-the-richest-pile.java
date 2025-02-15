class Solution {
    public long pickGifts(int[] gifts, int k) {
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        long sum=0;
        for(int i=0;i<k;i++){
            int a=pq.poll();
            pq.add((int)Math.sqrt(a));
      

        }
        
        while(!pq.isEmpty()){
            sum+=pq.poll();
            
        }

        return sum;
    }
}