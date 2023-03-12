class Solution {
    public int search(int[] nums, int target) {
        int li=0,hi=nums.length-1;
        int mid=0;
       while(li<=hi){
           mid=(li+hi)/2;
           if(nums[mid]==target){
               return mid;
           }
           else if(nums[mid]<target){
               li=mid+1;
           }
           else{
               hi=mid-1;
           }
       }
       return -1;
    }
}
