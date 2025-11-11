
import HelperMethods

def welcome():
    print("\n\nLogic-1 Functions\n")

"""
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
Return True if it is possible to make the goal by choosing from the given bricks. 
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

make_bricks(3, 1, 8) → True
make_bricks(3, 1, 9) → False
make_bricks(3, 2, 10) → True
"""
def make_bricks(small, big, goal):
    pass

"""
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count 
towards the sum.

lone_sum(1, 2, 3) → 6
lone_sum(3, 2, 3) → 2
lone_sum(3, 3, 3) → 0
"""
def lone_sum(a, b, c):
    pass

"""
Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values 
to its right do not count. So for example, if b is 13, then both b and c do not count.

lucky_sum(1, 2, 3) → 6
lucky_sum(1, 2, 13) → 3
lucky_sum(1, 13, 3) → 1
"""
def lucky_sum(a, b, c):
    pass

"""
Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that 
value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "def fix_teen(n):"that takes in an int value 
and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). 
Define the helper below and at the same indent level as the main no_teen_sum().

no_teen_sum(1, 2, 3) → 6
no_teen_sum(2, 13, 1) → 3
no_teen_sum(2, 1, 14) → 3
"""
def no_teen_sum(a, b, c):
    pass

"""
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. 
Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. 
Given 3 ints, a b c, return the sum of their rounded values. 
To avoid code repetition, write a separate helper "def round10(num):" and call it 3 times. 
Write the helper entirely below and at the same indent level as round_sum().

round_sum(16, 17, 18) → 60
round_sum(12, 13, 14) → 30
round_sum(6, 4, 4) → 10
"""
def round_sum(a, b, c):
    pass

"""
Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1), while the other is "far", 
differing from both other values by 2 or more. 
Note: abs(num) computes the absolute value of a number.

close_far(1, 2, 10) → True
close_far(1, 2, 3) → False
close_far(4, 1, 3) → True
"""
def close_far(a, b, c):
    pass

"""
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

make_chocolate(4, 1, 9) → 4
make_chocolate(4, 1, 10) → -1
make_chocolate(4, 1, 7) → 2
"""
def make_chocolate(small, big, goal):
    pass

