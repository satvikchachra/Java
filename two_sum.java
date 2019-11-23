package ArrQues;
import java.util.Scanner;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int len = scn.nextInt();
		int[] nums = new int[len];
		for(int i = 0 ; i < len; i++) {
			nums[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		int[] ans = tSum(nums,target);
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.println(ans[i]);
		}

	}
	public static int[] tSum(int[] nums,int target) {
		//moving 2 pointers simultaneously from left and right
		int left = 0, right = nums.length -1;
		//make sure pointers don't cross each other i.e set boundaries
		while(left < right) {
			if(nums[left] + nums[right] == target) {
				return new int[] {left,right};
			}
			else if(nums[left] + nums[right]<target) {
				left++;
			}
			else {
				right--;
			}
		}
		return new int[] {};
	}

}
