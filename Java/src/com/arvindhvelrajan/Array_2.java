package com.arvindhvelrajan;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static com.arvindhvelrajan.UI_Functions.*;

/**
 * @author arvindhvelrajan
 * @code This class is to demonstrate the implementation for all functions in Array-2 from codingbat.com
 */
public class Array_2
{
	/**
	 * This function introduces the user to the class that is being demonstrated.
	 */
	private void welcome()
	{
		System.out.println("\n\nArray-2 Functions\n");
	}

	/**
	 * Return the number of even ints in the given array.
	 * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
	 *
	 * countEvens([2, 1, 2, 3, 4]) → 3
	 * countEvens([2, 2, 0]) → 3
	 * countEvens([1, 3, 5]) → 0
	 */
	public int countEvens(int[] nums)
	{
		int count = 0;
		for(int num : nums)
		{
			if(num % 2 == 0)
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
	 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
	 *
	 * bigDiff([10, 3, 5, 6]) → 7
	 * bigDiff([7, 2, 10, 9]) → 8
	 * bigDiff([2, 10, 7, 2]) → 8
	 */
	public int bigDiff(int[] nums)
	{
		int min = nums[0], max = nums[0];
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
			if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max - min;
	}

	/**
	 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
	 * ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore
	 * just one copy, and likewise for the largest value. Use int division to produce the final average.
	 * You may assume that the array is length 3 or more.
	 *
	 * centeredAverage([1, 2, 3, 4, 100]) → 3
	 * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
	 * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
	 */
	public int centeredAverage(int[] nums)
	{
		int minIndex = 0, maxIndex = 0;
		int min = nums[minIndex], max = nums[maxIndex];
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				minIndex = i;
				min = nums[minIndex];
			}
			if(nums[i] > max)
			{
				maxIndex = i;
				max = nums[maxIndex];
			}
		}
		int sum = 0, length = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(i != minIndex && i != maxIndex)
			{
				sum += nums[i];
				length++;
			}
		}
		return sum / length;
	}

	/**
	 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
	 * so it does not count and numbers that come immediately after a 13 also do not count.
	 *
	 * sum13([1, 2, 2, 1]) → 6
	 * sum13([1, 1]) → 2
	 * sum13([1, 2, 2, 1, 13]) → 6
	 */
	public int sum13(int[] nums)
	{
		int i = 0;
		int sum = 0;
		while(i < nums.length)
		{
			if(nums[i] == 13)
			{
				i++;
			}
			else
			{
				sum += nums[i];
			}
			i++;
		}
		return sum;
	}

	/**
	 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to
	 * the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
	 *
	 * sum67([1, 2, 2]) → 5
	 * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
	 * sum67([1, 1, 6, 7, 2]) → 4
	 */
	public int sum67(int[] nums)
	{
		int sum = 0;
		boolean found = false;
		int i = 0;
		while(i < nums.length)
		{
			if(nums[i] == 6 && !found)
			{
				found = true;
			}
			else if(found && nums[i] == 7)
			{
				found = false;
			}
			else if(!found)
			{
				sum += nums[i];
			}
			i++;
		}
		return sum;
	}

	/**
	 * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
	 *
	 * has22([1, 2, 2]) → true
	 * has22([1, 2, 1, 2]) → false
	 * has22([2, 1, 2]) → false
	 */
	public boolean has22(int[] nums)
	{
		if(nums.length < 2)
		{
			return false;
		}
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == 2 && nums[i + 1] == 2)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the array contains no 1's and no 3's.
	 *
	 * lucky13([0, 2, 4]) → true
	 * lucky13([1, 2, 3]) → false
	 * lucky13([1, 2, 4]) → false
	 */
	public boolean lucky13(int[] nums)
	{
		for(int num : nums)
		{
			if(num == 1 || num == 3)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
	 *
	 * sum28([2, 3, 2, 2, 4, 2]) → true
	 * sum28([2, 3, 2, 2, 4, 2, 2]) → false
	 * sum28([1, 2, 3, 4]) → false
	 */
	public boolean sum28(int[] nums)
	{
		int count = 0;
		for(int num : nums)
		{
			if(num == 2)
			{
				count++;
			}
		}
		return count == 4;
	}

	/**
	 * Given an array of ints, return true if the number of 1's is greater than the number of 4's
	 *
	 * more14([1, 4, 1]) → true
	 * more14([1, 4, 1, 4]) → false
	 * more14([1, 1]) → true
	 */
	public boolean more14(int[] nums)
	{
		int countOnes = 0, countFours = 0;
		for(int num : nums)
		{
			if(num == 1)
			{
				countOnes++;
			}
			if(num == 4)
			{
				countFours++;
			}
		}
		return countOnes > countFours;
	}

	/**
	 * Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
	 * The given n may be 0, in which case just return a length 0 array.
	 * You do not need a separate if-statement for the length-0 case;
	 * the for-loop should naturally execute 0 times in that case, so it just works.
	 * The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
	 *
	 * fizzArray(4) → [0, 1, 2, 3]
	 * fizzArray(1) → [0]
	 * fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 */
	public int[] fizzArray(int n)
	{
		int[] newArray = new int[n];
		for(int i = 0; i < n; i++)
		{
			newArray[i] = i;
		}
		return newArray;
	}

	/**
	 * iven an array of ints, return true if every element is a 1 or a 4.
	 *
	 * only14([1, 4, 1, 4]) → true
	 * only14([1, 4, 2, 4]) → false
	 * only14([1, 1]) → true
	 */
	public boolean only14(int[] nums)
	{
		for(int num : nums)
		{
			if(num != 1 && num != 4)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Given a number n, create and return a new string array of length n, containing the strings
	 * "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
	 * Note: String.valueOf(xxx) will make the String form of most types.
	 * The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
	 *
	 * fizzArray2(4) → ["0", "1", "2", "3"]
	 * fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
	 * fizzArray2(2) → ["0", "1"]
	 */
	public String[] fizzArray2(int n)
	{
		String[] newArray = new String[n];
		for(int i = 0; i < n; i++)
		{
			newArray[i] = String.valueOf(i);
		}
		return newArray;
	}

	private String toString(String[] nums)
	{
		StringBuilder buff = new StringBuilder();
		buff.append("[");
		for(int i = 0; i < nums.length; i++)
		{
			buff.append("\"");
			buff.append(nums[i]);
			buff.append("\"");
			if(i != nums.length - 1)
			{
				buff.append(", ");
			}
		}
		buff.append("]");
		return buff.toString();
	}

	/**
	 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
	 *
	 * no14([1, 2, 3]) → true
	 * no14([1, 2, 3, 4]) → false
	 * no14([2, 3, 4]) → true
	 */
	public boolean no14(int[] nums)
	{
		boolean found1 = false, found4 = false;
		for(int num : nums)
		{
			if(num == 1)
			{
				found1 = true;
			}
			if(num == 4)
			{
				found4 = true;
			}
		}
		return !found1 || !found4;
	}

	/**
	 * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
	 * at least one of the pair is that value. Return true if the given value is everywhere in the array.
	 *
	 * isEverywhere([1, 2, 1, 3], 1) → true
	 * isEverywhere([1, 2, 1, 3], 2) → false
	 * isEverywhere([1, 2, 1, 3, 4], 1) → false
	 */
	public boolean isEverywhere(int[] nums, int val)
	{
		if(nums.length == 0)
		{
			return true;
		}
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(!(nums[i] == val || nums[i + 1] == val))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
	 *
	 * either24([1, 2, 2]) → true
	 * either24([4, 4, 1]) → true
	 * either24([4, 4, 1, 2, 2]) → false
	 */
	public boolean either24(int[] nums)
	{
		boolean found2 = false, found4 = false;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == 2 && nums[i + 1] == 2)
			{
				found2 = true;
			}
			if(nums[i] == 4 && nums[i + 1] == 4)
			{
				found4 = true;
			}
		}
		return found2 ^ found4;
	}

	/**
	 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
	 * consider the corresponding element in nums2 (at the same index).
	 * Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
	 *
	 * matchUp([1, 2, 3], [2, 3, 10]) → 2
	 * matchUp([1, 2, 3], [2, 3, 5]) → 3
	 * matchUp([1, 2, 3], [2, 3, 3]) → 2
	 */
	public int matchUp(int[] nums1, int[] nums2)
	{
		int count = 0;
		for(int i = 0; i < nums1.length; i++)
		{
			int num1 = nums1[i], num2 = nums2[i];
			if(num1 != num2 && Math.abs(num1 - num2) <= 2)
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
	 * separated by one element, such as with {7, 1, 7}.
	 *
	 * has77([1, 7, 7]) → true
	 * has77([1, 7, 1, 7]) → true
	 * has77([1, 7, 1, 1, 7]) → false
	 */
	public boolean has77(int[] nums)
	{
		if(nums.length < 2)
		{
			return false;
		}
		if(nums.length == 2)
		{
			if((nums[0] == 7) || (nums[1] == 7))
			{
				return (nums[0] == 7) && (nums[1] == 7);
			}
			return false;
		}
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7))
			{
				return true;
			}
		}
		if(nums[nums.length - 2] == 7)
		{
			return nums[nums.length - 1] == 7;
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
	 *
	 * has12([1, 3, 2]) → true
	 * has12([3, 1, 2]) → true
	 * has12([3, 1, 4, 5, 2]) → true
	 */
	public boolean has12(int[] nums)
	{
		boolean found = false;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 1 && !found)
			{
				found = true;
			}
			if(found && nums[i] == 2)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
	 *
	 * modThree([2, 1, 3, 5]) → true
	 * modThree([2, 1, 2, 5]) → false
	 * modThree([2, 4, 2, 5]) → true
	 */
	public boolean modThree(int[] nums)
	{
		if(nums.length < 3)
		{
			return false;
		}
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
			{
				return true;
			}
			else if(nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to
	 * each other.
	 *
	 * haveThree([3, 1, 3, 1, 3]) → true
	 * haveThree([3, 1, 3, 3]) → false
	 * haveThree([3, 4, 3, 3, 4]) → false
	 */
	public boolean haveThree(int[] nums)
	{
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 3)
			{
				if((i > 0 && nums[i - 1] == 3) || (i < nums.length - 1 && nums[i + 1] == 3))
				{
					return false;
				}
				count++;
			}
		}
		return count == 3;
	}

	/**
	 * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
	 *
	 * twoTwo([4, 2, 2, 3]) → true
	 * twoTwo([2, 2, 4]) → true
	 * twoTwo([2, 2, 4, 2]) → false
	 */
	public boolean twoTwo(int[] nums)
	{
		if(nums.length == 0)
		{
			return true;
		}
		if(nums.length == 1)
		{
			return nums[0] != 2;
		}
		if(nums.length == 2)
		{
			if(nums[0] == 2 || nums[1] == 2)
			{
				return nums[0] == 2 && nums[1] == 2;
			}
			return true;
		}
		if(nums[0] == 2 && nums[1] != 2)
		{
			return false;
		}
		for(int i = 1; i < nums.length - 1; i++)
		{
			if(nums[i] == 2 && !((nums[i - 1] == 2) || (nums[i + 1] == 2)))
			{
				return false;
			}
		}
		if(nums[nums.length - 1] == 2)
		{
			return nums[nums.length - 2] == 2;
		}
		return true;
	}


	/**
	 * Return true if the group of N numbers at the start and end of the array are the same.
	 * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
	 * You may assume that n is in the range 0..nums.length inclusive.
	 *
	 * sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
	 * sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
	 * sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
	 */
	public boolean sameEnds(int[] nums, int len)
	{
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < len; i++)
		{
			list1.add(nums[i]);
		}
		for(int i = nums.length - len; i < nums.length; i++)
		{
			list2.add(nums[i]);
		}
		for(int i = 0; i < list1.size(); i++)
		{
			int num1 = list1.get(i), num2 = list2.get(i);
			if(num1 != num2)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
	 *
	 * tripleUp([1, 4, 5, 6, 2]) → true
	 * tripleUp([1, 2, 3]) → true
	 * tripleUp([1, 2, 4]) → false
	 */
	public boolean tripleUp(int[] nums)
	{
		if(nums.length < 3)
		{
			return false;
		}
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2])
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given start and end numbers, return a new array containing the sequence of integers from start up to but not
	 * including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
	 * The end number will be greater or equal to the start number.
	 * Note that a length-0 array is valid. (See also: FizzBuzz Code)
	 *
	 * fizzArray3(5, 10) → [5, 6, 7, 8, 9]
	 * fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
	 * fizzArray3(1, 3) → [1, 2]
	 */
	public int[] fizzArray3(int start, int end)
	{
		int[] newArray = new int[end - start];
		int size = 0;
		for(int i = start; i < end; i++)
		{
			newArray[size++] = i;
		}
		return newArray;
	}

	/**
	 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
	 * You may modify and return the given array, or return a new array.
	 *
	 * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
	 * shiftLeft([1, 2]) → [2, 1]
	 * shiftLeft([1]) → [1]
	 */
	public int[] shiftLeft(int[] nums)
	{
		if(nums.length <= 1)
		{
			return nums;
		}
		int temp = nums[0];
		for(int i = 0; i < nums.length - 1; i++)
		{
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = temp;
		return nums;
	}

	/**
	 * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
	 * until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
	 *
	 * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
	 * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
	 * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
	 */
	public int[] tenRun(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a non-empty array of ints, return a new array containing the elements from the original array that
	 * come before the first 4 in the original array. The original array will contain at least one 4.
	 * Note that it is valid in java to create an array of length 0.
	 *
	 * pre4([1, 2, 4, 1]) → [1, 2]
	 * pre4([3, 1, 4]) → [3, 1]
	 * pre4([1, 4, 4]) → [1]
	 */
	public int[] pre4(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Given a non-empty array of ints, return a new array containing the elements from the original array that come
	 * after the last 4 in the original array. The original array will contain at least one 4.
	 * Note that it is valid in java to create an array of length 0.
	 *
	 * post4([2, 4, 1, 2]) → [1, 2]
	 * post4([4, 1, 4, 2]) → [2]
	 * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
	 */
	public int[] post4(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * We'll say that an element in an array is "alone" if there are values before and after it, and those values are
	 * different from it. Return a version of the given array where every instance of the given value which is alone is
	 * replaced by whichever value to its left or right is larger.
	 *
	 * notAlone([1, 2, 3], 2) → [1, 3, 3]
	 * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
	 * notAlone([3, 4], 3) → [3, 4]
	 */
	public int[] notAlone(int[] nums, int val)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
	 * grouped at the start of the array. The order of the non-zero numbers does not matter.
	 * So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
	 *
	 * zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
	 * zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
	 * zeroFront([1, 0]) → [0, 1]
	 */
	public int[] zeroFront(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return a version of the given array where all the 10's have been removed. The remaining elements should shift
	 * left towards the start of the array as needed, and the empty spaces at the end of the array should be 0.
	 * So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
	 *
	 * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
	 * withoutTen([10, 2, 10]) → [2, 0, 0]
	 * withoutTen([1, 99, 10]) → [1, 99, 0]
	 */
	public int[] withoutTen(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return a version of the given array where each zero value in the array is replaced by the largest odd value to
	 * the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
	 *
	 * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
	 * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
	 * zeroMax([0, 1, 0]) → [1, 1, 0]
	 */
	public int[] zeroMax(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the even
	 * numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and
	 * return the given array, or make a new array.
	 *
	 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
	 * evenOdd([3, 3, 2]) → [2, 3, 3]
	 * evenOdd([2, 2, 2]) → [2, 2, 2]
	 */
	public int[] evenOdd(int[] nums)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
	 * problem for job interviews. (See also: FizzBuzz Code.)
	 * Consider the series of numbers beginning at start and running up to but not including end,
	 * so for example start=1 and end=5 gives the series 1, 2, 3, 4.
	 * Return a new String[] array containing the string form of these numbers, except for multiples of 3,
	 * use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
	 * In Java, String.valueOf(xxx) will make the String form of an int or other type.
	 * This version is a little more complicated than the usual version since you have to allocate and index into an
	 * array instead of just printing, and we vary the start/end instead of just always doing 1..100.
	 *
	 * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
	 * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
	 * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
	 */
	public String[] fizzBuzz(int start, int end)
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
		printFunction("countEvens");
		System.out.println("countEvens([2, 1, 2, 3, 4]) → " + countEvens(new int[] {2, 1, 2 ,3, 4}));
		System.out.println("countEvens([2, 2, 0]) → " + countEvens(new int[] {2, 2, 0}));
		System.out.println("countEvens([1, 3, 5]) → " + countEvens(new int[] {1, 3, 5}));
		System.out.println("countEvens([]) → " + countEvens(new int[] {}));
		System.out.println("countEvens([11, 9, 0, 1]) → " + countEvens(new int[] {11, 9, 0, 1}));
		System.out.println("countEvens([2, 11, 9, 0]) → " + countEvens(new int[] {2, 11, 9, 0}));
		System.out.println("countEvens([2]) → " + countEvens(new int[] {2}));
		System.out.println("countEvens([2, 5, 12]) → " + countEvens(new int[] {2, 5, 12}));
		printFunction("bigDiff");
		System.out.println("bigDiff([10, 3, 5, 6]) → " + bigDiff(new int[] {10, 3, 5, 6}));
		System.out.println("bigDiff([7, 2, 10, 9]) → " + bigDiff(new int[] {7, 2, 10, 9}));
		System.out.println("bigDiff([2, 10, 7, 2]) → " + bigDiff(new int[] {2, 10, 7, 2}));
		System.out.println("bigDiff([bigDiff([2, 10]) → " + bigDiff(new int[] {2, 10}));
		System.out.println("bigDiff([10, 2]) → " + bigDiff(new int[] {10, 2}));
		System.out.println("bigDiff([10, 0]) → " + bigDiff(new int[] {10, 0}));
		System.out.println("bigDiff([2, 3]) → " + bigDiff(new int[] {2, 3}));
		System.out.println("bigDiff([2, 2]) → " + bigDiff(new int[] {2, 2}));
		System.out.println("bigDiff([2]) → " + bigDiff(new int[] {2}));
		System.out.println("bigDiff([5, 1, 6, 1, 9, 9]) → " + bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
		System.out.println("bigDiff([7, 6, 8, 5]) → " + bigDiff(new int[] {7, 6, 8, 5}));
		System.out.println("bigDiff([7, 7, 6, 8, 5, 5, 6]) → " + bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
		printFunction("centeredAverage");
		System.out.println("centeredAverage([1, 2, 3, 4, 100]) → " + centeredAverage(new int[] {1, 2, 3, 4, 100}));
		System.out.println("centeredAverage([1, 1, 5, 5, 10, 8, 7]) → " + centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));
		System.out.println("centeredAverage([-10, -4, -2, -4, -2, 0]) → " + centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
		System.out.println("centeredAverage([5, 3, 4, 6, 2]) → " + centeredAverage(new int[] {5, 3, 4, 6, 2}));
		System.out.println("centeredAverage([5, 3, 4, 0, 100]) → " + centeredAverage(new int[] {5, 3, 4, 0, 100}));
		System.out.println("centeredAverage([100, 0, 5, 3, 4]) → " + centeredAverage(new int[] {100, 0, 5, 3, 4}));
		System.out.println("centeredAverage([4, 0, 100]) → " + centeredAverage(new int[] {4, 0, 100}));
		System.out.println("centeredAverage([0, 2, 3, 4, 100]) → " + centeredAverage(new int[] {0, 2, 3, 4, 100}));
		System.out.println("centeredAverage([1, 1, 100]) → " + centeredAverage(new int[] {1, 1, 100}));
		System.out.println("centeredAverage([7, 7, 7]) → " + centeredAverage(new int[] {7, 7, 7}));
		System.out.println("centeredAverage([1, 7, 8]) → " + centeredAverage(new int[] {1, 7, 8}));
		System.out.println("centeredAverage([1, 1, 99, 99]) → " + centeredAverage(new int[] {1, 1, 99, 99}));
		System.out.println("centeredAverage([1000, 0, 1, 99]) → " + centeredAverage(new int[] {1000, 0, 1, 99}));
		System.out.println("centeredAverage([4, 4, 4, 4, 5]) → " + centeredAverage(new int[] {4, 4, 4, 4, 5}));
		System.out.println("centeredAverage([4, 4, 4, 1, 5]) → " + centeredAverage(new int[] {4, 4, 4, 1, 5}));
		System.out.println("centeredAverage([6, 4, 8, 12, 3]) → " + centeredAverage(new int[] {6, 4, 8, 12, 3}));
		printFunction("sum13");
		System.out.println("sum13([1, 2, 2, 1]) → " + sum13(new int[] {1, 2, 2, 1}));
		System.out.println("sum13([1, 1]) → " + sum13(new int[] {1, 1}));
		System.out.println("sum13([1, 2, 2, 1, 13]) → " + sum13(new int[] {1, 2, 2, 1, 13}));
		System.out.println("sum13([1, 2, 13, 2, 1, 13]) → " + sum13(new int[] {1, 2, 13, 2, 1, 13}));
		System.out.println("sum13([13, 1, 2, 13, 2, 1, 13]) → " + sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));
		System.out.println("sum13([]) → " + sum13(new int[] {}));
		System.out.println("sum13([13]) → " + sum13(new int[] {13}));
		System.out.println("sum13([13, 13]) → " + sum13(new int[] {13, 13}));
		System.out.println("sum13([13, 0, 13]) → " + sum13(new int[] {13, 0, 13}));
		System.out.println("sum13([13, 1, 13]) → " + sum13(new int[] {13, 1, 13}));
		System.out.println("sum13([5, 7, 2]) → " + sum13(new int[] {5, 7, 2}));
		System.out.println("sum13([5, 13, 2]) → " + sum13(new int[] {5, 13, 2}));
		System.out.println("sum13([0]) → " + sum13(new int[] {0}));
		System.out.println("sum13([13, 0]) → " + sum13(new int[] {13, 0}));
		printFunction("sum67");
		System.out.println("sum67([1, 2, 2]) → " + sum67(new int[] {1, 2, 2}));
		System.out.println("sum67([1, 2, 2, 6, 99, 99, 7]) → " + sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
		System.out.println("sum67([1, 1, 6, 7, 2]) → " + sum67(new int[] {1, 1, 6, 7, 2}));
		System.out.println("sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) → " + sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
		System.out.println("sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) → " + sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
		System.out.println("sum67([2, 7, 6, 2, 6, 7, 2, 7]) → " + sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7}));
		System.out.println("sum67([2, 7, 6, 2, 6, 2, 7]) → " + sum67(new int[] {2, 7, 6, 2, 6, 2, 7}));
		System.out.println("sum67([1, 6, 7, 7]) → " + sum67(new int[] {1, 6, 7, 7}));
		System.out.println("sum67([6, 7, 1, 6, 7, 7]) → " + sum67(new int[] {6, 7, 1, 6, 7, 7}));
		System.out.println("sum67([6, 8, 1, 6, 7]) → " + sum67(new int[] {6, 8, 1, 6, 7}));
		System.out.println("sum67([]) → " + sum67(new int[] {}));
		System.out.println("sum67([6, 7, 11]) → " + sum67(new int[] {6, 7, 11}));
		System.out.println("sum67([11, 6, 7, 11]) → " + sum67(new int[] {11, 6, 7, 11}));
		System.out.println("sum67([2, 2, 6, 7, 7]) → " + sum67(new int[] {2, 2, 6, 7, 7}));
		printFunction("has22");
		System.out.println("has22([1, 2, 2]) → " + has22(new int[] {1, 2, 2}));
		System.out.println("has22([1, 2, 1, 2]) → " + has22(new int[] {1, 2, 1, 2}));
		System.out.println("has22([2, 1, 2]) → " + has22(new int[] {2, 1, 2}));
		System.out.println("has22([2, 2, 1, 2]) → " + has22(new int[] {2, 2, 1, 2}));
		System.out.println("has22([1, 3, 2]) → " + has22(new int[] {1, 3, 2}));
		System.out.println("has22([1, 3, 2, 2]) → " + has22(new int[] {1, 3, 2, 2}));
		System.out.println("has22([2, 3, 2, 2]) → " + has22(new int[] {2, 3, 2, 2}));
		System.out.println("has22([4, 2, 4, 2, 2, 5]) → " + has22(new int[] {4, 2, 4, 2, 2, 5}));
		System.out.println("has22([1, 2]) → " + has22(new int[] {1, 2}));
		System.out.println("has22([2, 2]) → " + has22(new int[] {2, 2}));
		System.out.println("has22([2]) → " + has22(new int[] {2}));
		System.out.println("has22([]]) → " + has22(new int[] {}));
		System.out.println("has22([3, 3, 2, 2]) → " + has22(new int[] {3, 3, 2, 2}));
		System.out.println("has22([5, 2, 5, 2]) → " + has22(new int[] {5, 2, 5, 2}));
		printFunction("lucky13");
		System.out.println("lucky13([0, 2, 4]) → " + lucky13(new int[] {0, 2, 4}));
		System.out.println("lucky13([1, 2, 3]) → " + lucky13(new int[] {1, 2, 3}));
		System.out.println("lucky13([1, 2, 4]) → " + lucky13(new int[] {1, 2, 4}));
		System.out.println("lucky13([2, 7, 2, 8]) → " + lucky13(new int[] {2, 7, 2, 8}));
		System.out.println("lucky13([2, 7, 1, 8]) → " + lucky13(new int[] {2, 7, 1, 8}));
		System.out.println("lucky13([3, 7, 2, 8]) → " + lucky13(new int[] {3, 7, 2, 8}));
		System.out.println("lucky13([2, 7, 2, 1]) → " + lucky13(new int[] {2, 7, 2, 1}));
		System.out.println("lucky13([1, 2]) → " + lucky13(new int[] {1, 2}));
		System.out.println("lucky13([2, 2]) → " + lucky13(new int[] {2, 2}));
		System.out.println("lucky13([2]]) → " + lucky13(new int[] {2}));
		System.out.println("lucky13([3]) → " + lucky13(new int[] {3}));
		System.out.println("lucky13([]) → " + lucky13(new int[] {}));
		printFunction("sum28");
		System.out.println("sum28([2, 3, 2, 2, 4, 2]) → " + sum28(new int[] {2, 3, 2, 2, 4, 2}));
		System.out.println("sum28([2, 3, 2, 2, 4, 2, 2]) → " + sum28(new int[] {2, 3, 2, 2, 4, 2, 2}));
		System.out.println("sum28([1, 2, 3, 4]) → " + sum28(new int[] {1, 2, 3, 4}));
		System.out.println("sum28([2, 2, 2, 2]) → " + sum28(new int[] {2, 2, 2, 2}));
		System.out.println("sum28([1, 2, 2, 2, 2, 4]) → " + sum28(new int[] {1, 2, 2, 2, 2, 4}));
		System.out.println("sum28([]) → " + sum28(new int[] {}));
		System.out.println("sum28([2]) → " + sum28(new int[] {2}));
		System.out.println("sum28([8]) → " + sum28(new int[] {8}));
		System.out.println("sum28([2, 2, 2]) → " + sum28(new int[] {2, 2, 2}));
		System.out.println("sum28([2, 2, 2, 2, 2]) → " + sum28(new int[] {2, 2, 2, 2, 2}));
		System.out.println("sum28([1, 2, 2, 1, 2, 2]) → " + sum28(new int[] {1, 2, 2, 1, 2, 2}));
		System.out.println("sum28([5, 2, 2, 2, 4, 2]) → " + sum28(new int[] {5, 2, 2, 2, 4, 2}));
		printFunction("more14");
		System.out.println("more14([1, 4, 1]) → " + more14(new int[] {1, 4, 1}));
		System.out.println("more14([1, 4, 1, 4]) → " + more14(new int[] {1, 4, 1, 4}));
		System.out.println("more14([1, 1]) → " + more14(new int[] {1, 1}));
		System.out.println("more14([1, 6, 6]) → " + more14(new int[] {1, 6, 6}));
		System.out.println("more14([1]) → " + more14(new int[] {1}));
		System.out.println("more14([1, 4]) → " + more14(new int[] {1, 4}));
		System.out.println("more14([6, 1, 1]) → " + more14(new int[] {6, 1, 1}));
		System.out.println("more14([1, 6, 4]) → " + more14(new int[] {1, 6, 4}));
		System.out.println("more14([1, 1, 4, 4, 1]) → " + more14(new int[] {1, 1, 4, 4, 1}));
		System.out.println("more14([1, 1, 6, 4, 4, 1]) → " + more14(new int[] {1, 1, 6, 4, 4, 1}));
		System.out.println("more14([]) → " + more14(new int[] {}));
		System.out.println("more14([4, 1, 4, 6]) → " + more14(new int[] {4, 1, 4, 6}));
		System.out.println("more14([4, 1, 4, 6, 1]) → " + more14(new int[] {4, 1, 4, 6, 1}));
		System.out.println("more14([1, 4, 1, 4, 1, 6]) → " + more14(new int[] {1, 4, 1, 4, 1, 6}));
		printFunction("fizzArray");
		System.out.println("fizzArray(4) → " + Arrays.toString(fizzArray(4)));
		System.out.println("fizzArray(1) → " + Arrays.toString(fizzArray(1)));
		System.out.println("fizzArray(10) → " + Arrays.toString(fizzArray(10)));
		System.out.println("fizzArray(0) → " + Arrays.toString(fizzArray(0)));
		System.out.println("fizzArray(2) → " + Arrays.toString(fizzArray(2)));
		System.out.println("fizzArray(7) → " + Arrays.toString(fizzArray(7)));
		printFunction("only14");
		System.out.println("only14([1, 4, 1, 4]) → " + only14(new int[] {1, 4, 1, 4}));
		System.out.println("only14([1, 4, 2, 4]) → " + only14(new int[] {1, 4, 2, 4}));
		System.out.println("only14([1, 1]) → " + only14(new int[] {1, 1}));
		System.out.println("only14([4, 1]) → " + only14(new int[] {4, 1}));
		System.out.println("only14([2]) → " + only14(new int[] {2}));
		System.out.println("only14([]) → " + only14(new int[] {}));
		System.out.println("only14([1, 4, 1, 3]) → " + only14(new int[] {1, 4, 1, 3}));
		System.out.println("only14([3, 1, 3]) → " + only14(new int[] {3, 1, 3}));
		System.out.println("only14([1]) → " + only14(new int[] {1}));
		System.out.println("only14([4]) → " + only14(new int[] {4}));
		System.out.println("only14([3, 4]) → " + only14(new int[] {3, 4}));
		System.out.println("only14([1, 3, 4]) → " + only14(new int[] {1, 3, 4}));
		System.out.println("only14([1, 1, 1]) → " + only14(new int[] {1, 1, 1}));
		System.out.println("only14([1, 1, 1, 5]) → " + only14(new int[] {1, 1, 1, 5}));
		System.out.println("only14([4, 1, 4, 1]) → " + only14(new int[] {4, 1, 4, 1}));
		printFunction("fizzArray2");
		System.out.println("fizzArray2(4) → " + toString(fizzArray2(4)));
		System.out.println("fizzArray2(10) → " + toString(fizzArray2(10)));
		System.out.println("fizzArray2(2) → " + toString(fizzArray2(2)));
		System.out.println("fizzArray2(1) → " + toString(fizzArray2(1)));
		System.out.println("fizzArray2(0) → " + toString(fizzArray2(0)));
		System.out.println("fizzArray2(7) → " + toString(fizzArray2(7)));
		System.out.println("fizzArray2(9) → " + toString(fizzArray2(9)));
		System.out.println("fizzArray2(11) → " + toString(fizzArray2(11)));
		printFunction("no14");
		System.out.println("no14([1, 2, 3]) → " + no14(new int[] {1, 2, 3}));
		System.out.println("no14([1, 2, 3, 4]) → " + no14(new int[] {1, 2, 3, 4}));
		System.out.println("no14([2, 3, 4]) → " + no14(new int[] {2, 3, 4}));
		System.out.println("no14([1, 1, 4, 4]) → " + no14(new int[] {1, 1, 4, 4}));
		System.out.println("no14([2, 2, 4, 4]) → " + no14(new int[] {2, 2, 4, 4}));
		System.out.println("no14([2, 3, 4, 1]) → " + no14(new int[] {2, 3, 4, 1}));
		System.out.println("no14([2, 1, 1]) → " + no14(new int[] {2, 1, 1}));
		System.out.println("no14([1, 4]) → " + no14(new int[] {1, 4}));
		System.out.println("no14([2]) → " + no14(new int[] {2}));
		System.out.println("no14([2, 1]) → " + no14(new int[] {2, 1}));
		System.out.println("no14([1]) → " + no14(new int[] {1}));
		System.out.println("no14([4]) → " + no14(new int[] {4}));
		System.out.println("no14([]) → " + no14(new int[] {}));
		System.out.println("no14([1, 1, 1, 1]) → " + no14(new int[] {1, 1, 1, 1}));
		System.out.println("no14([9, 4, 4, 1]) → " + no14(new int[] {9, 4, 4, 1}));
		System.out.println("no14([4, 2, 3, 1]) → " + no14(new int[] {4, 2, 3, 1}));
		System.out.println("no14([4, 2, 3, 5]) → " + no14(new int[] {4, 2, 3, 5}));
		System.out.println("no14([4, 4, 2]) → " + no14(new int[] {4, 4, 2}));
		System.out.println("no14([1, 4, 4]) → " + no14(new int[] {1, 4, 4}));
		printFunction("isEverywhere");
		System.out.println("isEverywhere([1, 2, 1, 3], 1) → " + isEverywhere(new int[] {1, 2, 1, 3}, 1));
		System.out.println("isEverywhere([1, 2, 1, 3], 2) → " + isEverywhere(new int[] {1, 2, 1, 3}, 2));
		System.out.println("isEverywhere([1, 2, 1, 3, 4], 1) → " + isEverywhere(new int[] {1, 2, 1, 3, 4}, 1));
		System.out.println("isEverywhere([2, 1, 2, 1], 1) → " + isEverywhere(new int[] {2, 1, 2, 1}, 1));
		System.out.println("isEverywhere([2, 1, 2, 1], 2) → " + isEverywhere(new int[] {2, 1, 2, 1}, 2));
		System.out.println("isEverywhere([2, 1, 2, 3, 1], 2) → " + isEverywhere(new int[] {2, 1, 2, 3, 1}, 2));
		System.out.println("isEverywhere([3, 1], 3) → " + isEverywhere(new int[] {3, 1}, 3));
		System.out.println("isEverywhere([3, 1], 2) → " + isEverywhere(new int[] {3, 1}, 2));
		System.out.println("isEverywhere([3], 1) → " + isEverywhere(new int[] {3}, 1));
		System.out.println("isEverywhere([], 1) → " + isEverywhere(new int[] {}, 1));
		System.out.println("isEverywhere([1, 2, 1, 2, 3, 2, 5], 2) → " + isEverywhere(new int[] {1, 2, 1, 2, 3, 2, 5}, 2));
		System.out.println("isEverywhere([1, 2, 1, 1, 1, 2], 2) → " + isEverywhere(new int[] {1, 2, 1, 1, 1, 2}, 2));
		System.out.println("isEverywhere([2, 1, 2, 1, 1, 2], 2) → " + isEverywhere(new int[] {2, 1, 2, 1, 1, 2}, 2));
		System.out.println("isEverywhere([2, 1, 2, 2, 2, 1, 1, 2], 2) → " + isEverywhere(new int[] {2, 1, 2, 2, 2, 2, 1, 1, 2}, 2));
		System.out.println("isEverywhere([2, 1, 2, 2, 2, 1, 2, 1], 2) → " + isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 2, 1}, 2));
		System.out.println("isEverywhere([2, 1, 2, 1, 2], 2) → " + isEverywhere(new int[] {2, 1, 2, 1, 2}, 2));
		printFunction("either24");
		System.out.println("either24([1, 2, 2]) → " + either24(new int[] {1, 2, 2}));
		System.out.println("either24([4, 4, 1]) → " + either24(new int[] {4, 4, 1}));
		System.out.println("either24([4, 4, 1, 2, 2]) → " + either24(new int[] {4, 4, 1, 2, 2}));
		System.out.println("either24([1, 2, 3, 4]) → " + either24(new int[] {1, 2, 3, 4}));
		System.out.println("either24([3, 5, 9]) → " + either24(new int[] {3, 5, 9}));
		System.out.println("either24([1, 2, 3, 4, 4]) → " + either24(new int[] {1, 2, 3, 4, 4}));
		System.out.println("either24([2, 2, 3, 4]) → " + either24(new int[] {2, 2, 3, 4}));
		System.out.println("either24([1, 2, 3, 2, 2, 4]) → " + either24(new int[] {1, 2, 3, 2, 2, 4}));
		System.out.println("either24([1, 2, 3, 2, 2, 4, 4]) → " + either24(new int[] {1, 2, 3, 2, 2, 4, 4}));
		System.out.println("either24([1, 2]) → " + either24(new int[] {1, 2}));
		System.out.println("either24([2, 2]) → " + either24(new int[] {2, 2}));
		System.out.println("either24([4, 4]) → " + either24(new int[] {4, 4}));
		System.out.println("either24([2]) → " + either24(new int[] {2}));
		System.out.println("either24([]) → " + either24(new int[] {}));
		printFunction("matchUp");
		System.out.println("matchUp([1, 2, 3], [2, 3, 10]) → " + matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 10}));
		System.out.println("matchUp([1, 2, 3], [2, 3, 5]) → " + matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 5}));
		System.out.println("matchUp([1, 2, 3], [2, 3, 3]) → " + matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 3}));
		System.out.println("matchUp([5, 3], [5, 5]) → " + matchUp(new int[] {5, 3}, new int[] {5, 5}));
		System.out.println("matchUp([5, 3], [4, 4]) → " + matchUp(new int[] {5, 3}, new int[] {4, 4}));
		System.out.println("matchUp([5, 3], [3, 3]) → " + matchUp(new int[] {5, 3}, new int[] {3, 3}));
		System.out.println("matchUp([5, 3], [2, 2]) → " + matchUp(new int[] {5, 3}, new int[] {2, 2}));
		System.out.println("matchUp([5, 3], [1, 1]) → " + matchUp(new int[] {5, 3}, new int[] {1, 1}));
		System.out.println("matchUp([5, 3], [0, 0]) → " + matchUp(new int[] {5, 3}, new int[] {0, 0}));
		System.out.println("matchUp([4], [4]) → " + matchUp(new int[] {4}, new int[] {4}));
		System.out.println("matchUp([4], [5]) → " + matchUp(new int[] {4}, new int[] {5}));
		printFunction("has77");
		System.out.println("has77([1, 7, 7]) → " + has77(new int[] {1, 7, 7}));
		System.out.println("has77([1, 7, 1, 7]) → " + has77(new int[] {1, 7, 1, 7}));
		System.out.println("has77([1, 7, 1, 1, 7]) → " + has77(new int[] {1, 7, 1, 1, 7}));
		System.out.println("has77([7, 7, 1, 1, 7]) → " + has77(new int[] {7, 7, 1, 1, 7}));
		System.out.println("has77([2, 7, 2, 2, 7, 2]) → " + has77(new int[] {2, 7, 2, 2, 7, 2}));
		System.out.println("has77([2, 7, 2, 2, 7, 7]) → " + has77(new int[] {2, 7, 2, 2, 7, 7}));
		System.out.println("has77([7, 2, 7, 2, 2, 7]) → " + has77(new int[] {7, 2, 7, 2, 2, 7}));
		System.out.println("has77([7, 2, 6, 2, 2, 7]) → " + has77(new int[] {7, 2, 6, 2, 2, 7}));
		System.out.println("has77([7, 7, 7]) → " + has77(new int[] {7, 7, 7}));
		System.out.println("has77([7, 1, 7]) → " + has77(new int[] {7, 1, 7}));
		System.out.println("has77([7, 1, 1]) → " + has77(new int[] {7, 1, 1}));
		System.out.println("has77([1, 2]) → " + has77(new int[] {1, 2}));
		System.out.println("has77([1, 7]) → " + has77(new int[] {1, 7}));
		System.out.println("has77([7]) → " + has77(new int[] {7}));
		printFunction("has12");
		System.out.println("has12([1, 3, 2]) → " + has12(new int[] {1, 3, 2}));
		System.out.println("has12([3, 1, 2]) → " + has12(new int[] {3, 1, 2}));
		System.out.println("has12([3, 1, 4, 5, 2]) → " + has12(new int[] {3, 1, 4, 5, 2}));
		System.out.println("has12([3, 1, 4, 5, 6]) → " + has12(new int[] {3, 1, 4, 5, 6}));
		System.out.println("has12([3, 1, 4, 1, 6, 2]) → " + has12(new int[] {3, 1, 4, 1, 6, 2}));
		System.out.println("has12([2, 1, 4, 1, 6, 2]) → " + has12(new int[] {2, 1, 4, 1, 6, 2}));
		System.out.println("has12([2, 1, 4, 1, 6]) → " + has12(new int[] {2, 1, 4, 1, 6}));
		System.out.println("has12([1]) → " + has12(new int[] {1}));
		System.out.println("has12([2, 1, 3]) → " + has12(new int[] {2, 1, 3}));
		System.out.println("has12([2, 1, 3, 2]) → " + has12(new int[] {2, 1, 3, 2}));
		System.out.println("has12([2]) → " + has12(new int[] {2}));
		System.out.println("has12([3, 2]) → " + has12(new int[] {3, 2}));
		System.out.println("has12([3, 1, 3, 2]) → " + has12(new int[] {3, 1, 3, 2}));
		System.out.println("has12([3, 5, 9]) → " + has12(new int[] {3, 5, 9}));
		System.out.println("has12([3, 5, 1]) → " + has12(new int[] {3, 5, 1}));
		System.out.println("has12([3, 2, 1]) → " + has12(new int[] {3, 2, 1}));
		System.out.println("has12([1, 2]) → " + has12(new int[] {1, 2}));
		printFunction("modThree");
		System.out.println("modThree([2, 1, 3, 5]) → " + modThree(new int[] {2, 1, 3, 5}));
		System.out.println("modThree([2, 1, 2, 5]) → " + modThree(new int[] {2, 1, 2, 5}));
		System.out.println("modThree([2, 4, 2, 5]) → " + modThree(new int[] {2, 4, 2, 5}));
		System.out.println("modThree([1, 2, 1, 2, 1]) → " + modThree(new int[] {1, 2, 1, 2, 1}));
		System.out.println("modThree([9, 9, 9]) → " + modThree(new int[] {9, 9, 9}));
		System.out.println("modThree([1, 2, 1]) → " + modThree(new int[] {1, 2, 1}));
		System.out.println("modThree([1, 2]) → " + modThree(new int[] {1, 2}));
		System.out.println("modThree([1]) → " + modThree(new int[] {1}));
		System.out.println("modThree([]) → " + modThree(new int[] {}));
		System.out.println("modThree([9, 7, 2, 9]) → " + modThree(new int[] {9, 7, 2, 9}));
		System.out.println("modThree([9, 7, 2, 9, 2, 2]) → " + modThree(new int[] {9, 7, 2, 9, 2, 2}));
		System.out.println("modThree([9, 7, 2, 9, 2, 2, 6]) → " + modThree(new int[] {9, 7, 2, 9, 2, 2, 6}));
		printFunction("haveThree");
		System.out.println("haveThree([3, 1, 3, 1, 3]) → " + haveThree(new int[] {3, 1, 3, 1, 3}));
		System.out.println("haveThree([3, 1, 3, 3]) → " + haveThree(new int[] {3, 1, 3, 3}));
		System.out.println("haveThree([3, 4, 3, 3, 4]) → " + haveThree(new int[] {3, 4, 3, 3, 4}));
		System.out.println("haveThree([1, 3, 1, 3, 1, 2]) → " + haveThree(new int[] {1, 3, 1, 3, 1, 2}));
		System.out.println("haveThree([1, 3, 3, 1, 3]) → " + haveThree(new int[] {1, 3, 3, 1, 3}));
		System.out.println("haveThree([1, 3, 1, 3, 1, 3, 4, 3]) → " + haveThree(new int[] {1, 3, 1, 3, 1, 3, 4, 3}));
		System.out.println("haveThree([3, 4, 3, 4, 3, 4, 4]) → " + haveThree(new int[] {3, 4, 3, 4, 3, 4, 4}));
		System.out.println("haveThree([3, 3, 3]) → " + haveThree(new int[] {3, 3, 3}));
		System.out.println("haveThree([1, 3]) → " + haveThree(new int[] {1, 3}));
		System.out.println("haveThree([3]) → " + haveThree(new int[] {3}));
		System.out.println("haveThree([1]) → " + haveThree(new int[] {1}));
		printFunction("twoTwo");
		System.out.println("twoTwo([4, 2, 2, 3]) → " + twoTwo(new int[] {4, 2, 2, 3}));
		System.out.println("twoTwo([2, 2, 4]) → " + twoTwo(new int[] {2, 2, 4}));
		System.out.println("twoTwo([2, 2, 4, 2]) → " + twoTwo(new int[] {2, 2, 4, 2}));
		System.out.println("twoTwo([1, 3, 4]) → " + twoTwo(new int[] {1, 3, 4}));
		System.out.println("twoTwo([1, 2, 2, 3, 4]) → " + twoTwo(new int[] {1, 2, 2, 3, 4}));
		System.out.println("twoTwo([1, 2, 3, 4]) → " + twoTwo(new int[] {1, 2, 3, 4}));
		System.out.println("twoTwo([2, 2]) → " + twoTwo(new int[] {2, 2}));
		System.out.println("twoTwo([2, 2, 7]) → " + twoTwo(new int[] {2, 2, 7}));
		System.out.println("twoTwo([2, 2, 7, 2, 1]) → " + twoTwo(new int[] {2, 2, 7, 2, 1}));
		System.out.println("twoTwo([4, 2, 2, 2]) → " + twoTwo(new int[] {4, 2, 2, 2}));
		System.out.println("twoTwo([2, 2, 2]) → " + twoTwo(new int[] {2, 2, 2}));
		System.out.println("twoTwo([1, 2]) → " + twoTwo(new int[] {1, 2}));
		System.out.println("twoTwo([2]) → " + twoTwo(new int[] {2}));
		System.out.println("twoTwo([1]) → " + twoTwo(new int[] {1}));
		System.out.println("twoTwo([]) → " + twoTwo(new int[] {}));
		System.out.println("twoTwo([5, 2, 2, 3]) → " + twoTwo(new int[] {5, 2, 2, 3}));
		System.out.println("twoTwo([2, 2, 5, 2]) → " + twoTwo(new int[] {2, 2, 5, 2}));
		printFunction("sameEnds");
		System.out.println("sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → " + sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 1));
		System.out.println("sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → " + sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 2));
		System.out.println("sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → " + sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 3));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 1) → " + sameEnds(new int[] {1, 2, 5, 2, 1}, 1));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 2) → " + sameEnds(new int[] {1, 2, 5, 2, 1}, 2));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 0) → " + sameEnds(new int[] {1, 2, 5, 2, 1}, 0));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 5) → " + sameEnds(new int[] {1, 2, 5, 2, 1}, 5));
		System.out.println("sameEnds([1, 1, 1], 0) → " + sameEnds(new int[] {1, 1, 1}, 0));
		System.out.println("sameEnds([1, 1, 1], 1) → " + sameEnds(new int[] {1, 1, 1}, 1));
		System.out.println("sameEnds([1, 1, 1], 2) → " + sameEnds(new int[] {1, 1, 1}, 2));
		System.out.println("sameEnds([1, 1, 1], 3) → " + sameEnds(new int[] {1, 1, 1}, 3));
		System.out.println("sameEnds([1], 1) → " + sameEnds(new int[] {1}, 1));
		System.out.println("sameEnds([], 0) → " + sameEnds(new int[] {}, 0));
		System.out.println("sameEnds([4, 2, 4, 5], 1) → " + sameEnds(new int[] {4, 2, 4, 5}, 1));
		printFunction("tripleUp");
		System.out.println("tripleUp([1, 4, 5, 6, 2]) → " + tripleUp(new int[] {1, 4, 5, 6, 2}));
		System.out.println("tripleUp([1, 2, 3]) → " + tripleUp(new int[] {1, 2, 3}));
		System.out.println("tripleUp([1, 2, 4]) → " + tripleUp(new int[] {1, 2, 4}));
		System.out.println("tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6]) → " + tripleUp(new int[] {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
		System.out.println("tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]) → " + tripleUp(new int[] {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}));
		System.out.println("tripleUp([1, 2]) → " + tripleUp(new int[] {1, 2}));
		System.out.println("tripleUp([1]) → " + tripleUp(new int[] {1}));
		System.out.println("tripleUp([]) → " + tripleUp(new int[] {}));
		System.out.println("tripleUp([10, 9, 8, -100, -99, -98, 100]) → " + tripleUp(new int[] {10, 9, 8, -100, -99, -98, 100}));
		System.out.println("tripleUp([10, 9, 8, -100, -99, 99, 100]) → " + tripleUp(new int[] {10, 9, 8, -100, -99, 99, 100}));
		System.out.println("tripleUp([-100, -99, -99, 100, 101, 102]) → " + tripleUp(new int[] {-100, -99, -99, 100, 101, 102}));
		System.out.println("tripleUp([2, 3, 5, 6, 8, 9, 2, 3]) → " + tripleUp(new int[] {2, 3, 5, 6, 8, 9, 2, 3}));
		printFunction("fizzArray3");
		System.out.println("fizzArray3(5, 10) → " + Arrays.toString(fizzArray3(5, 10)));
		System.out.println("fizzArray3(11, 18) → " + Arrays.toString(fizzArray3(11, 18)));
		System.out.println("fizzArray3(1, 3) → " + Arrays.toString(fizzArray3(1, 3)));
		System.out.println("fizzArray3(1, 2) → " + Arrays.toString(fizzArray3(1, 2)));
		System.out.println("fizzArray3(1, 1) → " + Arrays.toString(fizzArray3(1, 1)));
		System.out.println("fizzArray3(1000, 1005) → " + Arrays.toString(fizzArray3(1000, 1005)));
		printFunction("shiftLeft");
		System.out.println("shiftLeft([6, 2, 5, 3]) → " + Arrays.toString(shiftLeft(new int[] {6, 2, 5, 3})));
		System.out.println("shiftLeft([1, 2]) → " + Arrays.toString(shiftLeft(new int[] {1, 2})));
		System.out.println("shiftLeft([1]) → " + Arrays.toString(shiftLeft(new int[] {1})));
		System.out.println("shiftLeft([]) → " + Arrays.toString(shiftLeft(new int[] {})));
		System.out.println("shiftLeft([1, 1, 2, 2, 4]) → " + Arrays.toString(shiftLeft(new int[] {1, 1, 2, 2, 4})));
		System.out.println("shiftLeft([1, 1, 1]) → " + Arrays.toString(shiftLeft(new int[] {1, 1, 1})));
		System.out.println("shiftLeft([1, 2, 3]) → " + Arrays.toString(shiftLeft(new int[] {1, 2, 3})));
		printFunction("tenRun");
		System.out.println("tenRun([2, 10, 3, 4, 20, 5]) → " + Arrays.toString(tenRun(new int[] {2, 10, 3, 4, 20, 5})));
		System.out.println("tenRun([10, 1, 20, 2]) → " + Arrays.toString(tenRun(new int[] {10, 1, 20, 2})));
		System.out.println("tenRun([10, 1, 9, 20]) → " + Arrays.toString(tenRun(new int[] {10, 1, 9, 20})));
		System.out.println("tenRun([1, 2, 50, 1]) → " + Arrays.toString(tenRun(new int[] {1, 2, 50, 1})));
		System.out.println("tenRun([1, 20, 50, 1]) → " + Arrays.toString(tenRun(new int[] {1, 20, 50, 1})));
		System.out.println("tenRun([10, 10]) → " + Arrays.toString(tenRun(new int[] {10, 10})));
		System.out.println("tenRun([10, 2]) → " + Arrays.toString(tenRun(new int[] {10, 2})));
		System.out.println("tenRun([0, 2]) → " + Arrays.toString(tenRun(new int[] {0, 2})));
		System.out.println("tenRun([1, 2]) → " + Arrays.toString(tenRun(new int[] {1, 2})));
		System.out.println("tenRun([1]) → " + Arrays.toString(tenRun(new int[] {1})));
		System.out.println("tenRun([]) → " + Arrays.toString(tenRun(new int[] {})));
		printFunction("pre4");
		System.out.println("pre4([1, 2, 4, 1]) → " + Arrays.toString(pre4(new int[] {1, 2, 4, 1})));
		System.out.println("pre4([3, 1, 4]) → " + Arrays.toString(pre4(new int[] {3, 1, 4})));
		System.out.println("pre4([1, 4, 4]) → " + Arrays.toString(pre4(new int[] {1, 4, 4})));
		System.out.println("pre4([1, 4, 4, 2]) → " + Arrays.toString(pre4(new int[] {1, 4, 4, 2})));
		System.out.println("pre4([1, 3, 4, 2, 4]) → " + Arrays.toString(pre4(new int[] {1, 3, 4, 2, 4})));
		System.out.println("pre4([4, 4]) → " + Arrays.toString(pre4(new int[] {4, 4})));
		System.out.println("pre4([3, 3, 4]) → " + Arrays.toString(pre4(new int[] {3, 3, 4})));
		System.out.println("pre4([1, 2, 1, 4]) → " + Arrays.toString(pre4(new int[] {1, 2, 1, 4})));
		System.out.println("pre4([2, 1, 4, 2]) → " + Arrays.toString(pre4(new int[] {2, 1, 4, 2})));
		System.out.println("pre4([2, 1, 2, 1, 4, 2]) → " + Arrays.toString(pre4(new int[] {2, 1, 2, 1, 4, 2})));
		printFunction("post4");
		System.out.println("post4([2, 4, 1, 2]) → " + Arrays.toString(post4(new int[] {2, 4, 1, 2})));
		System.out.println("post4([4, 1, 4, 2]) → " + Arrays.toString(post4(new int[] {4, 1, 4, 2})));
		System.out.println("post4([4, 4, 1, 2, 3]) → " + Arrays.toString(post4(new int[] {4, 4, 1, 2, 3})));
		System.out.println("post4([4, 2]) → " + Arrays.toString(post4(new int[] {4, 2})));
		System.out.println("post4([4, 4, 3]) → " + Arrays.toString(post4(new int[] {4, 4, 3})));
		System.out.println("post4([4, 4]) → " + Arrays.toString(post4(new int[] {4, 4})));
		System.out.println("post4([4]) → " + Arrays.toString(post4(new int[] {4})));
		System.out.println("post4([2, 4, 1, 4, 3, 2]) → " + Arrays.toString(post4(new int[] {2, 4, 1, 4, 3, 2})));
		System.out.println("post4([4, 1, 4, 2, 2, 2]) → " + Arrays.toString(post4(new int[] {4, 1, 4, 2, 2, 2})));
		System.out.println("post4([3, 4, 3, 2]) → " + Arrays.toString(post4(new int[] {3, 4, 3, 2})));
		printFunction("notAlone");
		System.out.println("notAlone([1, 2, 3], 2) → " + Arrays.toString(notAlone(new int[] {1, 2, 3}, 2)));
		System.out.println("notAlone([1, 2, 3, 2, 5, 2], 2) → " + Arrays.toString(notAlone(new int[] {1, 2, 3, 2, 5, 2}, 2)));
		System.out.println("notAlone([3, 4], 3) → " + Arrays.toString(notAlone(new int[] {3, 4}, 3)));
		System.out.println("notAlone([3, 3], 3) → " + Arrays.toString(notAlone(new int[] {3, 3}, 3)));
		System.out.println("notAlone([1, 3, 1, 2], 1) → " + Arrays.toString(notAlone(new int[] {1, 3, 1, 2}, 1)));
		System.out.println("notAlone([3], 3) → " + Arrays.toString(notAlone(new int[] {3}, 3)));
		System.out.println("notAlone([], 3) → " + Arrays.toString(notAlone(new int[] {}, 3)));
		System.out.println("notAlone([7, 1, 6], 1) → " + Arrays.toString(notAlone(new int[] {7, 1, 6}, 1)));
		System.out.println("notAlone([1, 1, 1], 1) → " + Arrays.toString(notAlone(new int[] {1, 1, 1}, 1)));
		System.out.println("notAlone([1, 1, 1, 2], 1) → " + Arrays.toString(notAlone(new int[] {1, 1, 1, 2}, 1)));
		printFunction("zeroFront");
		System.out.println("zeroFront([1, 0, 0, 1]) → " + Arrays.toString(zeroFront(new int[] {1, 0, 0, 1})));
		System.out.println("zeroFront([0, 1, 1, 0, 1]) → " + Arrays.toString(zeroFront(new int[] {0, 1, 1, 0, 1})));
		System.out.println("zeroFront([1, 0]) → " + Arrays.toString(zeroFront(new int[] {1, 0})));
		System.out.println("zeroFront([0, 1]) → " + Arrays.toString(zeroFront(new int[] {0, 1})));
		System.out.println("zeroFront([1, 1, 1, 0]) → " + Arrays.toString(zeroFront(new int[] {1, 1, 1, 0})));
		System.out.println("zeroFront([2, 2, 2, 2]) → " + Arrays.toString(zeroFront(new int[] {2, 2, 2, 2})));
		System.out.println("zeroFront([0, 0, 1, 0]) → " + Arrays.toString(zeroFront(new int[] {0, 0, 1, 0})));
		System.out.println("zeroFront([-1, 0, 0, -1, 0]) → " + Arrays.toString(zeroFront(new int[] {-1, 0, 0, -1, 0})));
		System.out.println("zeroFront([0, -3, 0, -3]) → " + Arrays.toString(zeroFront(new int[] {0, -3, 0, -3})));
		System.out.println("zeroFront([]) → " + Arrays.toString(zeroFront(new int[] {})));
		System.out.println("zeroFront([9, 9, 0, 9, 0, 9]) → " + Arrays.toString(zeroFront(new int[] {9, 9, 0, 9, 0, 9})));
		printFunction("withoutTen");
		System.out.println("withoutTen([1, 10, 10, 2]) → " + Arrays.toString(withoutTen(new int[] {1, 10, 10, 2})));
		System.out.println("withoutTen([10, 2, 10]) → " + Arrays.toString(withoutTen(new int[] {10, 2, 10})));
		System.out.println("withoutTen([1, 99, 10]) → " + Arrays.toString(withoutTen(new int[] {1, 99, 10})));
		System.out.println("withoutTen([10, 13, 10, 14]) → " + Arrays.toString(withoutTen(new int[] {10, 13, 10, 14})));
		System.out.println("withoutTen([10, 13, 10, 14, 10]) → " + Arrays.toString(withoutTen(new int[] {10, 13, 10, 14, 10})));
		System.out.println("withoutTen([10, 10, 3]) → " + Arrays.toString(withoutTen(new int[] {10, 10, 3})));
		System.out.println("withoutTen([1]) → " + Arrays.toString(withoutTen(new int[] {1})));
		System.out.println("withoutTen([13, 1]) → " + Arrays.toString(withoutTen(new int[] {13, 1})));
		System.out.println("withoutTen([10]) → " + Arrays.toString(withoutTen(new int[] {10})));
		System.out.println("withoutTen([]) → " + Arrays.toString(withoutTen(new int[] {})));
		printFunction("zeroMax");
		System.out.println("zeroMax([0, 5, 0, 3]) → " + Arrays.toString(zeroMax(new int[] {0, 5, 0, 3})));
		System.out.println("zeroMax([0, 4, 0, 3]) → " + Arrays.toString(zeroMax(new int[] {0, 4, 0, 3})));
		System.out.println("zeroMax([0, 1, 0]) → " + Arrays.toString(zeroMax(new int[] {0, 1, 0})));
		System.out.println("zeroMax([0, 1, 5]) → " + Arrays.toString(zeroMax(new int[] {0, 1, 5})));
		System.out.println("zeroMax([0, 2, 0]) → " + Arrays.toString(zeroMax(new int[] {0, 2, 0})));
		System.out.println("zeroMax([1]) → " + Arrays.toString(zeroMax(new int[] {1})));
		System.out.println("zeroMax([0]) → " + Arrays.toString(zeroMax(new int[] {0})));
		System.out.println("zeroMax([]) → " + Arrays.toString(zeroMax(new int[] {})));
		System.out.println("zeroMax([7, 0, 4, 3, 0, 2]) → " + Arrays.toString(zeroMax(new int[] {7, 0, 4, 3, 0, 2})));
		System.out.println("zeroMax([7, 0, 4, 3, 0, 1]) → " + Arrays.toString(zeroMax(new int[] {7, 0, 4, 3, 0, 1})));
		System.out.println("zeroMax([7, 0, 4, 3, 0, 0]) → " + Arrays.toString(zeroMax(new int[] {7, 0, 4, 3, 0, 0})));
		System.out.println("zeroMax([7, 0, 1, 0, 0, 7]) → " + Arrays.toString(zeroMax(new int[] {7, 0, 1, 0, 0, 7})));
		printFunction("evenOdd");
		System.out.println("evenOdd([1, 0, 1, 0, 0, 1, 1]) → " + Arrays.toString(evenOdd(new int[] {1, 0, 1, 0, 0, 1, 1})));
		System.out.println("evenOdd([3, 3, 2]) → " + Arrays.toString(evenOdd(new int[] {3, 3, 2})));
		System.out.println("evenOdd([2, 2, 2]) → " + Arrays.toString(evenOdd(new int[] {2, 2, 2})));
		System.out.println("evenOdd([3, 2, 2]) → " + Arrays.toString(evenOdd(new int[] {3, 2, 2})));
		System.out.println("evenOdd([1, 1, 0, 1, 0]) → " + Arrays.toString(evenOdd(new int[] {1, 1, 0, 1, 0})));
		System.out.println("evenOdd([1]) → " + Arrays.toString(evenOdd(new int[] {1})));
		System.out.println("evenOdd([1, 2]) → " + Arrays.toString(evenOdd(new int[] {1, 2})));
		System.out.println("evenOdd([2, 1]) → " + Arrays.toString(evenOdd(new int[] {2, 1})));
		System.out.println("evenOdd([]) → " + Arrays.toString(evenOdd(new int[] {})));
		printFunction("fizzBuzz");
		System.out.println("fizzBuzz(1, 6) → " + toString(fizzBuzz(1, 6)));
		System.out.println("fizzBuzz(1, 8) → " + toString(fizzBuzz(1, 8)));
		System.out.println("fizzBuzz(1, 11) → " + toString(fizzBuzz(1, 11)));
		System.out.println("fizzBuzz(1, 16) → " + toString(fizzBuzz(1, 16)));
		System.out.println("fizzBuzz(1, 4) → " + toString(fizzBuzz(1, 4)));
		System.out.println("fizzBuzz(1, 2) → " + toString(fizzBuzz(1, 2)));
		System.out.println("fizzBuzz(50, 56) → " + toString(fizzBuzz(50, 56)));
		System.out.println("fizzBuzz(15, 17) → " + toString(fizzBuzz(15, 17)));
		System.out.println("fizzBuzz(30, 36) → " + toString(fizzBuzz(30, 36)));
		System.out.println("fizzBuzz(1000, 1006) → " + toString(fizzBuzz(1000, 1006)));
		System.out.println("fizzBuzz(99, 102) → " + toString(fizzBuzz(99, 102)));
		System.out.println("fizzBuzz(14, 20) → " + toString(fizzBuzz(14, 20)));
	}
}
