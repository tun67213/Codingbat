
import HelperMethods

def welcome():
    print("\nWarmup-1 Functions\n")

"""
The parameter weekday is True if it is a weekday, and the parameter vacation is True if we are on vacation. 
We sleep in if it is not a weekday or we're on vacation. Return True if we sleep in.

sleep_in(False, False) → True
sleep_in(True, False) → False
sleep_in(False, True) → True
"""
def sleep_in(weekday, vacation):
    return vacation or not weekday

"""
We have two monkeys, a and b, and the parameters a_smile and b_smile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. Return True if we are in trouble.

monkey_trouble(True, True) → True
monkey_trouble(False, False) → True
monkey_trouble(True, False) → False
"""
def monkey_trouble(a_smile, b_smile):
    pass

"""
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sum_double(1, 2) → 3
sum_double(3, 2) → 5
sum_double(2, 2) → 8
"""
def sum_double(a, b):
    pass

"""
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
"""
def diff21(n):
    pass

"""
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return True if we are in trouble.

parrot_trouble(True, 6) → True
parrot_trouble(True, 7) → False
parrot_trouble(False, 6) → False
"""
def parrot_trouble(talking, hour):
    pass

"""
Given 2 ints, a and b, return True if one if them is 10 or if their sum is 10.

makes10(9, 10) → True
makes10(9, 9) → False
makes10(1, 9) → True
"""
def makes10(a, b):
    pass

"""
Given an int n, return True if it is within 10 of 100 or 200. Note: abs(num) computes the absolute value of a number.

near_hundred(93) → True
near_hundred(90) → True
near_hundred(89) → False
"""
def near_hundred(n):
    pass

"""
Given 2 int values, return True if one is negative and one is positive. 
Except if the parameter "negative" is True, then return True only if both are negative.

pos_neg(1, -1, False) → True
pos_neg(-1, 1, False) → True
pos_neg(-4, -5, True) → True
"""
def pos_neg(a, b, negative):
    pass

"""
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.

not_string('candy') → 'not candy'
not_string('x') → 'not x'
not_string('not bad') → 'not bad'
"""
def not_string(str):
    pass

"""
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..len(str)-1 inclusive).

missing_char('kitten', 1) → 'ktten'
missing_char('kitten', 0) → 'itten'
missing_char('kitten', 4) → 'kittn'
"""
def missing_char(str, n):
    pass

"""
Given a string, return a new string where the first and last chars have been exchanged.

front_back('code') → 'eodc'
front_back('a') → 'a'
front_back('ab') → 'ba'
"""
def front_back(str):
    pass

"""
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3('Java') → 'JavJavJav'
front3('Chocolate') → 'ChoChoCho'
front3('abc') → 'abcabcabc'
"""
def front3(str):
    pass

