package ArrQues;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
//	problem:
//	given an array of integers, return indices of the two
//	numbers such that they add up to a specific target.
//	You may assume that each input would have exactly one
//	solution, and you may not use the same element twice.

//	sample test case:
//		ip = [2,7,11,15], target = 9
//			ip[0] + ip[1] = 2+7 = 9
//			return [0,1]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//input length of array
		int len = scn.nextInt();
		//declare given array
		int[] nums = new int[len];
		//input array elements
		for(int i= 0 ; i <  len ; i++ ) {
			nums[i] = scn.nextInt();
		}
		//target sum
		int target = scn.nextInt();
		
		//answer array and function call 
		int[] ans = tSum(nums,target);
		
		for(int i= 0 ; i  < ans.length ; i++) {
			System.out.println(ans[i]);
		}
		
	}
	public static int[] tSum(int[] nums, int target) {
		//O(n) time complexity
		Map<Integer,Integer> map = new HashMap<>();
		//iterating through array
		for(int i = 0;  i < nums.length ; i++) {
			//find compliment
			int compliment = target - nums[i];
			if(map.containsKey(compliment)) {
				//return current index and compliment index
				return new int[] {i,map.get(compliment)};
			}
			else {
				//put the key-element and value-its index in the map
				map.put(nums[i],i);
			}
		}
		//if not found return empty array
		return new int[] {};
	}
	
}
