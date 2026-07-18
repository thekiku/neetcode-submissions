class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i =0 ;i<nums.length;i++){
            if(!frequency.containsKey(nums[i])){
                frequency.put(nums[i],1);
            }
            else{
                frequency.put(nums[i],frequency.get(nums[i])+1);
            }
        }
        int element = nums[0];
        int max_count = 0;
        for(Map.Entry<Integer , Integer> checker : frequency.entrySet()){
            if (checker.getValue() > max_count){
                max_count=checker.getValue();
                element = checker.getKey();
            }
        }
        return element;
    }
}