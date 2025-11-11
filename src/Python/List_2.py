
import HelperMethods

def welcome():
    print("\n\nList-2 Functions\n")
    
"""
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

count_evens([2, 1, 2, 3, 4]) → 3
count_evens([2, 2, 0]) → 3
count_evens([1, 3, 5]) → 0
"""
def count_evens(nums):
    pass

"""
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
Note: the built-in min(v1, v2) and max(v1, v2) functions return the smaller or larger of two values.

big_diff([10, 3, 5, 6]) → 7
big_diff([7, 2, 10, 9]) → 8
big_diff([2, 10, 7, 2]) → 8
"""
def big_diff(nums):
    pass

"""
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring 
the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, 
and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

centered_average([1, 2, 3, 4, 100]) → 3
centered_average([1, 1, 5, 5, 10, 8, 7]) → 5
centered_average([-10, -4, -2, -4, -2, 0]) → -3
"""
def centered_average(nums):
    pass

"""
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers 
that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
"""
def sum13(nums):
    pass

"""
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
"""
def sum67(nums):
    pass

"""
Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → True
has22([1, 2, 1, 2]) → False
has22([2, 1, 2]) → False
"""
def has22(nums):
    pass

def main():
    welcome()
    HelperMethods.callTimes = 0
    HelperMethods.printMethod("count_evens")
    print(f"count_evens([2, 1, 2, 3, 4]) -> {count_evens([2, 1, 2, 3, 4])}")
    print(f"count_evens([2, 2, 0]) -> {count_evens([2, 2, 0])}")
    print(f"count_evens([1, 3, 5]) -> {count_evens([1, 3, 5])}")
    print(f"count_evens([]) -> {count_evens([])}")
    print(f"count_evens([11, 9, 0, 1]) -> {count_evens([11, 9, 0, 1])}")
    print(f"count_evens([2, 11, 9, 0]) -> {count_evens([2, 11, 9, 0])}")
    print(f"count_evens([2]) -> {count_evens([2])}")
    print(f"count_evens([2, 5, 12]) -> {count_evens([2, 5, 12])}")
    HelperMethods.printMethod("big_diff")
    print(f"big_diff([10, 3, 5, 6]) -> {big_diff([10, 3, 5, 6])}")
    print(f"big_diff([7, 2, 10, 9]) -> {big_diff([7, 2, 10, 9])}")
    print(f"big_diff([2, 10, 7, 2]) -> {big_diff([2, 10, 7, 2])}")
    print(f"big_diff([2, 10]) -> {big_diff([2, 10])}")
    print(f"big_diff([10, 2]) -> {big_diff([10, 2])}")
    print(f"big_diff([10, 0]) -> {big_diff([10, 0])}")
    print(f"big_diff([2, 3]) -> {big_diff([2, 3])}")
    print(f"big_diff([2, 2]) -> {big_diff([2, 2])}")
    print(f"big_diff([2]) -> {big_diff([2])}")
    print(f"big_diff([5, 1, 6, 1, 9, 9]) -> {big_diff([5, 1, 6, 1, 9, 9])}")
    print(f"big_diff([7, 6, 8, 5]) -> {big_diff([7, 6, 8, 5])}")
    print(f"big_diff([7, 7, 6, 8, 5, 5, 6]) -> {big_diff([7, 7, 6, 8, 5, 5, 6])}")
    HelperMethods.printMethod("centered_average")
    print(f"centered_average([1, 2, 3, 4, 100]) -> {centered_average([1, 2, 3, 4, 100])}")
    print(f"centered_average([1, 1, 5, 5, 10, 8, 7]) -> {centered_average([1, 1, 5, 5, 10, 8, 7])}")
    print(f"centered_average([-10, -4, -2, -4, -2, 0]) -> {centered_average([-10, -4, -2, -4, -2, 0])}")
    print(f"centered_average([5, 3, 4, 6, 2]) -> {centered_average([5, 3, 4, 6, 2])}")
    print(f"centered_average([5, 3, 4, 0, 100]) -> {centered_average([5, 3, 4, 0, 100])}")
    print(f"centered_average([100, 0, 5, 3, 4]) -> {centered_average([100, 0, 5, 3, 4])}")
    print(f"centered_average([4, 0, 100]) -> {centered_average([4, 0, 100])}")
    print(f"centered_average([0, 2, 3, 4, 100]) -> {centered_average([0, 2, 3, 4, 100])}")
    print(f"centered_average([1, 1, 100]) -> {centered_average([1, 1, 100])}")
    print(f"centered_average([7, 7, 7]) -> {centered_average([7, 7, 7])}")
    print(f"centered_average([1, 7, 8]) -> {centered_average([1, 7, 8])}")
    print(f"centered_average([1, 1, 99, 99]) -> {centered_average([1, 1, 99, 99])}")
    print(f"centered_average([1000, 0, 1, 99]) -> {centered_average([1000, 0, 1, 99])}")
    print(f"centered_average([4, 4, 4, 4, 5]) -> {centered_average([4, 4, 4, 4, 5])}")
    print(f"centered_average([4, 4, 4, 1, 5]) -> {centered_average([4, 4, 4, 1, 5])}")
    print(f"centered_average([6, 4, 8, 12, 3]) -> {centered_average([6, 4, 8, 12, 3])}")
    HelperMethods.printMethod("sum13")
    print(f"sum13([1, 2, 2, 1]) -> {sum13([1, 2, 2, 1])}")
    print(f"sum13([1, 1]) -> {sum13([1, 1])}")
    print(f"sum13([1, 2, 2, 1, 13]) -> {sum13([1, 2, 2, 1, 13])}")
    print(f"sum13([1, 2, 13, 2, 1, 13]) -> {sum13([1, 2, 13, 2, 1, 13])}")
    print(f"sum13([13, 1, 2, 13, 2, 1, 13]) -> {sum13([13, 1, 2, 13, 2, 1, 13])}")
    print(f"sum13([]) -> {sum13([])}")
    print(f"sum13([13]) -> {sum13([13])}")
    print(f"sum13([13, 13]) -> {sum13([13, 13])}")
    print(f"sum13([13, 0, 13]) -> {sum13([13, 0, 13])}")
    print(f"sum13([13, 1, 13]) -> {sum13([13, 1, 13])}")
    print(f"sum13([5, 7, 2]) -> {sum13([5, 7, 2])}")
    print(f"sum13([5, 13, 2]) -> {sum13([5, 13, 2])}")
    print(f"sum13([0]) -> {sum13([0])}")
    print(f"sum13([13, 0]) -> {sum13([13, 0])}")
    HelperMethods.printMethod("sum67")
    print(f"sum67([1, 2, 2]) -> {sum67([1, 2, 2])}")
    print(f"sum67([1, 2, 2, 6, 99, 99, 7]) -> {sum67([1, 2, 2, 6, 99, 99, 7])}")
    print(f"sum67([1, 1, 6, 7, 2]) -> {sum67([1, 1, 6, 7, 2])}")
    print(f"sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) -> {sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7])}")
    print(f"sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) -> {sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7])}")
    print(f"sum67([2, 7, 6, 2, 6, 7, 2, 7]) -> {sum67([2, 7, 6, 2, 6, 7, 2, 7])}")
    print(f"sum67([2, 7, 6, 2, 6, 2, 7]) -> {sum67([2, 7, 6, 2, 6, 2, 7])}")
    print(f"sum67([1, 6, 7, 7]) -> {sum67([1, 6, 7, 7])}")
    print(f"sum67([6, 7, 1, 6, 7, 7]) -> {sum67([6, 7, 1, 6, 7, 7])}")
    print(f"sum67([6, 8, 1, 6, 7]) -> {sum67([6, 8, 1, 6, 7])}")
    print(f"sum67([]) -> {sum67([])}")
    print(f"sum67([6, 7, 11]) -> {sum67([6, 7, 11])}")
    print(f"sum67([11, 6, 7, 11]) -> {sum67([11, 6, 7, 11])}")
    print(f"sum67([2, 2, 6, 7, 7]) -> {sum67([2, 2, 6, 7, 7])}")
    HelperMethods.printMethod("has22")
    print(f"has22([1, 2, 2]) -> {has22([1, 2, 2])}")
    print(f"has22([1, 2, 1, 2]) -> {has22([1, 2, 1, 2])}")
    print(f"has22([2, 1, 2]) -> {has22([2, 1, 2])}")
    print(f"has22([2, 2, 1, 2]) -> {has22([2, 2, 1, 2])}")
    print(f"has22([1, 3, 2]) -> {has22([1, 3, 2])}")
    print(f"has22([1, 3, 2, 2]) -> {has22([1, 3, 2, 2])}")
    print(f"has22([2, 3, 2, 2]) -> {has22([2, 3, 2, 2])}")
    print(f"has22([4, 2, 4, 2, 2, 5]) -> {has22([4, 2, 4, 2, 2, 5])}")
    print(f"has22([1, 2]) -> {has22([1, 2])}")
    print(f"has22([2, 2]) -> {has22([2, 2])}")
    print(f"has22([2]) -> {has22([2])}")
    print(f"has22([]) -> {has22([])}")
    print(f"has22([3, 3, 2, 2]) -> {has22([3, 3, 2, 2])}")
    print(f"has22([5, 2, 5, 2]) -> {has22([5, 2, 5, 2])}")

if __name__ == "__main__":
    main()