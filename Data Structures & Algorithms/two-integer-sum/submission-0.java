class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] num = new int [2];
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]+ nums[j] == target){
                        if(i<j){
                            num[0] = i;
                            num[1] = j;
                        }
                        else{
                            num[0] = j;
                            num[1] = i;
                        }
                    }
                }
            }
            return num;
        }
    }