def main():
    welcome()
    HelperMethods.printMethod("sleep_in")
    print(f"sleep_in(False, False) -> {sleep_in(False, False)}")
    print(f"sleep_in(True, False) -> {sleep_in(True, False)}")
    print(f"sleep_in(False, True) -> {sleep_in(False, True)}")
    print(f"sleep_in(True, True) -> {sleep_in(True, True)}")
    HelperMethods.printMethod("monkey_trouble")
    print(f"monkey_trouble(True, True) -> {monkey_trouble(True, True)}")
    print(f"monkey_trouble(False, False) -> {monkey_trouble(False, False)}")
    print(f"monkey_trouble(True, False) -> {monkey_trouble(True, False)}")
    print(f"monkey_trouble(False, True) -> {monkey_trouble(False, True)}")
    HelperMethods.printMethod("sum_double")
    print(f"sum_double(1, 2) -> {sum_double(1, 2)}")
    print(f"sum_double(3, 2) -> {sum_double(3, 2)}")
    print(f"sum_double(2, 2) -> {sum_double(2, 2)}")
    print(f"sum_double(-1, 0) -> {sum_double(-1, 0)}")
    print(f"sum_double(3, 3) -> {sum_double(3, 3)}")
    print(f"sum_double(0, 0) -> {sum_double(0, 0)}")
    print(f"sum_double(0, 1) -> {sum_double(0, 1)}")
    print(f"sum_double(3, 4) -> {sum_double(3, 4)}")
    HelperMethods.printMethod("diff21")
    print(f"diff21(19) -> {diff21(19)}")
    print(f"diff21(10) -> {diff21(10)}")
    print(f"diff21(21) -> {diff21(21)}")
    print(f"diff21(22) -> {diff21(22)}")
    print(f"diff21(25) -> {diff21(25)}")
    print(f"diff21(30) -> {diff21(30)}")
    print(f"diff21(0) -> {diff21(0)}")
    print(f"diff21(1) -> {diff21(1)}")
    print(f"diff21(2) -> {diff21(2)}")
    print(f"diff21(-1) -> {diff21(-1)}")
    print(f"diff21(-2) -> {diff21(-2)}")
    print(f"diff21(50) -> {diff21(50)}")
    HelperMethods.printMethod("parrot_trouble")
    print(f"parrot_trouble(True, 6) -> {parrot_trouble(True, 6)}")
    print(f"parrot_trouble(True, 7) -> {parrot_trouble(True, 7)}")
    print(f"parrot_trouble(False, 6) -> {parrot_trouble(False, 6)}")
    print(f"parrot_trouble(True, 21) -> {parrot_trouble(True, 21)}")
    print(f"parrot_trouble(False, 21) -> {parrot_trouble(False, 21)}")
    print(f"parrot_trouble(False, 20) -> {parrot_trouble(False, 20)}")
    print(f"parrot_trouble(True, 23) -> {parrot_trouble(True, 23)}")
    print(f"parrot_trouble(False, 23) -> {parrot_trouble(False, 23)}")
    print(f"parrot_trouble(True, 20) -> {parrot_trouble(True, 20)}")
    print(f"parrot_trouble(False, 12) -> {parrot_trouble(False, 12)}")
    HelperMethods.printMethod("makes10")
    print(f"makes10(9, 10) -> {makes10(9, 10)}")
    print(f"makes10(9, 9) -> {makes10(9, 9)}")
    print(f"makes10(1, 9) -> {makes10(1, 9)}")
    print(f"makes10(10, 1) -> {makes10(10, 1)}")
    print(f"makes10(10, 10) -> {makes10(10, 10)}")
    print(f"makes10(8, 2) -> {makes10(8, 2)}")
    print(f"makes10(8, 3) -> {makes10(8, 3)}")
    print(f"makes10(10, 42) -> {makes10(10, 42)}")
    print(f"makes10(12, -2) -> {makes10(12, -2)}")
    HelperMethods.printMethod("near_hundred")
    print(f"near_hundred(93) -> {near_hundred(93)}")
    print(f"near_hundred(90) -> {near_hundred(90)}")
    print(f"near_hundred(89) -> {near_hundred(89)}")
    print(f"near_hundred(110) -> {near_hundred(110)}")
    print(f"near_hundred(111) -> {near_hundred(111)}")
    print(f"near_hundred(121) -> {near_hundred(121)}")
    print(f"near_hundred(-101) -> {near_hundred(-101)}")
    print(f"near_hundred(-209) -> {near_hundred(-209)}")
    print(f"near_hundred(190) -> {near_hundred(190)}")
    print(f"near_hundred(209) -> {near_hundred(209)}")
    print(f"near_hundred(0) -> {near_hundred(0)}")
    print(f"near_hundred(5) -> {near_hundred(5)}")
    print(f"near_hundred(-50) -> {near_hundred(-50)}")
    print(f"near_hundred(191) -> {near_hundred(191)}")
    print(f"near_hundred(189) -> {near_hundred(189)}")
    print(f"near_hundred(200) -> {near_hundred(200)}")
    print(f"near_hundred(210) -> {near_hundred(210)}")
    print(f"near_hundred(211) -> {near_hundred(211)}")
    print(f"near_hundred(290) -> {near_hundred(290)}")
    HelperMethods.printMethod("pos_neg")
    print(f"pos_neg(1, -1, False) -> {pos_neg(1, -1, False)}")
    print(f"pos_neg(-1, 1, False) -> {pos_neg(-1, 1, False)}")
    print(f"pos_neg(-4, -5, True) -> {pos_neg(-4, -5, True)}")
    print(f"pos_neg(-4, -5, False) -> {pos_neg(-4, -5, False)}")
    print(f"pos_neg(-4, 5, False) -> {pos_neg(-4, -5, False)}")
    print(f"pos_neg(-4, 5, True) -> {pos_neg(-4, 5, True)}")
    print(f"pos_neg(1, 1, False) -> {pos_neg(1, 1, False)}")
    print(f"pos_neg(-1, -1, False) -> {pos_neg(-1, -1, False)}")
    print(f"pos_neg(1, -1, True) -> {pos_neg(1, -1, True)}")
    print(f"pos_neg(-1, 1, True) -> {pos_neg(-1, 1, True)}")
    print(f"pos_neg(1, 1, True) -> {pos_neg(1, 1, True)}")
    print(f"pos_neg(-1, -1, True) -> {pos_neg(-1, -1, True)}")
    print(f"pos_neg(5, -5, False) -> {pos_neg(5, -5, False)}")
    print(f"pos_neg(-6, 6, False) -> {pos_neg(-6, 6, False)}")
    print(f"pos_neg(-5, -6, False) -> {pos_neg(-5, -6, False)}")
    print(f"pos_neg(-2, -1, False) -> {pos_neg(-2, -1, False)}")
    print(f"pos_neg(1, 2, False) -> {pos_neg(1, 2, False)}")
    print(f"pos_neg(-5, 6, True) -> {pos_neg(-5, 6, True)}")
    print(f"pos_neg(-5, -5, True) -> {pos_neg(-5, -5, True)}")
    HelperMethods.printMethod("not_string")
    print(f"not_string('candy') -> '{not_string('candy')}'")
    print(f"not_string('x') -> '{not_string('x')}'")
    print(f"not_string('not bad') -> '{not_string('not bad')}")
    print(f"not_string('bad') -> '{not_string('bad')}")
    print(f"not_string('not') -> '{not_string('not')}'")
    print(f"not_string('is not') -> '{not_string('is not')}'")
    print(f"not_string('no') -> '{not_string('no')}'")
    HelperMethods.printMethod("missing_char")
    print(f"missing_char('kitten', 1) -> '{missing_char('kitten', 1)}'")
    print(f"missing_char('kitten', 0) -> '{missing_char('kitten', 0)}'")
    print(f"missing_char('kitten', 4) -> '{missing_char('kitten', 4)}'")
    print(f"missing_char('Hi', 0) -> '{missing_char('Hi', 0)}'")
    print(f"missing_char('Hi', 1) -> '{missing_char('Hi', 1)}'")
    print(f"missing_char('code', 0) -> '{missing_char('code', 0)}'")
    print(f"missing_char('code', 1) -> '{missing_char('code', 1)}'")
    print(f"missing_char('code', 2) -> '{missing_char('code', 2)}'")
    print(f"missing_char('code', 3) -> '{missing_char('code', 3)}'")
    print(f"missing_char('chocolate', 8) -> '{missing_char('chocolate', 8)}'")
    HelperMethods.printMethod("front_back")
    print(f"front_back('code') -> '{front_back('code')}'")
    print(f"front_back('a') -> '{front_back('a')}'")
    print(f"front_back('ab') -> '{front_back('ab')}'")
    print(f"front_back('abc') -> '{front_back('abc')}'")
    print(f"front_back('') -> '{front_back('')}'")
    print(f"front_back('Chocolate') -> '{front_back('Chocolate')}'")
    print(f"front_back('aavJ') -> '{front_back('aavJ')}'")
    print(f"front_back('hello') -> '{front_back('hello')}'")
    HelperMethods.printMethod("front3")
    print(f"front3('Java') -> '{front3('Java')}'")
    print(f"front3('Chocolate') -> '{front3('Chocolate')}'")
    print(f"front3('abc') -> '{front3('abc')}'")
    print(f"front3('abcXYZ') -> '{front3('abcXYZ')}'")
    print(f"front3('ab') -> '{front3('ab')}'")
    print(f"front3('a') -> '{front3('a')}'")
    print(f"front3('') -> '{front3('')}'")

if __name__ == "__main__":
    main()
