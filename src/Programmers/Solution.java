package Programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int chooseChance = 0;
        int different = 1;

        chooseChance = nums.length / 2;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]){
                different++;
            }
        }
        if (chooseChance > different) {
            answer = different;
        } else {
            answer = chooseChance;
        }


        return answer;
    }
}