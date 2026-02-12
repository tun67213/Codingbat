package src;

import java.util.Arrays;

/**
 * @author arvindhvelrajan
 */
public class Array_2 extends HelperMethods
{
	/**
	 * This method welcomes the user to this program.
	 */
	public void welcome()
	{
		System.out.println("\n\nArray-2 Methods\n");
	}

	/**
	 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
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
	 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
	 *
	 * bigDiff([10, 3, 5, 6]) → 7
	 * bigDiff([7, 2, 10, 9]) → 8
	 * bigDiff([2, 10, 7, 2]) → 8
	 */
	public int bigDiff(int[] nums)
	{
		int min = nums[0], max = nums[0];
		for(int num : nums)
		{
			if(num < min)
			{
				min = num;
			}
			if(num > max)
			{
				max = num;
			}
		}
		return max - min;
	}

	/**
	 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
	 *
	 * centeredAverage([1, 2, 3, 4, 100]) → 3
	 * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
	 * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
	 */
	public int centeredAverage(int[] nums)
	{
		int sum = 0;
		int min = nums[0];
		int max = nums[0];
		for(int num : nums)
		{
			sum += num;

			if(num < min)
			{
				min = num;
			}

			if(num > max)
			{
				max = num;
			}
		}
		sum = sum - min - max;
		return sum / (nums.length - 2);
	}

	/**
	 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
	 *
	 * sum13([1, 2, 2, 1]) → 6
	 * sum13([1, 1]) → 2
	 * sum13([1, 2, 2, 1, 13]) → 6
	 */
	public int sum13(int[] nums)
	{
		int sum = 0;
		int i = 0;
		while(i < nums.length)
		{
			if(nums[i] == 13)
			{
				i += 2;
			}
			else
			{
				sum += nums[i];
				i++;
			}
		}
		return sum;
	}

