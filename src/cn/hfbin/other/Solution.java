package cn.hfbin.other;

/**
 * Created by: HuangFuBin
 * Date: 2018/8/17
 * Time: 10:24
 * Such description:
 */
class Solution {
        public int[] twoSum(int[] nums, int target) {
            int [] retu = new int[2] ;
            for(int i=0 ; i < nums.length -1 ; i ++){
                for(int j= i+1 ; j < nums.length ; j ++){
                    if(nums[i] + nums[j] == target){
                        retu[0] = nums[i];
                        retu[1] = nums[j];
                    }
                }
            }
            return retu;
        }

        public static void main(String[] args) {
            int [] nums = new int []{2, 7, 11, 15};
            int target = 9;

            Solution solution = new Solution();
            int[] ints = solution.twoSum(nums, target);
            System.out.println("["+ints[0]+","+ints[1]+"]");

        }
}