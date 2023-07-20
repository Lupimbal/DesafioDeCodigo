package Desafios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> dictValues = new HashMap<Integer,Integer>();
    	for (int x=0; x<nums.length; x++) {
    		dictValues.put(nums[x], x);
    	}
    	for (int i=0; i<nums.length; i++) {
    		int complemento = target - nums[i];
    		if (dictValues.containsKey(complemento)
    				&& dictValues.get(complemento) != i) {
    			return new int [] {i,dictValues.get(complemento)};
    		}
    	}
    	return null;
    }
}

public class Desafio1 {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.twoSum(new int[]{2,7,11,15}, 9)));
		System.out.println(Arrays.toString(s.twoSum(new int[]{3,2,4}, 6)));
	}

}
