class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1)return true;
        // if(nums[0]<nums[1])return inccheck(nums);
        // else return descheck(nums);
        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1)return true; 
            if(nums[i-1]==nums[i])continue;
            if(nums[i-1]<nums[i])return inccheck(nums);
            if(nums[i-1]>nums[i])return descheck(nums);
        }
        return false;
    }
    public boolean inccheck(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])return false;
        }
        return true;
    }
    public boolean descheck(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])return false;
        }
        return true;
    }
}