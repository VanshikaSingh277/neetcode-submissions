class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int maxi=0;

        while(i<j){
            int s=Math.min(heights[i],heights[j])*(j-i);

           maxi=Math.max(maxi,s);
           if(heights[i]>heights[j]){
            j--;
           }
           else{
            i++;
           }
        }
return maxi;
    }
}
