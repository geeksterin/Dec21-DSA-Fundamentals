package com.recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 6, 8, 9, 10 };
		search(arr, 9);
	}

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		int index = helper(nums, start, end, target);
		return index;

	}

	public static int helper(int[] nums, int start, int end, int target) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (nums[mid] == target) {
			return mid;
		} else if (target < nums[mid]) {
			return helper(nums, start, mid - 1, target);
		} else {
			return helper(nums, mid + 1, end, target);
		}
	}
}
