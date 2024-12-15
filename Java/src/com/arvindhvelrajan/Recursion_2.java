package com.arvindhvelrajan;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Recursion_2 from codingbat.com
 */
public class Recursion_2
{
	private void welcome()
	{
		System.out.println("\n\nRecursion-2 Functions\n");
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
	 * given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking
	 * strategy in this problem, you can use the same pattern for many problems to search a space of choices.
	 * Rather than looking at the whole array, our convention is to consider the part of the array starting at index
	 * start and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0.
	 * No loops are needed -- the recursive calls progress down the array.
	 *
	 * groupSum(0, [2, 4, 8], 10) → true
	 * groupSum(0, [2, 4, 8], 14) → true
	 * groupSum(0, [2, 4, 8], 9) → false
	 */
	public boolean groupSum(int start, int[] nums, int target)
	{
		if(start >= nums.length)
		{
			return target == 0;
		}
		if(groupSum(start + 1, nums, target - nums[start]))
		{
			return true;
		}
		return (groupSum(start + 1, nums, target));
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such
	 * that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.
	 * (No loops needed.)
	 *
	 * groupSum6(0, [5, 6, 2], 8) → true
	 * groupSum6(0, [5, 6, 2], 9) → false
	 * groupSum6(0, [5, 6, 2], 7) → false
	 */
	public boolean groupSum6(int start, int[] nums, int target)
	{
		if(start >= nums.length)
		{
			return target == 0;
		}
		if(nums[start] == 6)
		{
			return groupSum6(start + 1, nums, target - nums[start]);
		}
		return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
	 * given target with this additional constraint: If a value in the array is chosen to be in the group, the value
	 * immediately following it in the array must not be chosen. (No loops needed.)
	 *
	 * groupNoAdj(0, [2, 5, 10, 4], 12) → true
	 * groupNoAdj(0, [2, 5, 10, 4], 14) → false
	 * groupNoAdj(0, [2, 5, 10, 4], 7) → false
	 */
	public boolean groupNoAdj(int start, int[] nums, int target)
	{
		if(start >= nums.length)
		{
			return target == 0;
		}
		return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
	 * given target with these additional constraints: all multiples of 5 in the array must be included in the group.
	 * If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
	 *
	 * groupSum5(0, [2, 5, 10, 4], 19) → true
	 * groupSum5(0, [2, 5, 10, 4], 17) → true
	 * groupSum5(0, [2, 5, 10, 4], 12) → false
	 */
	public boolean groupSum5(int start, int[] nums, int target)
	{
		if(start >= nums.length)
		{
			return target == 0;
		}
		if(nums[start] % 5 == 0)
		{
			if(start < nums.length - 1 && nums[start + 1] == 1)
			{
				return groupSum5(start + 2, nums, target - nums[start]);
			}
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
	 * given target, with this additional constraint: if there are numbers in the array that are adjacent and the
	 * identical value, they must either all be chosen, or none of them chosen. For example, with the
	 * array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group.
	 * (one loop can be used to find the extent of the identical values).
	 *
	 * groupSumClump(0, [2, 4, 8], 10) → true
	 * groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
	 * groupSumClump(0, [2, 4, 4, 8], 14) → false
	 */
	public boolean groupSumClump(int start, int[] nums, int target)
	{
		if(start >= nums.length)
		{
			return target == 0;
		}
		int sum = nums[start];
		int count = 1;
		for(int i = start + 1; i < nums.length; i++)
			if(nums[i] == nums[start])
			{
				sum += nums[i];
				count++;
			}
		return groupSumClump(start + count, nums, target - sum) || groupSumClump(start + count, nums, target);
	}

	/**
	 * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are
	 * the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments
	 * you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
	 *
	 * splitArray([2, 2]) → true
	 * splitArray([2, 3]) → false
	 * splitArray([5, 2, 3]) → true
	 */
	public boolean splitArray(int[] nums)
	{
		return splitCheck(nums, 0);
	}
	/**
	 * This helper function will do the splitting and checking for me.
	 */
	private boolean splitCheck(int start, int[] nums, int sum1, int sum2)
	{
		if(start >= nums.length)
		{
			return sum1 == sum2;
		}
		return splitCheck(start + 1, nums, sum1 + nums[start], sum2) || splitCheck(start + 1, nums, sum1, sum2 + nums[start]);
	}

	/**
	 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a
	 * multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other.
	 * Write a recursive helper method that takes whatever arguments you like, and make the initial call to your
	 * recursive helper from splitOdd10(). (No loops needed.)
	 *
	 * splitOdd10([5, 5, 5]) → true
	 * splitOdd10([5, 5, 6]) → false
	 * splitOdd10([5, 5, 6, 1]) → true
	 */
	public boolean splitOdd10(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is
	 * the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values
	 * that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
	 *
	 * split53([1, 1]) → true
	 * split53([1, 1, 1]) → false
	 * split53([2, 4, 2]) → true
	 */
	public boolean split53(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param args commandline arguments
	 */
	public void main(String[] args)
	{
		resetCallCount();
		welcome();
		printFunction("groupSum");
		System.out.println("groupSum(0, [2, 4, 8], 10) → " + groupSum(0, new int[] {2, 4, 8}, 10));
		System.out.println("groupSum(0, [2, 4, 8], 14) → " + groupSum(0, new int[] {2, 4, 8}, 14));
		System.out.println("groupSum(0, [2, 4, 8], 9) → " + groupSum(0, new int[] {2, 4, 8}, 9));
		System.out.println("groupSum(0, [2, 4, 8], 8) → " + groupSum(0, new int[] {2, 4, 8}, 8));
		System.out.println("groupSum(1, [2, 4, 8], 8) → " + groupSum(1, new int[] {2, 4, 8}, 8));
		System.out.println("groupSum(1, [2, 4, 8], 2) → " + groupSum(1, new int[] {2, 4, 8}, 2));
		System.out.println("groupSum(0, [1], 1) → " + groupSum(0, new int[] {1}, 1));
		System.out.println("groupSum(0, [9], 1) → " + groupSum(0, new int[] {9}, 1));
		System.out.println("groupSum(1, [9], 0) → " + groupSum(1, new int[] {9}, 0));
		System.out.println("groupSum(0, [], 0) → " + groupSum(0, new int[] {0}, 0));
		System.out.println("groupSum(0, [10, 2, 2, 5], 17) → " + groupSum(0, new int[] {10, 2, 2, 5}, 17));
		System.out.println("groupSum(0, [10, 2, 2, 5], 15) → " + groupSum(0, new int[] {10, 2, 2, 5}, 15));
		System.out.println("groupSum(0, [10, 2, 2, 5], 9) → " + groupSum(0, new int[] {10, 2, 2, 5}, 9));
		printFunction("groupSum6");
		System.out.println("groupSum6(0, [5, 6, 2], 8) → " + groupSum6(0, new int[] {5, 6, 2}, 8));
		System.out.println("groupSum6(0, [5, 6, 2], 9) → " + groupSum6(0, new int[] {5, 6, 2}, 9));
		System.out.println("groupSum6(0, [5, 6, 2], 7) → " + groupSum6(0, new int[] {5, 6, 2}, 7));
		System.out.println("groupSum6(0, [1], 1) → " + groupSum6(0, new int[] {1}, 1));
		System.out.println("groupSum6(0, [9], 1) → " + groupSum6(0, new int[] {9}, 1));
		System.out.println("groupSum6(0, [], 0) → " + groupSum6(0, new int[] {}, 0));
		System.out.println("groupSum6(0, [3, 2, 4, 6], 8) → " + groupSum6(0, new int[] {3, 2, 4, 6}, 8));
		System.out.println("groupSum6(0, [6, 2, 4, 3], 8) → " + groupSum6(0, new int[] {6, 2, 4, 3}, 8));
		System.out.println("groupSum6(0, [5, 2, 4, 6], 9) → " + groupSum6(0, new int[] {5, 2, 4, 6}, 9));
		System.out.println("groupSum6(0, [6, 2, 4, 5], 9) → " + groupSum6(0, new int[] {6, 2, 4, 5}, 9));
		System.out.println("groupSum6(0, [3, 2, 4, 6], 3) → " + groupSum6(0, new int[] {3, 2, 4, 6}, 3));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 4], 12) → " + groupSum6(0, new int[] {1, 6, 2, 6, 4}, 12));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 4], 13) → " + groupSum6(0, new int[] {1, 6, 2, 6, 4}, 13));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 4], 4) → " + groupSum6(0, new int[] {1, 6, 2, 6, 4}, 4));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 4], 9) → " + groupSum6(0, new int[] {1, 6, 2, 6, 4}, 9));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 5], 14) → " + groupSum6(0, new int[] {1, 6, 2, 6, 5}, 14));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 5], 15) → " + groupSum6(0, new int[] {1, 6, 2, 6, 5}, 15));
		System.out.println("groupSum6(0, [1, 6, 2, 6, 5], 16) → " + groupSum6(0, new int[] {1, 6, 2, 6, 5}, 16));
		printFunction("groupNoAdj");
		System.out.println("groupNoAdj(0, [2, 5, 10, 4], 12) → " + groupNoAdj(0, new int[] {2, 5, 10, 4}, 12));
		System.out.println("groupNoAdj(0, [2, 5, 10, 4], 14) → " + groupNoAdj(0, new int[] {2, 5, 10, 4}, 14));
		System.out.println("groupNoAdj(0, [2, 5, 10, 4], 7) → " + groupNoAdj(0, new int[] {2, 5, 10, 4}, 7));
		System.out.println("groupNoAdj(0, [2, 5, 10, 4, 2], 7) → " + groupNoAdj(0, new int[] {2, 5, 10, 4, 2}, 7));
		System.out.println("groupNoAdj(0, [2, 5, 10, 4], 9) → " + groupNoAdj(0, new int[] {2, 5, 10, 4}, 9));
		System.out.println("groupNoAdj(0, [10, 2, 2, 3, 3], 15) → " + groupNoAdj(0, new int[] {10, 2, 2, 3, 3}, 15));
		System.out.println("groupNoAdj(0, [10, 2, 2, 3, 3], 7) → " + groupNoAdj(0, new int[] {10, 2, 2, 3, 3}, 7));
		System.out.println("groupNoAdj(0, [], 0) → " + groupNoAdj(0, new int[] {}, 0));
		System.out.println("groupNoAdj(0, [1], 1) → " + groupNoAdj(0, new int[] {1}, 1));
		System.out.println("groupNoAdj(0, [9], 1) → " + groupNoAdj(0, new int[] {9}, 1));
		System.out.println("groupNoAdj(0, [9], 0) → " + groupNoAdj(0, new int[] {9}, 0));
		System.out.println("groupNoAdj(0, [5, 10, 4, 1], 11) → " + groupNoAdj(0, new int[] {5, 10, 4, 1}, 11));
		printFunction("groupSum5");
		System.out.println("groupSum5(0, [2, 5, 10, 4], 19) → " + groupSum5(0, new int[] {2, 5, 10, 4}, 19));
		System.out.println("groupSum5(0, [2, 5, 10, 4], 17) → " + groupSum5(0, new int[] {2, 5, 10, 4}, 17));
		System.out.println("groupSum5(0, [2, 5, 10, 4], 12) → " + groupSum5(0, new int[] {2, 5, 10, 4}, 12));
		System.out.println("groupSum5(0, [2, 5, 4, 10], 12) → " + groupSum5(0, new int[] {2, 5, 4, 10}, 12));
		System.out.println("groupSum5(0, [3, 5, 1], 4) → " + groupSum5(0, new int[] {3, 5, 1}, 4));
		System.out.println("groupSum5(0, [3, 5, 1], 5) → " + groupSum5(0, new int[] {3, 5, 1}, 5));
		System.out.println("groupSum5(0, [1, 3, 5], 5) → " + groupSum5(0, new int[] {1, 3, 5}, 5));
		System.out.println("groupSum5(0, [3, 5, 1], 9) → " + groupSum5(0, new int[] {3, 5, 1}, 9));
		System.out.println("groupSum5(0, [2, 5, 10, 4], 7) → " + groupSum5(0, new int[] {2, 5, 10, 4}, 7));
		System.out.println("groupSum5(0, [2, 5, 10, 4], 15) → " + groupSum5(0, new int[] {2, 5, 10, 4}, 15));
		System.out.println("groupSum5(0, [2, 5, 10, 4], 11) → " + groupSum5(0, new int[] {2, 5, 10, 4}, 11));
		System.out.println("groupSum5(0, [1], 1) → " + groupSum5(0, new int[] {1}, 1));
		System.out.println("groupSum5(0, [9], 1) → " + groupSum5(0, new int[] {9}, 1));
		System.out.println("groupSum5(0, [9], 0) → " + groupSum5(0, new int[] {9}, 0));
		System.out.println("groupSum5(0, [], 0) → " + groupSum5(0, new int[] {}, 0));
		printFunction("groupSumClump");
		System.out.println("groupSumClump(0, [2, 4, 8], 10) → " + groupSumClump(0, new int[] {2, 4, 8}, 10));
		System.out.println("groupSumClump(0, [1, 2, 4, 8, 1], 14) → " + groupSumClump(0, new int[] {1, 2, 4, 8, 1}, 14));
		System.out.println("groupSumClump(0, [2, 4, 4, 8], 14) → " + groupSumClump(0, new int[] {2, 4, 4, 8}, 14));
		System.out.println("groupSumClump(0, [8, 2, 2, 1], 9) → " + groupSumClump(0, new int[] {8, 2, 2, 2}, 9));
		System.out.println("groupSumClump(0, [8, 2, 2, 1], 11) → " + groupSumClump(0, new int[] {8, 2, 2, 2}, 11));
		System.out.println("groupSumClump(0, [1], 1) → " + groupSumClump(0, new int[] {1}, 1));
		System.out.println("groupSumClump(0, [9], 1) → " + groupSumClump(0, new int[] {9}, 1));
		printFunction("splitArray");
		System.out.println("splitArray([2, 2]) → " + splitArray(new int[] {2, 2}));
		System.out.println("splitArray([2, 3]) → " + splitArray(new int[] {2, 3}));
		System.out.println("splitArray([5, 2, 3]) → " + splitArray(new int[] {5, 2, 3}));
		System.out.println("splitArray([5, 2, 2]) → " + splitArray(new int[] {5, 2, 2}));
		System.out.println("splitArray([1, 1, 1, 1, 1, 1]) → " + splitArray(new int[] {1, 1, 1, 1, 1, 1}));
		System.out.println("splitArray([1, 1, 1, 1, 1]) → " + splitArray(new int[] {1, 1, 1, 1, 1}));
		System.out.println("splitArray([]) → " + splitArray(new int[] {}));
		System.out.println("splitArray([1]) → " + splitArray(new int[] {1}));
		System.out.println("splitArray([3, 5]) → " + splitArray(new int[] {3, 5}));
		System.out.println("splitArray([5, 3, 2]) → " + splitArray(new int[] {5, 3, 2}));
		System.out.println("splitArray([2, 2, 10, 10, 1, 1]) → " + splitArray(new int[] {2, 2, 10, 10, 1, 1}));
		System.out.println("splitArray([1, 2, 2, 10, 10, 1, 1]) → " + splitArray(new int[] {1, 2, 2, 10, 10, 1, 1}));
		System.out.println("splitArray([1, 2, 3, 10, 10, 1, 1]) → " + splitArray(new int[] {1, 2, 3, 10, 10, 1, 1}));
		printFunction("splitOdd10");
		System.out.println("splitOdd10([5, 5, 5]) → " + splitOdd10(new int[] {5, 5, 5}));
		System.out.println("splitOdd10([5, 5, 6]) → " + splitOdd10(new int[] {5, 5, 6}));
		System.out.println("splitOdd10([5, 5, 6, 1]) → " + splitOdd10(new int[] {5, 5, 6, 1}));
		System.out.println("splitOdd10([6, 5, 5, 1]) → " + splitOdd10(new int[] {6, 5, 5, 1}));
		System.out.println("splitOdd10([6, 5, 5, 1, 10]) → " + splitOdd10(new int[] {6, 5, 5, 1, 10}));
		System.out.println("splitOdd10([6, 5, 5, 5, 1]) → " + splitOdd10(new int[] {6, 5, 5, 5, 1}));
		System.out.println("splitOdd10([1]) → " + splitOdd10(new int[] {1}));
		System.out.println("splitOdd10([]) → " + splitOdd10(new int[] {}));
		System.out.println("splitOdd10([10, 7, 5, 5]) → " + splitOdd10(new int[] {10, 7, 5, 5}));
		System.out.println("splitOdd10([10, 0, 5, 5]) → " + splitOdd10(new int[] {10, 0, 5, 5}));
		System.out.println("splitOdd10([10, 7, 5, 5, 2]) → " + splitOdd10(new int[] {10, 7, 5, 5, 2}));
		System.out.println("splitOdd10([10, 7, 5, 5, 1]) → " + splitOdd10(new int[] {10, 7, 5, 5, 1}));
		printFunction("split53");
		System.out.println("split53([1, 1]) → " + split53(new int[] {1, 1}));
		System.out.println("split53([1, 1, 1]) → " + split53(new int[] {1, 1, 1}));
		System.out.println("split53([2, 4, 2]) → " + split53(new int[] {2, 4, 2}));
		System.out.println("split53([2, 2, 2, 1]) → " + split53(new int[] {2, 2, 2, 1}));
		System.out.println("split53([3, 3, 5, 1]) → " + split53(new int[] {3, 3, 5, 1}));
		System.out.println("split53([3, 5, 8]) → " + split53(new int[] {3, 5, 8}));
		System.out.println("split53([2, 4, 6]) → " + split53(new int[] {2, 4, 6}));
		System.out.println("split53([3, 5, 6, 10, 3, 3]) → " + split53(new int[] {3, 5, 6, 10, 3, 3}));
	}
}
