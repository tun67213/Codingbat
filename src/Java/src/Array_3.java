package src;

import java.util.Arrays;

/**
 * @author arvindhvelrajan
 */
public class Array_3 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nArray-3 Methods\n");
	}

	/**
	 * Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
	 *
	 * maxSpan([1, 2, 1, 1, 3]) → 4
	 * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
	 * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
	 */
	public int maxSpan(int[] nums)
	{
		if(nums.length <= 1)
		{
			return nums.length;
		}
		int maximumSpan = 1;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = nums.length - 1; j > i; j--)
			{
				if(nums[i] == nums[j])
				{
					int span = j - i + 1;
					if(span > maximumSpan)
					{
						maximumSpan = span;
					}
					break;
				}
			}
		}
		return maximumSpan;
	}

	/**
	 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
	 *
	 * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
	 * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
	 * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
	 */
	public int[] fix34(int[] nums)
	{
		int i = 0;

		while(i < nums.length && nums[i] != 3)
		{
			i++;
		}

		int j = i + 1;

		while(j < nums.length && nums[j] != 4)
		{
			j++;
		}

		while(i < nums.length)
		{
			if(nums[i] == 3)
			{
				int temp = nums[i + 1];
				nums[i + 1] = nums[j];
				nums[j] = temp;

				while(j < nums.length && nums[j] != 4)
				{
					j++;
				}
			}
			i++;
		}

		return nums;
	}

	/**
	 * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
	 *
	 * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
	 * fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
	 * fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
	 */
	public int[] fix45(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
	 *
	 * canBalance([1, 1, 1, 2, 1]) → true
	 * canBalance([2, 1, 1, 2, 1]) → false
	 * canBalance([10, 10]) → true
	 */
	public boolean canBalance(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
	 *
	 * linearIn([1, 2, 4, 6], [2, 4]) → true
	 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
	 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
	 */
	public boolean linearIn(int[] outer, int[] inner)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
	 *
	 * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
	 * squareUp(2) → [0, 1, 2, 1]
	 * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
	 */
	public int[] squareUp(int n)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
	 *
	 * seriesUp(3) → [1, 1, 2, 1, 2, 3]
	 * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
	 * seriesUp(2) → [1, 1, 2]
	 */
	public int[] seriesUp(int n)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
	 *
	 * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
	 * maxMirror([1, 2, 1, 4]) → 3
	 * maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
	 */
	public int maxMirror(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
	 *
	 * countClumps([1, 2, 2, 3, 4, 4]) → 2
	 * countClumps([1, 1, 2, 1, 1]) → 2
	 * countClumps([1, 1, 1, 1, 1]) → 1
	 */
	public int countClumps(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param args command line arguments
	 */
	public void main(String[] args)
	{
		HelperMethods.resetCallTimes();
		welcome();
		printMethod("maxSpan");
		System.out.println("maxSpan([1, 2, 1, 1, 3]) -> " + maxSpan(new int[] {1, 2, 1, 1, 3}));
		System.out.println("maxSpan([1, 4, 2, 1, 4, 1, 4]) -> " + maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
		System.out.println("maxSpan([1, 4, 2, 1, 4, 4, 4]) -> " + maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
		System.out.println("maxSpan([3, 3, 3]) -> " + maxSpan(new int[] {3, 3, 3}));
		System.out.println("maxSpan([3, 9, 3]) -> " + maxSpan(new int[] {3, 9, 3}));
		System.out.println("maxSpan([3, 9, 9]) -> " + maxSpan(new int[] {3, 9, 9}));
		System.out.println("maxSpan([3, 9]) -> " + maxSpan(new int[] {3, 9}));
		System.out.println("maxSpan([3, 3]) -> " + maxSpan(new int[] {3, 3}));
		System.out.println("maxSpan([]) -> " + maxSpan(new int[] {}));
		System.out.println("maxSpan([1]) -> " + maxSpan(new int[] {1}));
		printMethod("fix34");
		System.out.println("fix34([1, 3, 1, 4]) -> " + Arrays.toString(fix34(new int[] {1, 3, 1, 4})));
		System.out.println("fix34([1, 3, 1, 4, 4, 3, 1]) -> " + Arrays.toString(fix34(new int[] {1, 3, 1, 4, 4, 3, 1})));
		System.out.println("fix34([3, 2, 2, 4]) -> " + Arrays.toString(fix34(new int[] {3, 2, 2, 4})));
		System.out.println("fix34([3, 2, 3, 2, 4, 4]) -> " + Arrays.toString(fix34(new int[] {3, 2, 3, 2, 4, 4})));
		System.out.println("fix34([2, 3, 2, 3, 2, 4, 4]) -> " + Arrays.toString(fix34(new int[] {2, 3, 2, 3, 2, 4, 4})));
		System.out.println("fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) -> " + Arrays.toString(fix34(new int[] {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5})));
		System.out.println("fix34([3, 1, 4]) -> " + Arrays.toString(fix34(new int[] {3, 1, 4})));
		System.out.println("fix34([3, 4, 1]) -> " + Arrays.toString(fix34(new int[] {3, 4, 1})));
		System.out.println("fix34([1, 1, 1]) -> " + Arrays.toString(fix34(new int[] {1, 1, 1})));
		System.out.println("fix34([1]) -> " + Arrays.toString(fix34(new int[] {1})));
		System.out.println("fix34([]) -> " + Arrays.toString(fix34(new int[] {})));
		System.out.println("fix34([7, 3, 7, 7, 4]) -> " + Arrays.toString(fix34(new int[] {7, 3, 7, 7, 4})));
		System.out.println("fix34([3, 1, 4, 3, 1, 4]) -> " + Arrays.toString(fix34(new int[] {3, 1, 4, 3, 1, 4})));
		System.out.println("fix34([3, 1, 1, 3, 4, 4]) -> " + Arrays.toString(fix34(new int[] {3, 1, 1, 3, 4, 4})));
		printMethod("fix45");
		System.out.println("fix45([5, 4, 9, 4, 9, 5]) -> " + Arrays.toString(fix45(new int[] {5, 4, 9, 4, 9, 5})));
		System.out.println("fix45([1, 4, 1, 5]) -> " + Arrays.toString(fix45(new int[] {1, 4, 1, 5})));
		System.out.println("fix45([1, 4, 1, 5, 5, 4, 1]) -> " + Arrays.toString(fix45(new int[] {1, 4, 1, 5, 5, 4, 1})));
		System.out.println("fix45([4, 9, 4, 9, 5, 5, 4, 9, 5]) -> " + Arrays.toString(fix45(new int[] {4, 9, 4, 9, 5, 5, 4, 9, 5})));
		System.out.println("fix45([5, 5, 4, 1, 4, 1]) -> " + Arrays.toString(fix45(new int[] {5, 5, 4, 1, 4, 1})));
		System.out.println("fix45([4, 2, 2, 5]) -> " + Arrays.toString(fix45(new int[] {4, 2, 2, 5})));
		System.out.println("fix45([4, 2, 4, 2, 5, 5]) -> " + Arrays.toString(fix45(new int[] {4, 2, 4, 2, 5, 5})));
		System.out.println("fix45([4, 2, 4, 5, 5]) -> " + Arrays.toString(fix45(new int[] {4, 2, 4, 5, 5})));
		System.out.println("fix45([1, 1, 1]) -> " + Arrays.toString(fix45(new int[] {1, 1, 1})));
		System.out.println("fix45([4, 5]) -> " + Arrays.toString(fix45(new int[] {4, 5})));
		System.out.println("fix45([5, 4, 1]) -> " + Arrays.toString(fix45(new int[] {5, 4, 1})));
		System.out.println("fix45([]) -> " + Arrays.toString(fix45(new int[] {})));
		System.out.println("fix45([5, 4, 5, 4, 1]) -> " + Arrays.toString(fix45(new int[] {5, 4, 5, 4, 1})));
		System.out.println("fix45([4, 5, 4, 1, 5]) -> " + Arrays.toString(fix45(new int[] {4, 5, 4, 1, 5})));
		System.out.println("fix45([3, 4, 5]) -> " + Arrays.toString(fix45(new int[] {3, 4, 5})));
		System.out.println("fix45([4, 1, 5]) -> " + Arrays.toString(fix45(new int[] {4, 1, 5})));
		System.out.println("fix45([5, 4, 1]) -> " + Arrays.toString(fix45(new int[] {5, 4, 1})));
		System.out.println("fix45([2, 4, 2, 5]) -> " + Arrays.toString(fix45(new int[] {2, 4, 2, 5})));
		printMethod("canBalance");
		System.out.println("canBalance([1, 1, 1, 2, 1]) -> " + canBalance(new int[] {1, 1, 1, 2, 1}));
		System.out.println("canBalance([2, 1, 1, 2, 1]) -> " + canBalance(new int[] {2, 1, 1, 2, 1}));
		System.out.println("canBalance([10, 10]) -> " + canBalance(new int[] {10, 10}));
		System.out.println("canBalance([10, 0, 1, -1, 10]) -> " + canBalance(new int[] {10, 0, 1, -1, 10}));
		System.out.println("canBalance([1, 1, 1, 1, 4]) -> " + canBalance(new int[] {1, 1, 1, 1, 4}));
		System.out.println("canBalance([2, 1, 1, 1, 4]) -> " + canBalance(new int[] {2, 1, 1, 1, 4}));
		System.out.println("canBalance([2, 3, 4, 1, 2]) -> " + canBalance(new int[] {2, 3, 4, 1, 2}));
		System.out.println("canBalance([1, 2, 3, 1, 0, 2, 3]) -> " + canBalance(new int[] {1, 2, 3, 1, 0, 2, 3}));
		System.out.println("canBalance([1]) -> " + canBalance(new int[] {1}));
		System.out.println("canBalance([1, 1, 1, 2, 1]) -> " + canBalance(new int[] {1, 1, 1, 2, 1}));
		printMethod("linearIn");
		System.out.println("linearIn([1, 2, 4, 6], [2, 4]) -> " + linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 4}));
		System.out.println("linearIn([1, 2, 4, 6], [2, 3, 4]) -> " + linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}));
		System.out.println("linearIn([1, 2, 4, 4, 6], [2, 4]) -> " + linearIn(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4, 4}));
		System.out.println("linearIn([1, 2, 4, 4, 6, 6], [2, 4]) -> " + linearIn(new int[] {1, 2, 4, 4, 6, 6}, new int[] {2, 4}));
		System.out.println("linearIn([2, 2, 2, 2, 2], [2, 2]) -> " + linearIn(new int[] {2, 2, 2, 2, 2}, new int[] {2, 2}));
		System.out.println("linearIn([2, 2, 2, 2, 2], [2, 4]) -> " + linearIn(new int[] {2, 2, 2, 2, 2}, new int[] {2, 4}));
		System.out.println("linearIn([2, 2, 2, 2, 4], [2, 4]) -> " + linearIn(new int[] {2, 2, 2, 2, 4}, new int[] {2, 4}));
		System.out.println("linearIn([1, 2, 3], [2]) -> " + linearIn(new int[] {1, 2, 3}, new int[] {2}));
		System.out.println("linearIn([1, 2, 3], [-1]) -> " + linearIn(new int[] {1, 2, 3}, new int[] {-1}));
		System.out.println("linearIn([1, 2, 3], []) -> " + linearIn(new int[] {1, 2, 3}, new int[] {}));
		System.out.println("linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12]) -> " + linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 0, 3, 12}));
		System.out.println("linearIn([-1, 0, 3, 3, 3, 10, 12], [0, 3, 12, 14]) -> " + linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {0, 3, 12, 14}));
		System.out.println("linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 10, 11]) -> " + linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 10, 11}));
		printMethod("squareUp");
		System.out.println("squareUp(3) -> " + Arrays.toString(squareUp(3)));
		System.out.println("squareUp(2) -> " + Arrays.toString(squareUp(2)));
		System.out.println("squareUp(4) -> " + Arrays.toString(squareUp(4)));
		System.out.println("squareUp(1) -> " + Arrays.toString(squareUp(1)));
		System.out.println("squareUp(0) -> " + Arrays.toString(squareUp(0)));
		System.out.println("squareUp(6) -> " + Arrays.toString(squareUp(6)));
		printMethod("seriesUp");
		System.out.println("seriesUp(3) -> " + Arrays.toString(seriesUp(3)));
		System.out.println("seriesUp(4) -> " + Arrays.toString(seriesUp(4)));
		System.out.println("seriesUp(2) -> " + Arrays.toString(seriesUp(2)));
		System.out.println("seriesUp(1) -> " + Arrays.toString(seriesUp(1)));
		System.out.println("seriesUp(0) -> " + Arrays.toString(seriesUp(0)));
		System.out.println("seriesUp(6) -> " + Arrays.toString(seriesUp(6)));
		printMethod("maxMirror");
		System.out.println("maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) -> " + maxMirror(new int[] {1, 2, 3, 8, 9, 3, 2, 1}));
		System.out.println("maxMirror([1, 2, 1, 4]) -> " + maxMirror(new int[] {1, 2, 1, 4}));
		System.out.println("maxMirror([7, 1, 2, 9, 7, 2, 1]) -> " + maxMirror(new int[] {7, 1, 2, 9, 7, 2, 1}));
		System.out.println("maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9]) -> " + maxMirror(new int[] {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
		System.out.println("maxMirror([1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25]) -> " + maxMirror(new int[] {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}));
		System.out.println("maxMirror([1, 2, 3, 2, 1]) -> " + maxMirror(new int[] {1, 2, 3, 2, 1}));
		System.out.println("maxMirror([1, 2, 3, 3, 8]) -> " + maxMirror(new int[] {1, 2, 3, 3, 8}));
		System.out.println("maxMirror([1, 2, 7, 8, 1, 7, 2]) -> " + maxMirror(new int[] {1, 2, 7, 8, 1, 7, 2}));
		System.out.println("maxMirror([1, 1, 1]) -> " + maxMirror(new int[] {1, 1, 1}));
		System.out.println("maxMirror([1]) -> " + maxMirror(new int[] {1}));
		System.out.println("maxMirror([]) -> " + maxMirror(new int[] {}));
		System.out.println("maxMirror([9, 1, 1, 4, 2, 1, 1, 1]) -> " + maxMirror(new int[] {9, 1, 1, 4, 2, 1, 1, 1}));
		System.out.println("maxMirror([5, 9, 9, 4, 5, 4, 9, 9, 2]) -> " + maxMirror(new int[] {5, 9, 9, 4, 5, 4, 9, 9, 2}));
		System.out.println("maxMirror([5, 9, 9, 6, 5, 4, 9, 9, 2]) -> " + maxMirror(new int[] {5, 9, 9, 6, 5, 4, 9, 9, 2}));
		System.out.println("maxMirror([5, 9, 1, 6, 5, 4, 1, 9, 5]) -> " + maxMirror(new int[] {5, 9, 1, 6, 5, 4, 1, 9, 5}));
		printMethod("countClumps");
		System.out.println("countClumps([1, 2, 2, 3, 4, 4]) -> " + countClumps(new int[] {1, 2, 2, 3, 4, 4}));
		System.out.println("countClumps([1, 1, 2, 1, 1]) -> " + countClumps(new int[] {1, 1, 2, 1, 1}));
		System.out.println("countClumps([1, 1, 1, 1, 1]) -> " + countClumps(new int[] {1, 1, 1, 1, 1}));
		System.out.println("countClumps([1, 2, 3]) -> " + countClumps(new int[] {1, 2, 3}));
		System.out.println("countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) -> " + countClumps(new int[] {2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
		System.out.println("countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) -> " + countClumps(new int[] {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
		System.out.println("countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) -> " + countClumps(new int[] {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
		System.out.println("countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) -> " + countClumps(new int[] {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
		System.out.println("countClumps([]) -> " + countClumps(new int[] {}));
	}
}
