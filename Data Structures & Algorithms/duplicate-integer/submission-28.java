class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int[] a = nums;
        for (int i = 1 ; i<a.length;i++){
            if (a[i]==a[i-1]){
                return true;
            }
        }
        return false;
    }
}