class Solution {
    public int minimumOperations(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for(int i:nums){
            if(i>0)set.add(i);
         }
         return set.size();










    //   Arrays.sort(nums);
    //   int last=nums[nums.length-1],count=0;
    //   for(int i:nums){
    //     if(i>0){
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j]>0)nums[j]-=i;
    //         }
    //         count++;
    //     }
    //     if(last<=0)return count;
    //   }
    //   return count;
    }
}