	/**
	 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
	 *
	 * sum67([1, 2, 2]) → 5
	 * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
	 * sum67([1, 1, 6, 7, 2]) → 4
	 */
	public int sum67(int[] nums)
	{
		boolean found = false;
		int sum = 0;
		for(int num : nums)
		{
			if(!found && num == 6)
			{
				found = true;
			}
			else if(found && num == 7)
			{
				found = false;
			}
			else if(!found)
			{
				sum += num;
			}
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
		int count1 = 0;
		int count4 = 0;
		for(int num : nums)
		{
			if(num == 1)
			{
				count1++;
			}
			if(num == 4)
			{
				count4++;
			}
		}
		return count1 > count4;
	}

	/**
	 * Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
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
	 * Given an array of ints, return true if every element is a 1 or a 4.
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
	 * Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
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

	/**
	 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
	 *
	 * no14([1, 2, 3]) → true
	 * no14([1, 2, 3, 4]) → false
	 * no14([2, 3, 4]) → true
	 */
	public boolean no14(int[] nums)
	{
		int count1 = 0, count4 = 0;
		for(int num : nums)
		{
			if(num == 1)
			{
				count1++;
			}
			if(num == 4)
			{
				count4++;
			}
		}
		return (count1 == 0) || (count4 == 0);
	}

	/**
	 * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
	 *
	 * isEverywhere([1, 2, 1, 3], 1) → true
	 * isEverywhere([1, 2, 1, 3], 2) → false
	 * isEverywhere([1, 2, 1, 3, 4], 1) → false
	 */
	public boolean isEverywhere(int[] nums, int val)
	{
		if(nums.length <= 1)
		{
			return true;
		}
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] != val && nums[i + 1] != val)
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
		if(nums.length <= 1)
		{
			return false;
		}
		boolean found22 = false, found44 = false;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == 2 && nums[i + 1] == 2)
			{
				found22 = true;
			}
			if(nums[i] == 4 && nums[i + 1] == 4)
			{
				found44 = true;
			}
		}
		return found22 ^ found44;
	}

	/**
	 * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
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
			int num1 = nums1[i];
			int num2 = nums2[i];
			if(num1 != num2 && Math.abs(num1 - num2) <= 2)
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
	 *
	 * has77([1, 7, 7]) → true
	 * has77([1, 7, 1, 7]) → true
	 * has77([1, 7, 1, 1, 7]) → false
	 */
	public boolean has77(int[] nums)
	{
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == 7 && nums[i + 1] == 7)
			{
				return true;
			}
			if(nums[i] == 7 && i + 2 < nums.length && nums[i + 2] == 7)
			{
				return true;
			}
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
		boolean found1 = false;
		for(int num : nums)
		{
			if(num == 1)
			{
				found1 = true;
			}
			if(found1 && num == 2)
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
			if((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) && (nums[i + 2] % 2 == 0))
			{
				return true;
			}
			if((nums[i] % 2 == 1) && (nums[i + 1] % 2 == 1) && (nums[i + 2] % 2 == 1))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
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
				count++;
				if(i > 0 && nums[i - 1] == 3)
				{
					return false;
				}
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
		if(nums[0] == 2 && nums[1] != 2)
		{
			return false;
		}
		for(int i = 1; i < nums.length - 1; i++)
		{
			if(nums[i] == 2 && !((nums[i + 1] == 2) || (nums[i - 1] == 2)))
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
	 * Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
	 *
	 * sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
	 * sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
	 * sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
	 */
	public boolean sameEnds(int[] nums, int len)
	{
		for(int i = 0; i < len; i++)
		{
			if(nums[i] != nums[nums.length - len + i])
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
	 * Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
	 *
	 * fizzArray3(5, 10) → [5, 6, 7, 8, 9]
	 * fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
	 * fizzArray3(1, 3) → [1, 2]
	 */
	public int[] fizzArray3(int start, int end)
	{
		int length = end - start;
		int[] fizzArray = new int[length];
		int size = 0;
		for(int i = start; i < end; i++)
		{
			fizzArray[size++] = i;
		}
		return fizzArray;
	}

	/**
	 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
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
	 * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
	 *
	 * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
	 * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
	 * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
	 */
	public int[] tenRun(int[] nums)
	{
		int multipleOf10 = 0;
		boolean multipleFound = false;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 10 == 0)
			{
				multipleOf10 = nums[i];
				multipleFound = true;
			}
			else if(multipleFound)
			{
				nums[i] = multipleOf10;
			}
		}
		return nums;
	}

	/**
	 * Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
	 *
	 * pre4([1, 2, 4, 1]) → [1, 2]
	 * pre4([3, 1, 4]) → [3, 1]
	 * pre4([1, 4, 4]) → [1]
	 */
	public int[] pre4(int[] nums)
	{
		int first4Occurrence = -1;
		for(int i = nums.length - 1; i >= 0; i--)
		{
			if(nums[i] == 4)
			{
				first4Occurrence = i;
			}
		}
		if(first4Occurrence == -1)
		{
			return nums;
		}
		int[] newArray = new int[first4Occurrence];
		for(int i = 0; i < first4Occurrence; i++)
		{
			newArray[i] = nums[i];
		}
		return newArray;
	}

	/**
	 * Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
	 *
	 * post4([2, 4, 1, 2]) → [1, 2]
	 * post4([4, 1, 4, 2]) → [2]
	 * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
	 */
	public int[] post4(int[] nums)
	{
		int lastOccurrenceOf4 = -1;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 4)
			{
				lastOccurrenceOf4 = i;
			}
		}
		if(lastOccurrenceOf4 == -1)
		{
			return nums;
		}
		int newArrayLength = nums.length - lastOccurrenceOf4 - 1;
		int[] newArray = new int[newArrayLength];
		int currentSize = 0;
		for(int i = lastOccurrenceOf4 + 1; i < nums.length; i++)
		{
			newArray[currentSize++] = nums[i];
		}
		return newArray;
	}

	/**
	 * We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
	 *
	 * notAlone([1, 2, 3], 2) → [1, 3, 3]
	 * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
	 * notAlone([3, 4], 3) → [3, 4]
	 */
	public int[] notAlone(int[] nums, int val)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
	 *
	 * zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
	 * zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
	 * zeroFront([1, 0]) → [0, 1]
	 */
	public int[] zeroFront(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
	 *
	 * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
	 * withoutTen([10, 2, 10]) → [2, 0, 0]
	 * withoutTen([1, 99, 10]) → [1, 99, 0]
	 */
	public int[] withoutTen(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
	 *
	 * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
	 * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
	 * zeroMax([0, 1, 0]) → [1, 1, 0]
	 */
	public int[] zeroMax(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
	 *
	 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
	 * evenOdd([3, 3, 2]) → [2, 3, 3]
	 * evenOdd([2, 2, 2]) → [2, 2, 2]
	 */
	public int[] evenOdd(int[] nums)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
	 *
	 * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
	 * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
	 * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
	 */
	public String[] fizzBuzz(int start, int end)
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
		printMethod("countEvens");
		System.out.println("countEvens([2, 1, 2, 3, 4]) -> " + countEvens(new int[] {2, 1, 2, 3, 4}));
		System.out.println("countEvens([2, 2, 0]) -> " + countEvens(new int[] {2, 2, 0}));
		System.out.println("countEvens([1, 3, 5]) -> " + countEvens(new int[] {1, 3, 5}));
		System.out.println("countEvens([]) -> " + countEvens(new int[] {}));
		System.out.println("countEvens([11, 9, 0, 1]) -> " + countEvens(new int[] {11, 9, 0, 1}));
		System.out.println("countEvens([2, 11, 9, 0]) -> " + countEvens(new int[] {2, 11, 9, 0}));
		System.out.println("countEvens([2]) -> " + countEvens(new int[] {2}));
		System.out.println("countEvens([2, 5, 12]) -> " + countEvens(new int[] {2, 5, 12}));
		printMethod("bigDiff");
		System.out.println("bigDiff([10, 3, 5, 6]) -> " + bigDiff(new int[] {10, 3, 5, 6}));
		System.out.println("bigDiff([7, 2, 10, 9]) -> " + bigDiff(new int[] {7, 2, 10, 9}));
		System.out.println("bigDiff([2, 10, 7, 2]) -> " + bigDiff(new int[] {2, 10, 7, 2}));
		System.out.println("bigDiff([2, 10]) -> " + bigDiff(new int[] {2, 10}));
		System.out.println("bigDiff([10, 2]) -> " + bigDiff(new int[] {10, 2}));
		System.out.println("bigDiff([10, 0]) -> " + bigDiff(new int[] {10, 0}));
		System.out.println("bigDiff([2, 3]) -> " + bigDiff(new int[] {2, 3}));
		System.out.println("bigDiff([2, 2]) -> " + bigDiff(new int[] {2, 2}));
		System.out.println("bigDiff([2]) -> " + bigDiff(new int[] {2}));
		System.out.println("bigDiff([5, 1, 6, 1, 9, 9]) -> " + bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
		System.out.println("bigDiff([7, 6, 8, 5]) -> " + bigDiff(new int[] {7, 6, 8, 5}));
		System.out.println("bigDiff([7, 7, 6, 8, 5, 5, 6]) -> " + bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
		printMethod("centeredAverage");
		System.out.println("centeredAverage([1, 2, 3, 4, 100]) -> " + centeredAverage(new int[] {1, 2, 3, 4, 100}));
		System.out.println("centeredAverage([1, 1, 5, 5, 10, 8, 7]) -> " + centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));
		System.out.println("centeredAverage([-10, -4, -2, -4, -2, 0]) -> " + centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
		System.out.println("centeredAverage([5, 3, 4, 6, 2]) -> " + centeredAverage(new int[] {5, 3, 4, 6, 2}));
		System.out.println("centeredAverage([5, 3, 4, 0, 100]) -> " + centeredAverage(new int[] {5, 3, 4, 0, 100}));
		System.out.println("centeredAverage([100, 0, 5, 3, 4]) -> " + centeredAverage(new int[] {100, 0, 5, 3, 4}));
		System.out.println("centeredAverage([4, 0, 100]) -> " + centeredAverage(new int[] {4, 0, 100}));
		System.out.println("centeredAverage([0, 2, 3, 4, 100]) -> " + centeredAverage(new int[] {0, 2, 3, 4, 100}));
		System.out.println("centeredAverage([1, 1, 100]) -> " + centeredAverage(new int[] {1, 1, 100}));
		System.out.println("centeredAverage([7, 7, 7]) -> " + centeredAverage(new int[] {7, 7, 7}));
		System.out.println("centeredAverage([1, 7, 8]) -> " + centeredAverage(new int[] {1, 7, 8}));
		System.out.println("centeredAverage([1, 1, 99, 99]) -> " + centeredAverage(new int[] {1, 1, 99, 99}));
		System.out.println("centeredAverage([1000, 0, 1, 99]) -> " + centeredAverage(new int[] {1000, 0, 1, 99}));
		System.out.println("centeredAverage([4, 4, 4, 4, 5]) -> " + centeredAverage(new int[] {4, 4, 4, 4, 5}));
		System.out.println("centeredAverage([4, 4, 4, 1, 5]) -> " + centeredAverage(new int[] {4, 4, 4, 1, 5}));
		System.out.println("centeredAverage([6, 4, 8, 12, 3]) -> " + centeredAverage(new int[] {6, 4, 8, 12, 3}));
		printMethod("sum13");
		System.out.println("sum13([1, 2, 2, 1]) -> " + sum13(new int[] {1, 2, 2, 1}));
		System.out.println("sum13([1, 1]) -> " + sum13(new int[] {1, 1}));
		System.out.println("sum13([1, 2, 2, 1, 13]) -> " + sum13(new int[] {1, 2, 2, 1, 13}));
		System.out.println("sum13([1, 2, 13, 2, 1, 13]) -> " + sum13(new int[] {1, 2, 13, 2, 1, 13}));
		System.out.println("sum13([13, 1, 2, 13, 2, 1, 13]) -> " + sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));
		System.out.println("sum13([]) -> " + sum13(new int[] {}));
		System.out.println("sum13([13]) -> " + sum13(new int[] {13}));
		System.out.println("sum13([13, 13]) -> " + sum13(new int[] {13, 13}));
		System.out.println("sum13([13, 0, 13]) -> " + sum13(new int[] {13, 0, 13}));
		System.out.println("sum13([13, 1, 13]) -> " + sum13(new int[] {13, 1, 13}));
		System.out.println("sum13([5, 7, 2]) -> " + sum13(new int[] {5, 7, 2}));
		System.out.println("sum13([5, 13, 2]) -> " + sum13(new int[] {5, 13, 2}));
		System.out.println("sum13([0]) -> " + sum13(new int[] {0}));
		System.out.println("sum13([13, 0]) -> " + sum13(new int[] {13, 0}));
		printMethod("sum67");
		System.out.println("sum67([1, 2, 2]) -> " + sum67(new int[] {1, 2, 2}));
		System.out.println("sum67([1, 2, 2, 6, 99, 99, 7]) -> " + sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
		System.out.println("sum67([1, 1, 6, 7, 2]) -> " + sum67(new int[] {1, 1, 6, 7, 2}));
		System.out.println("sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) -> " + sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
		System.out.println("sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) -> " + sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
		System.out.println("sum67([2, 7, 6, 2, 6, 7, 2, 7]) -> " + sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7}));
		System.out.println("sum67([2, 7, 6, 2, 6, 2, 7]) -> " + sum67(new int[] {2, 7, 6, 2, 6, 2, 7}));
		System.out.println("sum67([1, 6, 7, 7]) -> " + sum67(new int[] {1, 6, 7, 7}));
		System.out.println("sum67([6, 7, 1, 6, 7, 7]) -> " + sum67(new int[] {6, 7, 1, 6, 7, 7}));
		System.out.println("sum67([6, 8, 1, 6, 7]) -> " + sum67(new int[] {6, 8, 1, 6, 7}));
		System.out.println("sum67([]) -> " + sum67(new int[] {}));
		System.out.println("sum67([6, 7, 11]) -> " + sum67(new int[] {6, 7, 11}));
		System.out.println("sum67([11, 6, 7, 11]) -> " + sum67(new int[] {11, 6, 7, 11}));
		System.out.println("sum67([2, 2, 6, 7, 7]) -> " + sum67(new int[] {2, 2, 6, 7, 7}));
		printMethod("has22");
		System.out.println("has22([1, 2, 2]) -> " + has22(new int[] {1, 2, 2}));
		System.out.println("has22([1, 2, 1, 2]) -> " + has22(new int[] {1, 2, 1, 2}));
		System.out.println("has22([2, 1, 2]) -> " + has22(new int[] {2, 1, 2}));
		System.out.println("has22([2, 2, 1, 2]) -> " + has22(new int[] {2, 2, 1, 2}));
		System.out.println("has22([1, 3, 2]) -> " + has22(new int[] {1, 3, 2}));
		System.out.println("has22([1, 3, 2, 2]) -> " + has22(new int[] {1, 3, 2, 2}));
		System.out.println("has22([2, 3, 2, 2]) -> " + has22(new int[] {2, 3, 2, 2}));
		System.out.println("has22([4, 2, 4, 2, 2, 5]) -> " + has22(new int[] {4, 2, 4, 2, 2, 5}));
		System.out.println("has22([1, 2]) -> " + has22(new int[] {1, 2}));
		System.out.println("has22([2, 2]) -> " + has22(new int[] {2, 2}));
		System.out.println("has22([2]) -> " + has22(new int[] {2}));
		System.out.println("has22([]) -> " + has22(new int[] {}));
		System.out.println("has22([3, 3, 2, 2]) -> " + has22(new int[] {3, 3, 2, 2}));
		System.out.println("has22([5, 2, 5, 2]) -> " + has22(new int[] {5, 2, 5, 2}));
		printMethod("lucky13");
		System.out.println("lucky13([0, 2, 4]) -> " + lucky13(new int[] {0, 2, 4}));
		System.out.println("lucky13([1, 2, 3]) -> " + lucky13(new int[] {1, 2, 3}));
		System.out.println("lucky13([1, 2, 4]) -> " + lucky13(new int[] {1, 2, 4}));
		System.out.println("lucky13([2, 7, 2, 8]) -> " + lucky13(new int[] {2, 7, 2, 8}));
		System.out.println("lucky13([2, 7, 1, 8]) -> " + lucky13(new int[] {2, 7, 1, 8}));
		System.out.println("lucky13([3, 7, 2, 8]) -> " + lucky13(new int[] {3, 7, 2, 9}));
		System.out.println("lucky13([2, 7, 2, 1]) -> " + lucky13(new int[] {2, 7, 2, 1}));
		System.out.println("lucky13([1, 2]) -> " + lucky13(new int[] {1, 2}));
		System.out.println("lucky13([2, 2]) -> " + lucky13(new int[] {2, 2}));
		System.out.println("lucky13([2]) -> " + lucky13(new int[] {2}));
		System.out.println("lucky13([3]) -> " + lucky13(new int[] {3}));
		System.out.println("lucky13([]) -> " + lucky13(new int[] {}));
		printMethod("sum28");
		System.out.println("sum28([2, 3, 2, 2, 4, 2]) -> " + sum28(new int[] {2, 3, 2, 2, 4, 2}));
		System.out.println("sum28([2, 3, 2, 2, 4, 2, 2]) -> " + sum28(new int[] {2, 3, 2, 2, 4, 2, 2}));
		System.out.println("sum28([1, 2, 3, 4]) -> " + sum28(new int[] {1, 2, 3, 4}));
		System.out.println("sum28([2, 2, 2, 2]) -> " + sum28(new int[] {2, 2, 2, 2}));
		System.out.println("sum28([1, 2, 2, 2, 2, 4]) -> " + sum28(new int[] {1, 2, 2, 2, 2, 4}));
		System.out.println("sum28([]) -> " + sum28(new int[] {}));
		System.out.println("sum28([2]) -> " + sum28(new int[] {2}));
		System.out.println("sum28([8]) -> " + sum28(new int[] {8}));
		System.out.println("sum28([2, 2, 2]) -> " + sum28(new int[] {2, 2, 2}));
		System.out.println("sum28([2, 2, 2, 2, 2]) -> " + sum28(new int[] {2, 2, 2, 2, 2}));
		System.out.println("sum28([1, 2, 2, 1, 2, 2]) -> " + sum28(new int[] {1, 2, 2, 1, 2, 2}));
		System.out.println("sum28([5, 2, 2, 2, 4, 2]) -> " + sum28(new int[] {5, 2, 2, 2, 4, 2}));
		printMethod("more14");
		System.out.println("more14([1, 4, 1]) -> " + more14(new int[] {1, 4, 1}));
		System.out.println("more14([1, 4, 1, 4]) -> " + more14(new int[] {1, 4, 1, 4}));
		System.out.println("more14([1, 1]) -> " + more14(new int[] {1, 1}));
		System.out.println("more14([1, 6, 6]) -> " + more14(new int[] {1, 6, 6}));
		System.out.println("more14([1]) -> " + more14(new int[] {1}));
		System.out.println("more14([1, 4]) -> " + more14(new int[] {1, 4}));
		System.out.println("more14([6, 1, 1]) -> " + more14(new int[] {6, 1, 1}));
		System.out.println("more14([1, 6, 4]) -> " + more14(new int[] {1, 6, 4}));
		System.out.println("more14([1, 1, 4, 4, 1]) -> " + more14(new int[] {1, 1, 4, 4, 1}));
		System.out.println("more14([1, 1, 6, 4, 4, 1]) -> " + more14(new int[] {1, 1, 6, 4, 4, 1}));
		System.out.println("more14([]) -> " + more14(new int[] {}));
		System.out.println("more14([4, 1, 4, 6]) -> " + more14(new int[] {4, 1, 4, 6}));
		System.out.println("more14([4, 1, 4, 6, 1]) -> " + more14(new int[] {4, 1, 4, 6, 1}));
		System.out.println("more14([1, 4, 1, 4, 1, 6]) -> " + more14(new int[] {1, 4, 1, 4, 1, 6}));
		printMethod("fizzArray");
		System.out.println("fizzArray(4) -> " + Arrays.toString(fizzArray(4)));
		System.out.println("fizzArray(1) -> " + Arrays.toString(fizzArray(1)));
		System.out.println("fizzArray(10) -> " + Arrays.toString(fizzArray(10)));
		System.out.println("fizzArray(0) -> " + Arrays.toString(fizzArray(0)));
		System.out.println("fizzArray(2) -> " + Arrays.toString(fizzArray(2)));
		System.out.println("fizzArray(7) -> " + Arrays.toString(fizzArray(7)));
		printMethod("only14");
		System.out.println("only14([1, 4, 1, 4]) -> " + only14(new int[] {1, 4, 1, 4}));
		System.out.println("only14([1, 4, 2, 4]) -> " + only14(new int[] {1, 4, 2, 4}));
		System.out.println("only14([1, 1]) -> " + only14(new int[] {1, 1}));
		System.out.println("only14([4, 1]) -> " + only14(new int[] {4, 1}));
		System.out.println("only14([2]) -> " + only14(new int[] {2}));
		System.out.println("only14([]) -> " + only14(new int[] {}));
		System.out.println("only14([1, 4, 1, 3]) -> " + only14(new int[] {1, 4, 1, 3}));
		System.out.println("only14([3, 1, 3]) -> " + only14(new int[] {3, 1, 3}));
		System.out.println("only14([1]) -> " + only14(new int[] {1}));
		System.out.println("only14([4]) -> " + only14(new int[] {4}));
		System.out.println("only14([3, 4]) -> " + only14(new int[] {3, 4}));
		System.out.println("only14([1, 3, 4]) -> " + only14(new int[] {1, 3, 4}));
		System.out.println("only14([1, 1, 1]) -> " + only14(new int[] {1, 1, 1}));
		System.out.println("only14([1, 1, 1, 5]) -> " + only14(new int[] {1, 1, 1, 5}));
		System.out.println("only14([4, 1, 4, 1]) -> " + only14(new int[] {4, 1, 4, 1}));
		printMethod("fizzArray2");
		System.out.println("fizzArray2(4) -> " + formatStringArray(fizzArray2(4)));
		System.out.println("fizzArray2(10) -> " + formatStringArray(fizzArray2(10)));
		System.out.println("fizzArray2(2) -> " + formatStringArray(fizzArray2(2)));
		System.out.println("fizzArray2(1) -> " + formatStringArray(fizzArray2(1)));
		System.out.println("fizzArray2(0) -> " + formatStringArray(fizzArray2(0)));
		System.out.println("fizzArray2(7) -> " + formatStringArray(fizzArray2(7)));
		System.out.println("fizzArray2(9) -> " + formatStringArray(fizzArray2(9)));
		System.out.println("fizzArray2(11) -> " + formatStringArray(fizzArray2(11)));
		printMethod("no14");
		System.out.println("no14([1, 2, 3]) -> " + no14(new int[] {1, 2, 3}));
		System.out.println("no14([1, 2, 3, 4]) -> " + no14(new int[] {1, 2, 3, 4}));
		System.out.println("no14([2, 3, 4]) -> " + no14(new int[] {2, 3, 4}));
		System.out.println("no14([1, 1, 4, 4]) -> " + no14(new int[] {1, 1, 4, 4}));
		System.out.println("no14([2, 2, 4, 4]) -> " + no14(new int[] {2, 2, 4, 4}));
		System.out.println("no14([2, 3, 4, 1]) -> " + no14(new int[] {2, 3, 4, 1}));
		System.out.println("no14([2, 1, 1]) -> " + no14(new int[] {2, 1, 1}));
		System.out.println("no14([1, 4]) -> " + no14(new int[] {1, 4}));
		System.out.println("no14([2]) -> " + no14(new int[] {2}));
		System.out.println("no14([2, 1]) -> " + no14(new int[] {2, 1}));
		System.out.println("no14([1]) -> " + no14(new int[] {1}));
		System.out.println("no14([4]) -> " + no14(new int[] {4}));
		System.out.println("no14([]) -> " + no14(new int[] {}));
		System.out.println("no14([1, 1, 1, 1]) -> " + no14(new int[] {1, 1, 1, 1}));
		System.out.println("no14([9, 4, 4, 1]) -> " + no14(new int[] {9, 4, 4, 1}));
		System.out.println("no14([4, 2, 3, 1]) -> " + no14(new int[] {4, 2, 3, 1}));
		System.out.println("no14([4, 2, 3, 5]) -> " + no14(new int[] {4, 2, 3, 5}));
		System.out.println("no14([4, 4, 2]) -> " + no14(new int[] {4, 4, 2}));
		System.out.println("no14([1, 4, 4]) -> " + no14(new int[] {1, 4, 4}));
		printMethod("isEverywhere");
		System.out.println("isEverywhere([1, 2, 1, 3], 1) -> " + isEverywhere(new int[] {1, 2, 1, 3}, 1));
		System.out.println("isEverywhere([1, 2, 1, 3], 2) -> " + isEverywhere(new int[] {1, 2, 1, 3}, 2));
		System.out.println("isEverywhere([1, 2, 1, 3, 4], 1) -> " + isEverywhere(new int[] {1, 2, 1, 3, 4}, 1));
		System.out.println("isEverywhere([2, 1, 2, 1], 1) -> " + isEverywhere(new int[] {2, 1, 2, 1}, 1));
		System.out.println("isEverywhere([2, 1, 2, 1], 2) -> " + isEverywhere(new int[] {2, 1, 2, 1}, 2));
		System.out.println("isEverywhere([2, 1, 2, 3, 1], 2) -> " + isEverywhere(new int[] {2, 1, 2, 3, 1}, 2));
		System.out.println("isEverywhere([3, 1], 3) -> " + isEverywhere(new int[] {3, 1}, 3));
		System.out.println("isEverywhere([3, 1], 2) -> " + isEverywhere(new int[] {3, 1}, 2));
		System.out.println("isEverywhere([3], 1) -> " + isEverywhere(new int[] {3}, 1));
		System.out.println("isEverywhere([], 1) -> " + isEverywhere(new int[] {}, 1));
		System.out.println("isEverywhere([1, 2, 1, 2, 3, 2, 5], 2) -> " + isEverywhere(new int[] {1, 2, 1, 2, 3, 2, 5}, 2));
		System.out.println("isEverywhere([1, 2, 1, 1, 1, 2], 2) -> " + isEverywhere(new int[] {1, 2, 1, 1, 1, 2}, 2));
		System.out.println("isEverywhere([2, 1, 2, 1, 1, 2], 2) -> " + isEverywhere(new int[] {2, 1, 2, 1, 1, 2}, 2));
		System.out.println("isEverywhere([2, 1, 2, 2, 2, 1, 1, 2], 2) -> " + isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 1, 2}, 2));
		System.out.println("isEverywhere([2, 1, 2, 2, 2, 1, 2, 1], 2) -> " + isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 2, 1}, 2));
		System.out.println("isEverywhere([2, 1, 2, 1, 2], 2) -> " + isEverywhere(new int[] {2, 1, 2, 1, 2}, 2));
		printMethod("either24");
		System.out.println("either24([1, 2, 2]) -> " + either24(new int[] {1, 2, 2}));
		System.out.println("either24([4, 4, 1]) -> " + either24(new int[] {4, 4, 1}));
		System.out.println("either24([4, 4, 1, 2, 2]) -> " + either24(new int[] {4, 4, 1, 2, 2}));
		System.out.println("either24([1, 2, 3, 4]) -> " + either24(new int[] {1, 2, 3, 4}));
		System.out.println("either24([3, 5, 9]) -> " + either24(new int[] {3, 5, 9}));
		System.out.println("either24([1, 2, 3, 4, 4]) -> " + either24(new int[] {1, 2, 3, 4, 4}));
		System.out.println("either24([2, 2, 3, 4]) -> " + either24(new int[] {2, 2, 3, 4}));
		System.out.println("either24([1, 2, 3, 2, 2, 4]) -> " + either24(new int[] {1, 2, 3, 2, 2, 4}));
		System.out.println("either24([1, 2, 3, 2, 2, 4, 4]) -> " + either24(new int[] {1, 2, 3, 2, 2, 4, 4}));
		System.out.println("either24([1, 2]) -> " + either24(new int[] {1, 2}));
		System.out.println("either24([2, 2]) -> " + either24(new int[] {2, 2}));
		System.out.println("either24([4, 4]) -> " + either24(new int[] {4, 4}));
		System.out.println("either24([2]) -> " + either24(new int[] {2}));
		System.out.println("either24([]) -> " + either24(new int[] {}));
		printMethod("matchUp");
		System.out.println("matchUp([1, 2, 3], [2, 3, 10]) -> " + matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 10}));
		System.out.println("matchUp([1, 2, 3], [2, 3, 5]) -> " + matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 5}));
		System.out.println("matchUp([1, 2, 3], [2, 3, 3]) -> " + matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 3}));
		System.out.println("matchUp([5, 3], [5, 5]) -> " + matchUp(new int[] {5, 3}, new int[] {5, 5}));
		System.out.println("matchUp([5, 3], [4, 4]) -> " + matchUp(new int[] {5, 3}, new int[] {4, 4}));
		System.out.println("matchUp([5, 3], [3, 3]) -> " + matchUp(new int[] {5, 3}, new int[] {3, 3}));
		System.out.println("matchUp([5, 3], [2, 2]) -> " + matchUp(new int[] {5, 3}, new int[] {2, 2}));
		System.out.println("matchUp([5, 3], [1, 1]) -> " + matchUp(new int[] {5, 3}, new int[] {1, 1}));
		System.out.println("matchUp([5, 3], [0, 0]) -> " + matchUp(new int[] {5, 3}, new int[] {0, 0}));
		System.out.println("matchUp([4], [4]) -> " + matchUp(new int[] {4}, new int[] {4}));
		System.out.println("matchUp([4], [5]) -> " + matchUp(new int[] {4}, new int[] {5}));
		printMethod("has77");
		System.out.println("has77([1, 7, 7]) -> " + has77(new int[] {1, 7, 7}));
		System.out.println("has77([1, 7, 1, 7]) -> " + has77(new int[] {1, 7, 1, 7}));
		System.out.println("has77([1, 7, 1, 1, 7]) -> " + has77(new int[] {1, 7, 1, 1, 7}));
		System.out.println("has77([7, 7, 1, 1, 7]) -> " + has77(new int[] {7, 7, 1, 1, 7}));
		System.out.println("has77([2, 7, 2, 2, 7, 2]) -> " + has77(new int[] {2, 7, 2, 2, 7, 2}));
		System.out.println("has77([2, 7, 2, 2, 7, 7]) -> " + has77(new int[] {2, 7, 2, 2, 7, 7}));
		System.out.println("has77([7, 2, 7, 2, 2, 7]) -> " + has77(new int[] {7, 2, 7, 2, 2, 7}));
		System.out.println("has77([7, 2, 6, 2, 2, 7]) -> " + has77(new int[] {7, 2, 6, 2, 2, 7}));
		System.out.println("has77([7, 7, 7]) -> " + has77(new int[] {7, 7, 7}));
		System.out.println("has77([7, 1, 7]) -> " + has77(new int[] {7, 1, 7}));
		System.out.println("has77([7, 1, 1]) -> " + has77(new int[] {7, 1, 1}));
		System.out.println("has77([1, 2]) -> " + has77(new int[] {1, 2}));
		System.out.println("has77([1, 7]) -> " + has77(new int[] {1, 7}));
		System.out.println("has77([7]) -> " + has77(new int[] {7}));
		printMethod("has12");
		System.out.println("has12([1, 3, 2]) -> " + has12(new int[] {1, 3, 2}));
		System.out.println("has12([3, 1, 2]) -> " + has12(new int[] {3, 1, 2}));
		System.out.println("has12([3, 1, 4, 5, 2]) -> " + has12(new int[] {3, 1, 4, 5, 2}));
		System.out.println("has12([3, 1, 4, 5, 6]) -> " + has12(new int[] {3, 1, 4, 5, 6}));
		System.out.println("has12([3, 1, 4, 1, 6, 2]) -> " + has12(new int[] {3, 1, 4, 1, 6, 2}));
		System.out.println("has12([2, 1, 4, 1, 6, 2]) -> " + has12(new int[] {2, 1, 4, 1, 6, 2}));
		System.out.println("has12([2, 1, 4, 1, 6]) -> " + has12(new int[] {2, 1, 4, 1, 6}));
		System.out.println("has12([1]) -> " + has12(new int[] {1}));
		System.out.println("has12([2, 1, 3]) -> " + has12(new int[] {2, 1, 3}));
		System.out.println("has12([2, 1, 3, 2]) -> " + has12(new int[] {2, 1, 3, 2}));
		System.out.println("has12([2]) -> " + has12(new int[] {2}));
		System.out.println("has12([3, 2]) -> " + has12(new int[] {3, 2}));
		System.out.println("has12([3, 1, 3, 2]) -> " + has12(new int[] {3, 1, 3, 2}));
		System.out.println("has12([3, 5, 9]) -> " + has12(new int[] {3, 5, 9}));
		System.out.println("has12([3, 5, 1]) -> " + has12(new int[] {3, 5, 1}));
		System.out.println("has12([3, 2, 1]) -> " + has12(new int[] {3, 2, 1}));
		System.out.println("has12([1, 2]) -> " + has12(new int[] {1, 2}));
		printMethod("modThree");
		System.out.println("modThree([2, 1, 3, 5]) -> " + modThree(new int[] {2, 1, 3, 5}));
		System.out.println("modThree([2, 1, 2, 5]) -> " + modThree(new int[] {2, 1, 2, 5}));
		System.out.println("modThree([2, 4, 2, 5]) -> " + modThree(new int[] {2, 4, 2, 5}));
		System.out.println("modThree([1, 2, 1, 2, 1]) -> " + modThree(new int[] {1, 2, 1, 2, 1}));
		System.out.println("modThree([9, 9, 9]) -> " + modThree(new int[] {9, 9, 9}));
		System.out.println("modThree([1, 2, 1]) -> " + modThree(new int[] {1, 2, 1}));
		System.out.println("modThree([1, 2]) -> " + modThree(new int[] {1, 2}));
		System.out.println("modThree([1]) -> " + modThree(new int[] {1}));
		System.out.println("modThree([]) -> " + modThree(new int[] {}));
		System.out.println("modThree([9, 7, 2, 9]) -> " + modThree(new int[] {9, 7, 2, 9}));
		System.out.println("modThree([9, 7, 2, 9, 2, 2]) -> " + modThree(new int[] {9, 7, 2, 9, 2, 2}));
		System.out.println("modThree([9, 7, 2, 9, 2, 2, 6]) -> " + modThree(new int[] {9, 7, 2, 9, 2, 2, 6}));
		printMethod("haveThree");
		System.out.println("haveThree([3, 1, 3, 1, 3]) -> " + haveThree(new int[] {3, 1, 3, 1, 3}));
		System.out.println("haveThree([3, 1, 3, 3]) -> " + haveThree(new int[] {3, 1, 3, 3}));
		System.out.println("haveThree([3, 4, 3, 3, 4]) -> " + haveThree(new int[] {3, 4, 3, 3, 4}));
		System.out.println("haveThree([1, 3, 1, 3, 1, 2]) -> " + haveThree(new int[] {1, 3, 1, 3, 1, 2}));
		System.out.println("haveThree([1, 3, 1, 3, 1, 3]) -> " + haveThree(new int[] {1, 3, 1, 3, 1, 3}));
		System.out.println("haveThree([1, 3, 3, 1, 3]) -> " + haveThree(new int[] {1, 3, 3, 1, 3}));
		System.out.println("haveThree([1, 3, 1, 3, 1, 3, 4, 3]) -> " + haveThree(new int[] {1, 3, 1, 3, 1, 3, 4, 3}));
		System.out.println("haveThree([3, 4, 3, 4, 3, 4, 4]) -> " + haveThree(new int[] {3, 4, 3, 4, 3, 4, 4}));
		System.out.println("haveThree([3, 3, 3]) -> " + haveThree(new int[] {3, 3, 3}));
		System.out.println("haveThree([1, 3])) -> " + haveThree(new int[] {1, 3}));
		System.out.println("haveThree([3]) -> " + haveThree(new int[] {3}));
		System.out.println("haveThree([1]) -> " + haveThree(new int[] {1}));
		printMethod("twoTwo");
		System.out.println("twoTwo([4, 2, 2, 3]) -> " + twoTwo(new int[] {4, 2, 2, 3}));
		System.out.println("twoTwo([2, 2, 4]) -> " + twoTwo(new int[] {2, 2, 4}));
		System.out.println("twoTwo([2, 2, 4, 2]) -> " + twoTwo(new int[] {2, 2, 4, 2}));
		System.out.println("twoTwo([1, 3, 4]) -> " + twoTwo(new int[] {1, 3, 4}));
		System.out.println("twoTwo([1, 2, 2, 3, 4]) -> " + twoTwo(new int[] {1, 2, 2, 3, 4}));
		System.out.println("twoTwo([1, 2, 3, 4]) -> " + twoTwo(new int[] {1, 2, 3, 4}));
		System.out.println("twoTwo([2, 2]) -> " + twoTwo(new int[] {2, 2}));
		System.out.println("twoTwo([2, 2, 7]) -> " + twoTwo(new int[] {2, 2, 7}));
		System.out.println("twoTwo([2, 2, 7, 2, 1]) -> " + twoTwo(new int[] {2, 2, 7, 2, 1}));
		System.out.println("twoTwo([4, 2, 2, 2]) -> " + twoTwo(new int[] {4, 2, 2, 2}));
		System.out.println("twoTwo([2, 2, 2]) -> " + twoTwo(new int[] {2, 2, 2}));
		System.out.println("twoTwo([1, 2]) -> " + twoTwo(new int[] {1, 2}));
		System.out.println("twoTwo([2]) -> " + twoTwo(new int[] {2}));
		System.out.println("twoTwo([1]) -> " + twoTwo(new int[] {1}));
		System.out.println("twoTwo([]) -> " + twoTwo(new int[] {}));
		System.out.println("twoTwo([5, 2, 2, 3]) -> " + twoTwo(new int[] {5, 2, 2, 3}));
		System.out.println("twoTwo([2, 2, 5, 2]) -> " + twoTwo(new int[] {2, 2, 5, 2}));
		printMethod("sameEnds");
		System.out.println("sameEnds([5, 6, 45, 99, 13, 5, 6], 1) -> " + sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 1));
		System.out.println("sameEnds([5, 6, 45, 99, 13, 5, 6], 2) -> " + sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 2));
		System.out.println("sameEnds([5, 6, 45, 99, 13, 5, 6], 3) -> " + sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 3));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 1) -> " + sameEnds(new int[] {1, 2, 5, 2, 1}, 1));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 2) -> " + sameEnds(new int[] {1, 2, 5, 2, 1}, 2));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 0) -> " + sameEnds(new int[] {1, 2, 5, 2, 1}, 0));
		System.out.println("sameEnds([1, 2, 5, 2, 1], 5) -> " + sameEnds(new int[] {1, 2, 5, 2, 1}, 5));
		System.out.println("sameEnds([1, 1, 1], 0) -> " + sameEnds(new int[] {1, 1, 1}, 0));
		System.out.println("sameEnds([1, 1, 1], 1) -> " + sameEnds(new int[] {1, 1, 1}, 1));
		System.out.println("sameEnds([1, 1, 1], 2) -> " + sameEnds(new int[] {1, 1, 1}, 2));
		System.out.println("sameEnds([1, 1, 1], 3) -> " + sameEnds(new int[] {1, 1, 1}, 3));
		System.out.println("sameEnds([1], 1) -> " + sameEnds(new int[] {1}, 1));
		System.out.println("sameEnds([], 0) -> " + sameEnds(new int[] {}, 0));
		System.out.println("sameEnds([4, 2, 4, 5], 1) -> " + sameEnds(new int[] {4, 2, 4, 5}, 1));
		printMethod("tripleUp");
		System.out.println("tripleUp([1, 4, 5, 6, 2]) -> " + tripleUp(new int[] {1, 4, 5, 6, 2}));
		System.out.println("tripleUp([1, 2, 3]) -> " + tripleUp(new int[] {1, 2, 3}));
		System.out.println("tripleUp([1, 2, 4]) -> " + tripleUp(new int[] {1, 2, 4}));
		System.out.println("tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6]) -> " + tripleUp(new int[] {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
		System.out.println("tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]) -> " + tripleUp(new int[] {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}));
		System.out.println("tripleUp([1, 2]) -> " + tripleUp(new int[] {1, 2}));
		System.out.println("tripleUp([1]) -> " + tripleUp(new int[] {1}));
		System.out.println("tripleUp([]) -> " + tripleUp(new int[] {}));
		System.out.println("tripleUp([10, 9, 8, -100, -99, -98, 100]) -> " + tripleUp(new int[] {10, 9, 8, -100, -99, -98, 100}));
		System.out.println("tripleUp([10, 9, 8, -100, -99, 99, 100]) -> " + tripleUp(new int[] {10, 9, 8, -100, -99, 99, 100}));
		System.out.println("tripleUp([-100, -99, -99, 100, 101, 102]) -> " + tripleUp(new int[] {-100, -99, -99, 100, 101, 102}));
		System.out.println("tripleUp([2, 3, 5, 6, 8, 9, 2, 3]) -> " + tripleUp(new int[] {2, 3, 5, 6, 8, 9, 2, 3}));
		printMethod("fizzArray3");
		System.out.println("fizzArray3(5, 10) -> " + Arrays.toString(fizzArray3(5, 10)));
		System.out.println("fizzArray3(11, 18) -> " + Arrays.toString(fizzArray3(11, 18)));
		System.out.println("fizzArray3(1, 3) -> " + Arrays.toString(fizzArray3(1, 3)));
		System.out.println("fizzArray3(1, 2) -> " + Arrays.toString(fizzArray3(1, 2)));
		System.out.println("fizzArray3(1, 1) -> " + Arrays.toString(fizzArray3(1, 1)));
		System.out.println("fizzArray3(1000, 1005) -> " + Arrays.toString(fizzArray3(1000, 1005)));
		printMethod("shiftLeft");
		System.out.println("shiftLeft([6, 2, 5, 3]) -> " + Arrays.toString(shiftLeft(new int[] {6, 2, 5, 3})));
		System.out.println("shiftLeft([1, 2]) -> " + Arrays.toString(shiftLeft(new int[] {1, 2})));
		System.out.println("shiftLeft([1]) -> " + Arrays.toString(shiftLeft(new int[] {1})));
		System.out.println("shiftLeft([]) -> " + Arrays.toString(shiftLeft(new int[] {})));
		System.out.println("shiftLeft([1, 1, 2, 2, 4]) -> " + Arrays.toString(shiftLeft(new int[] {1, 1, 2, 2, 4})));
		System.out.println("shiftLeft([1, 1, 1]) -> " + Arrays.toString(shiftLeft(new int[] {1, 1, 1})));
		System.out.println("shiftLeft([1, 2, 3]) -> " + Arrays.toString(shiftLeft(new int[] {1, 2, 3})));
		printMethod("tenRun");
		System.out.println("tenRun([2, 10, 3, 4, 20, 5]) -> " + Arrays.toString(tenRun(new int[] {2, 10, 3, 4, 20, 5})));
		System.out.println("tenRun([10, 1, 20, 2]) -> " + Arrays.toString(tenRun(new int[] {10, 1, 20, 2})));
		System.out.println("tenRun([10, 1, 9, 20]) -> " + Arrays.toString(tenRun(new int[] {10, 1, 9, 20})));
		System.out.println("tenRun([1, 2, 50, 1]) -> " + Arrays.toString(tenRun(new int[] {1, 2, 50, 1})));
		System.out.println("tenRun([1, 20, 50, 1) -> " + Arrays.toString(tenRun(new int[] {1, 20, 50, 1})));
		System.out.println("tenRun([10, 10]) -> " + Arrays.toString(tenRun(new int[] {10, 10})));
		System.out.println("tenRun([0, 2]) -> " + Arrays.toString(tenRun(new int[] {0, 2})));
		System.out.println("tenRun([1, 2]) -> " + Arrays.toString(tenRun(new int[] {1, 2})));
		System.out.println("tenRun([1]) -> " + Arrays.toString(tenRun(new int[] {1})));
		System.out.println("tenRun([]) -> " + Arrays.toString(tenRun(new int[] {})));
		printMethod("pre4");
		System.out.println("pre4([1, 2, 4, 1]) -> " + Arrays.toString(pre4(new int[] {1, 2, 4, 1})));
		System.out.println("pre4([3, 1, 4]) -> " + Arrays.toString(pre4(new int[] {3, 1, 4})));
		System.out.println("pre4([1, 4, 4]) -> " + Arrays.toString(pre4(new int[] {1, 4, 4})));
		System.out.println("pre4([1, 4, 4, 2]) -> " + Arrays.toString(pre4(new int[] {1, 4, 4, 2})));
		System.out.println("pre4([1, 3, 4, 2, 4]) -> " + Arrays.toString(pre4(new int[] {1, 3, 4, 2, 4})));
		System.out.println("pre4([4, 4]) -> " + Arrays.toString(pre4(new int[] {4, 4})));
		System.out.println("pre4([3, 3, 4]) -> " + Arrays.toString(pre4(new int[] {3, 3, 4})));
		System.out.println("pre4([1, 2, 1, 4]) -> " + Arrays.toString(pre4(new int[] {1, 2, 1, 4})));
		System.out.println("pre4([2, 1, 4, 2]) -> " + Arrays.toString(pre4(new int[] {2, 1, 4, 2})));
		System.out.println("pre4([2, 1, 2, 1, 4, 2]) -> " + Arrays.toString(pre4(new int[] {2, 1, 2, 1, 4, 2})));
		printMethod("post4");
		System.out.println("post4([2, 4, 1, 2]) -> " + Arrays.toString(post4(new int[] {2, 4, 1, 2})));
		System.out.println("post4([4, 1, 4, 2]) -> " + Arrays.toString(post4(new int[] {4, 1, 4, 2})));
		System.out.println("post4([4, 4, 1, 2, 3]) -> " + Arrays.toString(post4(new int[] {4, 4, 1, 2, 3})));
		System.out.println("post4([4, 2]) -> " + Arrays.toString(post4(new int[] {4, 2})));
		System.out.println("post4([4, 4, 3]) -> " + Arrays.toString(post4(new int[] {4, 4, 3})));
		System.out.println("post4([4, 4]) -> " + Arrays.toString(post4(new int[] {4, 4})));
		System.out.println("post4([4]) -> " + Arrays.toString(post4(new int[] {4})));
		System.out.println("post4([2, 4, 1, 4, 3, 2]) -> " + Arrays.toString(post4(new int[] {2, 4, 1, 4, 3, 2})));
		System.out.println("post4([4, 1, 4, 2, 2, 2]) -> " + Arrays.toString(post4(new int[] {4, 1, 4, 2, 2, 2})));
		System.out.println("post4([3, 4, 3, 2]) -> " + Arrays.toString(post4(new int[] {3, 4, 3, 2})));
		printMethod("notAlone");
		System.out.println("notAlone([1, 2, 3], 2) -> " + Arrays.toString(notAlone(new int[] {1, 2, 3}, 2)));
		System.out.println("notAlone([1, 2, 3, 2, 5, 2], 2) -> " + Arrays.toString(notAlone(new int[] {1, 2, 3, 2, 5, 2}, 2)));
		System.out.println("notAlone([3, 4], 3) -> " + Arrays.toString(notAlone(new int[] {3, 4}, 3)));
		System.out.println("notAlone([3, 3], 3) -> " + Arrays.toString(notAlone(new int[] {3, 3}, 3)));
		System.out.println("notAlone([1, 3, 1, 2], 1) -> " + Arrays.toString(notAlone(new int[] {1, 3, 1, 2}, 1)));
		System.out.println("notAlone([3], 3) -> " + Arrays.toString(notAlone(new int[] {3}, 3)));
		System.out.println("notAlone([], 3) -> " + Arrays.toString(notAlone(new int[] {}, 3)));
		System.out.println("notAlone([7, 1, 6], 1) -> " + Arrays.toString(notAlone(new int[] {7, 1, 6}, 1)));
		System.out.println("notAlone([1, 1, 1], 1) -> " + Arrays.toString(notAlone(new int[] {1, 1, 1}, 1)));
		System.out.println("notAlone([1, 1, 1, 2], 1) -> " + Arrays.toString(notAlone(new int[] {1, 1, 1, 2}, 1)));
		printMethod("zeroFront");
		System.out.println("zeroFront([1, 0, 0, 1]) -> " + Arrays.toString(zeroFront(new int[] {1, 0, 0, 1})));
		System.out.println("zeroFront([0, 1, 1, 0, 1]) -> " + Arrays.toString(zeroFront(new int[] {0, 1, 1, 0, 1})));
		System.out.println("zeroFront([1, 0]) -> " + Arrays.toString(zeroFront(new int[] {1, 0})));
		System.out.println("zeroFront([0, 1]) -> " + Arrays.toString(zeroFront(new int[] {0, 1})));
		System.out.println("zeroFront([1, 1, 1, 0]) -> " + Arrays.toString(zeroFront(new int[] {1, 1, 1, 0})));
		System.out.println("zeroFront([2, 2, 2, 2]) -> " + Arrays.toString(zeroFront(new int[] {2, 2, 2, 2})));
		System.out.println("zeroFront([0, 0, 1, 0]) -> " + Arrays.toString(zeroFront(new int[] {0, 0, 1, 0})));
		System.out.println("zeroFront([-1, 0, 0, -1, 0]) -> " + Arrays.toString(zeroFront(new int[] {-1, 0, 0, -1, 0})));
		System.out.println("zeroFront([0, -3, 0, -3]) -> " + Arrays.toString(zeroFront(new int[] {0, -3, 0, -3})));
		System.out.println("zeroFront([]) -> " + Arrays.toString(zeroFront(new int[] {})));
		System.out.println("zeroFront([9, 9, 0, 9, 0, 9]) -> " + Arrays.toString(zeroFront(new int[] {9, 9, 0, 9, 0, 9})));
		printMethod("withoutTen");
		System.out.println("withoutTen([1, 10, 10, 2]) -> " + Arrays.toString(withoutTen(new int[] {1, 10, 10, 2})));
		System.out.println("withoutTen([10, 2, 10]) -> " + Arrays.toString(withoutTen(new int[] {10, 2, 10})));
		System.out.println("withoutTen([1, 99, 10]) -> " + Arrays.toString(withoutTen(new int[] {1, 99, 10})));
		System.out.println("withoutTen([10, 13, 10, 14]) -> " + Arrays.toString(withoutTen(new int[] {10, 13, 10, 14})));
		System.out.println("withoutTen([10, 13, 10, 14, 10]) -> " + Arrays.toString(withoutTen(new int[] {10, 13, 10, 14, 10})));
		System.out.println("withoutTen([10, 10, 3]) -> " + Arrays.toString(withoutTen(new int[] {10, 10, 3})));
		System.out.println("withoutTen([1]) -> " + Arrays.toString(withoutTen(new int[] {1})));
		System.out.println("withoutTen([13, 1]) -> " + Arrays.toString(withoutTen(new int[] {13, 1})));
		System.out.println("withoutTen([10]) -> " + Arrays.toString(withoutTen(new int[] {10})));
		System.out.println("withoutTen([]) -> " + Arrays.toString(withoutTen(new int[] {})));
		printMethod("zeroMax");
		System.out.println("zeroMax([0, 5, 0, 3]) -> " + Arrays.toString(zeroMax(new int[] {0, 5, 0, 3})));
		System.out.println("zeroMax([0, 4, 0, 3]) -> " + Arrays.toString(zeroMax(new int[] {0, 4, 0, 3})));
		System.out.println("zeroMax([0, 1, 0]) -> " + Arrays.toString(zeroMax(new int[] {0, 1, 0})));
		System.out.println("zeroMax([0, 1, 5]) -> " + Arrays.toString(zeroMax(new int[] {0, 1, 5})));
		System.out.println("zeroMax([0, 2, 0]) -> " + Arrays.toString(zeroMax(new int[] {0, 2, 0})));
		System.out.println("zeroMax([1]) -> " + Arrays.toString(zeroMax(new int[] {1})));
		System.out.println("zeroMax([0]) -> " + Arrays.toString(zeroMax(new int[] {0})));
		System.out.println("zeroMax([]) -> " + Arrays.toString(zeroMax(new int[] {})));
		System.out.println("zeroMax([7, 0, 4, 3, 0, 2]) -> " + Arrays.toString(zeroMax(new int[] {7, 0, 4, 3, 0, 2})));
		System.out.println("zeroMax([7, 0, 4, 3, 0, 1]) -> " + Arrays.toString(zeroMax(new int[] {7, 0, 4, 3, 0, 1})));
		System.out.println("zeroMax([7, 0, 4, 3, 0, 0]) -> " + Arrays.toString(zeroMax(new int[] {7, 0, 4, 3, 0, 0})));
		System.out.println("zeroMax([7, 0, 1, 0, 0, 7]) -> " + Arrays.toString(zeroMax(new int[] {7, 0, 1, 0, 0, 7})));
		printMethod("evenOdd");
		System.out.println("evenOdd([1, 0, 1, 0, 0, 1, 1]) -> " + Arrays.toString(evenOdd(new int[] {1, 0, 1, 0, 0, 1, 1})));
		System.out.println("evenOdd([3, 3, 2]) -> " + Arrays.toString(evenOdd(new int[] {3, 3, 2})));
		System.out.println("evenOdd([2, 2, 2]) -> " + Arrays.toString(evenOdd(new int[] {2, 2, 2})));
		System.out.println("evenOdd([3, 2, 2]) -> " + Arrays.toString(evenOdd(new int[] {3, 2, 2})));
		System.out.println("evenOdd([1, 1, 0, 1, 0]) -> " + Arrays.toString(evenOdd(new int[] {1, 1, 0, 1, 0})));
		System.out.println("evenOdd([1]) -> " + Arrays.toString(evenOdd(new int[] {1})));
		System.out.println("evenOdd([1, 2]) -> " + Arrays.toString(evenOdd(new int[] {1, 2})));
		System.out.println("evenOdd([2, 1]) -> " + Arrays.toString(evenOdd(new int[] {2, 1})));
		System.out.println("evenOdd([]) -> " + Arrays.toString(evenOdd(new int[] {})));
		printMethod("fizzBuzz");
		System.out.println("fizzBuzz(1, 6) -> " + HelperMethods.formatStringArray(fizzBuzz(1, 6)));
		System.out.println("fizzBuzz(1, 8) -> " + HelperMethods.formatStringArray(fizzBuzz(1, 8)));
		System.out.println("fizzBuzz(1, 11) -> " + HelperMethods.formatStringArray(fizzBuzz(1, 11)));
		System.out.println("fizzBuzz(1, 16) -> " + HelperMethods.formatStringArray(fizzBuzz(1, 16)));
		System.out.println("fizzBuzz(1, 4) -> " + HelperMethods.formatStringArray(fizzBuzz(1, 4)));
		System.out.println("fizzBuzz(1, 2) -> " + HelperMethods.formatStringArray(fizzBuzz(1, 2)));
		System.out.println("fizzBuzz(50, 56) -> " + HelperMethods.formatStringArray(fizzBuzz(50, 56)));
		System.out.println("fizzBuzz(15, 17) -> " + HelperMethods.formatStringArray(fizzBuzz(15, 17)));
		System.out.println("fizzBuzz(30, 36) -> " + HelperMethods.formatStringArray(fizzBuzz(30, 36)));
		System.out.println("fizzBuzz(1000, 1006) -> " + HelperMethods.formatStringArray(fizzBuzz(1000, 1006)));
		System.out.println("fizzBuzz(99, 102) -> " + HelperMethods.formatStringArray(fizzBuzz(99, 102)));
		System.out.println("fizzBuzz(14, 20) -> " + HelperMethods.formatStringArray(fizzBuzz(14, 20)));
	}
}
