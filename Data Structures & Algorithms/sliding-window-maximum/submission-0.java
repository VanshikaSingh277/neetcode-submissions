class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int count=0;
        
        int []arr=new int [nums.length-k+1];
      for(int i=0;i<=nums.length-k;i++){
        count=nums[i];
        for(int j=i;j<i+k;j++){
            count=Math.max(count,nums[j]);
        }
        arr[i]=count;
      }
      return arr;
    }
}