def main():
    welcome()
    HelperMethods.callTimes = 0
    HelperMethods.printMethod("make_bricks")
    print(f"make_bricks(3, 1, 8) -> {make_bricks(3, 1, 8)}")
    print(f"make_bricks(3, 1, 9) -> {make_bricks(3, 1, 9)}")
    print(f"make_bricks(3, 2, 10) -> {make_bricks(3, 2, 10)}")
    print(f"make_bricks(3, 2, 8) -> {make_bricks(3, 2, 8)}")
    print(f"make_bricks(3, 2, 9) -> {make_bricks(3, 2, 9)}")
    print(f"make_bricks(6, 1, 11) -> {make_bricks(6, 1, 11)}")
    print(f"make_bricks(6, 0, 11) -> {make_bricks(6, 0, 11)}")
    print(f"make_bricks(1, 4, 11) -> {make_bricks(1, 4, 11)}")
    print(f"make_bricks(3, 1, 7) -> {make_bricks(3, 1, 7)}")
    print(f"make_bricks(1, 1, 7) -> {make_bricks(1, 1, 7)}")
    print(f"make_bricks(2, 1, 7) -> {make_bricks(2, 1, 7)}")
    print(f"make_bricks(7, 1, 11) -> {make_bricks(7, 1, 11)}")
    print(f"make_bricks(7, 1, 8) -> {make_bricks(7, 1, 8)}")
    print(f"make_bricks(7, 1, 13) -> {make_bricks(7, 1, 13)}")
    print(f"make_bricks(43, 1, 46) -> {make_bricks(43, 1, 46)}")
    print(f"make_bricks(40, 1, 46) -> {make_bricks(40, 1, 46)}")
    print(f"make_bricks(40, 2, 47) -> {make_bricks(40, 2, 47)}")
    print(f"make_bricks(40, 2, 50) -> {make_bricks(40, 2, 50)}")
    print(f"make_bricks(40, 2, 52) -> {make_bricks(40, 2, 52)}")
    print(f"make_bricks(22, 2, 33) -> {make_bricks(22, 2, 33)}")
    print(f"make_bricks(0, 2, 10) -> {make_bricks(0, 2, 10)}")
    print(f"make_bricks(1000000, 1000, 1000100) -> {make_bricks(1000000, 1000, 1000100)}")
    print(f"make_bricks(2, 1000000, 100003) -> {make_bricks(2, 1000000, 100003)}")
    print(f"make_bricks(20, 0, 19) -> {make_bricks(20, 0, 19)}")
    print(f"make_bricks(20, 0, 21) -> {make_bricks(20, 0, 21)}")
    print(f"make_bricks(20, 4, 51) -> {make_bricks(20, 4, 51)}")
    print(f"make_bricks(20, 4, 39) -> {make_bricks(20, 4, 39)}")
    HelperMethods.printMethod("lone_sum")
    print(f"lone_sum(1, 2, 3) -> {lone_sum(1, 2, 3)}")
    print(f"lone_sum(3, 2, 3) -> {lone_sum(3, 2, 3)}")
    print(f"lone_sum(3, 3, 3) -> {lone_sum(3, 3, 3)}")
    print(f"lone_sum(9, 2, 2) -> {lone_sum(9, 2, 2)}")
    print(f"lone_sum(2, 2, 9) -> {lone_sum(2, 2, 9)}")
    print(f"lone_sum(2, 9, 2) -> {lone_sum(2, 9, 2)}")
    print(f"lone_sum(2, 9, 3) -> {lone_sum(2, 9, 3)}")
    print(f"lone_sum(4, 2, 3) -> {lone_sum(4, 2, 3)}")
    print(f"lone_sums(1, 3, 1) -> {lone_sum(1, 3, 1)}")
    HelperMethods.printMethod("lucky_sum")
    print(f"lucky_sum(1, 2, 3) -> {lucky_sum(1, 2, 3)}")
    print(f"lucky_sum(1, 2, 13) -> {lucky_sum(1, 2, 13)}")
    print(f"lucky_sum(1, 13, 3) -> {lucky_sum(1, 13, 3)}")
    print(f"lucky_sum(1, 13, 13) -> {lucky_sum(1, 13, 13)}")
    print(f"lucky_sum(6, 5, 2) -> {lucky_sum(6, 5, 2)}")
    print(f"lucky_sum(13, 2, 3) -> {lucky_sum(13, 2, 3)}")
    print(f"lucky_sum(13, 2, 13) -> {lucky_sum(13, 2, 13)}")
    print(f"lucky_sum(13, 13, 2) -> {lucky_sum(13, 13, 2)}")
    print(f"lucky_sum(9, 4, 13) -> {lucky_sum(9, 4, 13)}")
    print(f"lucky_sum(8, 13, 2) -> {lucky_sum(8, 13, 2)}")
    print(f"lucky_sum(7, 2, 1) -> {lucky_sum(7, 2, 1)}")
    print(f"lucky_sum(3, 3, 13) -> {lucky_sum(3, 3, 13)}")
    HelperMethods.printMethod("no_teen_sum")
    print(f"no_teen_sum(1, 2, 3) -> {no_teen_sum(1, 2, 3)}")
    print(f"no_teen_sum(2, 13, 1) -> {no_teen_sum(2, 13, 1)}")
    print(f"no_teen_sum(2, 1, 14) -> {no_teen_sum(2, 1, 14)}")
    print(f"no_teen_sum(2, 1, 15) -> {no_teen_sum(2, 1, 15)}")
    print(f"no_teen_sum(2, 1, 16) -> {no_teen_sum(2, 1, 16)}")
    print(f"no_teen_sum(2, 1, 17) -> {no_teen_sum(2, 1, 17)}")
    print(f"no_teen_sum(17, 1, 2) -> {no_teen_sum(17, 1, 2)}")
    print(f"no_teen_sum(2, 15, 2) -> {no_teen_sum(2, 15, 2)}")
    print(f"no_teen_sum(16, 17, 18) -> {no_teen_sum(16, 17, 18)}")
    print(f"no_teen_sum(17, 18, 19) -> {no_teen_sum(17, 18, 19)}")
    print(f"no_teen_sum(15, 16, 1) -> {no_teen_sum(15, 16, 1)}")
    print(f"no_teen_sum(15, 15, 19) -> {no_teen_sum(15, 15, 19)}")
    print(f"no_teen_sum(15, 19, 16) -> {no_teen_sum(15, 19, 16)}")
    print(f"no_teen_sum(5, 17, 18) -> {no_teen_sum(5, 17, 18)}")
    print(f"no_teen_sum(17, 18, 16) -> {no_teen_sum(17, 18, 16)}")
    print(f"no_teen_sum(17, 19, 18) -> {no_teen_sum(17, 19, 18)}")
    HelperMethods.printMethod("round_sum")
    print(f"round_sum(16, 17, 18) -> {round_sum(16, 17, 18)}")
    print(f"round_sum(12, 13, 14) -> {round_sum(12, 13, 14)}")
    print(f"round_sum(6, 4, 4) -> {round_sum(6, 4, 4)}")
    print(f"round_sum(4, 6, 5) -> {round_sum(4, 6, 5)}")
    print(f"round_sum(4, 4, 6) -> {round_sum(4, 4, 6)}")
    print(f"round_sum(9, 4, 4) -> {round_sum(9, 4, 4)}")
    print(f"round_sum(0, 0, 1) -> {round_sum(0, 0, 1)}")
    print(f"round_sum(0, 9, 0) -> {round_sum(0, 9, 0)}")
    print(f"round_sum(10, 10, 19) -> {round_sum(10, 10, 19)}")
    print(f"round_sum(20, 30, 40) -> {round_sum(20, 30, 40)}")
    print(f"round_sum(45, 21, 30) -> {round_sum(45, 21, 30)}")
    print(f"round_sum(23, 11, 26) -> {round_sum(23, 11, 26)}")
    print(f"round_sum(23, 24, 25) -> {round_sum(23, 24, 25)}")
    print(f"round_sum(25, 24, 25) -> {round_sum(25, 24, 25)}")
    print(f"round_sum(23, 24, 29) -> {round_sum(23, 24, 29)}")
    print(f"round_sum(11, 24, 36) -> {round_sum(11, 24, 36)}")
    print(f"round_sum(24, 36, 32) -> {round_sum(24, 36, 32)}")
    print(f"round_sum(14, 12, 26) -> {round_sum(14, 12, 26)}")
    print(f"round_sum(12, 10, 24) -> {round_sum(12, 10, 24)}")
    HelperMethods.printMethod("close_far")
    print(f"close_far(1, 2, 10) -> {close_far(1, 2, 10)}")
    print(f"close_far(1, 2, 3) -> {close_far(1, 2, 3)}")
    print(f"close_far(4, 1, 3) -> {close_far(4, 1, 3)}")
    print(f"close_far(4, 5, 3) -> {close_far(4, 5, 3)}")
    print(f"close_far(4, 3, 5) -> {close_far(4, 3, 5)}")
    print(f"close_far(-1, 10, 0) -> {close_far(-1, 10, 0)}")
    print(f"close_far(0, -1, 10) -> {close_far(0, -1, 10)}")
    print(f"close_far(10, 10, 8) -> {close_far(10, 10, 8)}")
    print(f"close_far(10, 8, 9) -> {close_far(10, 8, 9)}")
    print(f"close_far(8, 9, 10) -> {close_far(8, 9, 10)}")
    print(f"close_far(8, 9, 7) -> {close_far(8, 9, 7)}")
    print(f"close_far(8, 6, 9) -> {close_far(8, 6, 9)}")
    HelperMethods.printMethod("make_chocolate")
    print(f"make_chocolate(4, 1, 9) -> {make_chocolate(4, 1, 9)}")
    print(f"make_chocolate(4, 1, 10) -> {make_chocolate(4, 1, 10)}")
    print(f"make_chocolate(4, 1, 7) -> {make_chocolate(4, 1, 7)}")
    print(f"make_chocolate(6, 2, 7) -> {make_chocolate(6, 2, 7)}")
    print(f"make_chocolate(4, 1, 5) -> {make_chocolate(4, 1, 5)}")
    print(f"make_chocolate(4, 1, 4) -> {make_chocolate(4, 1, 4)}")
    print(f"make_chocolate(5, 4, 9) -> {make_chocolate(5, 4, 9)}")
    print(f"make_chocolate(9, 3, 18) -> {make_chocolate(9, 3, 18)}")
    print(f"make_chocolate(3, 1, 9) -> {make_chocolate(3, 1, 9)}")
    print(f"make_chocolate(1, 2, 7) -> {make_chocolate(1, 2, 7)}")
    print(f"make_chocolate(1, 2, 6) -> {make_chocolate(1, 2, 6)}")
    print(f"make_chocolate(1, 2, 5) -> {make_chocolate(1, 2, 5)}")
    print(f"make_chocolate(6, 1, 10) -> {make_chocolate(6, 1, 10)}")
    print(f"make_chocolate(6, 1, 11) -> {make_chocolate(6, 1, 11)}")
    print(f"make_chocolate(6, 1, 12) -> {make_chocolate(6, 1, 12)}")
    print(f"make_chocolate(6, 1, 13) -> {make_chocolate(6, 1, 13)}")
    print(f"make_chocolate(6, 2, 10) -> {make_chocolate(6, 2, 10)}")
    print(f"make_chocolate(6, 2, 11) -> {make_chocolate(6, 2, 11)}")
    print(f"make_chocolate(6, 2, 12) -> {make_chocolate(6, 2, 12)}")
    print(f"make_chocolate(60, 100, 550) -> {make_chocolate(60, 100, 550)}")
    print(f"make_chocolate(1000, 1000000, 5000006) -> {make_chocolate(1000, 1000000, 5000006)}")
    print(f"make_chocolate(7, 1, 12) -> {make_chocolate(7, 1, 12)}")
    print(f"make_chocolate(7, 1, 13) -> {make_chocolate(7, 1, 13)}")
    print(f"make_chocolate(7, 2, 13) -> {make_chocolate(7, 2, 13)}")

if __name__ == "__main__":
    main()