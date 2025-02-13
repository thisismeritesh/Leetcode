class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add((long)i);
        }
        int min=0;
        if(pq.peek()>=k) return min;
       
        while(pq.size()>=2){
            if(pq.peek()>=k)return min;
            long a=pq.poll(),b=pq.poll();
            long res=(Math.min(a,b)*2) + Math.max(a,b);
            pq.add(res); 
            min++; 
        }
         
        return min;
    }
}