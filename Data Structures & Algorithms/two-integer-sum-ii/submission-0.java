class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int s=target-numbers[i];
            if(map.containsKey(s)){
              return new int []{map.get(s)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int []{-1,-1};
    }
}
