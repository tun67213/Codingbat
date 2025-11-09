
import HelperMethods

def welcome():
    print("\n\nWarmup_2 Functions\n")

"""
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

string_times('Hi', 2) → 'HiHi'
string_times('Hi', 3) → 'HiHiHi'
string_times('Hi', 1) → 'Hi'
"""
def string_times(str, n):
    pass

"""
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
or whatever is there if the string is less than length 3. Return n copies of the front;

front_times('Chocolate', 2) → 'ChoCho'
front_times('Chocolate', 3) → 'ChoChoCho'
front_times('Abc', 3) → 'AbcAbcAbc'
"""
def front_times(str, n):
    pass

"""
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

string_bits('Hello') → 'Hlo'
string_bits('Hi') → 'H'
string_bits('Heeololeo') → 'Hello'
"""
def string_bits(str):
    pass

"""
Given a non-empty string like "Code" return a string like "CCoCodCode".

string_splosion('Code') → 'CCoCodCode'
string_splosion('abc') → 'aababc'
string_splosion('ab') → 'aab'
"""
def string_splosion(str):
    pass

"""
Given a string, return the count of the number of times that a substring length 2 appears in the string 
and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2('hixxhi') → 1
last2('xaxxaxaxx') → 1
last2('axxxaaxx') → 2
"""
def last2(str):
    pass


"""
Given an array of ints, return the number of 9's in the array.

array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3
"""
def array_count9(nums):
    pass

"""
Given an array of ints, return True if one of the first 4 elements in the array is a 9. The array length may be less than 4.

array_front9([1, 2, 9, 3, 4]) → True
array_front9([1, 2, 3, 4, 9]) → False
array_front9([1, 2, 3, 4, 5]) → False
"""
def array_front9(nums):
    pass


"""
Given an array of ints, return True if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → True
array123([1, 1, 2, 4, 1]) → False
array123([1, 1, 2, 1, 2, 3]) → True
"""
def array123(nums):
    pass

"""
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

string_match('xxcaazz', 'xxbaaz') → 3
string_match('abc', 'abc') → 2
string_match('abc', 'axc') → 0
"""
def string_match(a, b):
    pass

def main():
    welcome()
    HelperMethods.callTimes = 0
    HelperMethods.printMethod("string_times")
    print(f"string_times('Hi', 2) -> '{string_times('Hi', 2)}'")
    print(f"string_times('Hi', 3) -> '{string_times('Hi', 3)}'")
    print(f"string_times('Hi', 1) -> '{string_times('Hi', 1)}'")
    print(f"string_times('Hi', 0) -> '{string_times('Hi', 0)}'")
    print(f"string_times('Hi', 5) -> '{string_times('Hi', 5)}'")
    print(f"string_times('Oh Boy!', 2) -> '{string_times('Oh Boy!', 2)}'")
    print(f"string_times('x', 4) -> '{string_times('x', 4)}'")
    print(f"string_times('', 4) -> '{string_times('', 4)}'")
    print(f"string_times('code', 2) -> '{string_times('code', 2)}'")
    print(f"string_times('code', 3) -> '{string_times('code', 3)}'")
    HelperMethods.printMethod("front_times")
    print(f"front_times('Chocolate', 2) -> '{front_times('Chocolate', 2)}'")
    print(f"front_times('Chocolate', 3) -> '{front_times('Chocolate', 3)}'")
    print(f"front_times('Abc', 3) -> '{front_times('Abc', 3)}'")
    print(f"front_times('Ab', 4) -> '{front_times('Ab', 4)}'")
    print(f"front_times('A', 4) -> '{front_times('A', 4)}'")
    print(f"front_times('', 4) -> '{front_times('', 4)}'")
    print(f"front_times('Abc', 0) -> '{front_times('Abc', 0)}'")
    HelperMethods.printMethod("string_bits")
    print(f"string_bits('Hello') -> '{string_bits('Hello')}'")
    print(f"string_bits('Hi') -> '{string_bits('Hi')}'")
    print(f"string_bits('Heeololeo') -> '{string_bits('Heeololeo')}'")
    print(f"string_bits('HiHiHi') -> '{string_bits('HiHiHi')}'")
    print(f"string_bits('') -> '{string_bits('')}'")
    print(f"string_bits('Greetings') -> '{string_bits('Greetings')}'")
    print(f"string_bits('Chocoate') -> '{string_bits('Chocoate')}'")
    print(f"string_bits('pi') -> '{string_bits('pi')}'")
    print(f"string_bits('Hello Kitten') -> '{string_bits('Hello Kitten')}'")
    print(f"string_bits('hxaxpxpxy') -> '{string_bits('hxaxpxpxy')}'")
    HelperMethods.printMethod("string_splosion")
    print(f"string_splosion('Code') -> '{string_splosion('Code')}'")
    print(f"string_splosion('abc') -> '{string_splosion('abc')}'")
    print(f"string_splosion('ab') -> '{string_splosion('ab')}'")
    print(f"string_splosion('x') -> '{string_splosion('x')}'")
    print(f"string_splosion('fade') -> '{string_splosion('fade')}'")
    print(f"string_splosion('There') -> '{string_splosion('There')}'")
    print(f"string_splosion('Kitten') -> '{string_splosion('Kitten')}'")
    print(f"string_splosion('Bye') -> '{string_splosion('Bye')}'")
    print(f"string_splosion('Good') -> '{string_splosion('Good')}'")
    print(f"string_splosion('Bad') -> '{string_splosion('Bad')}'")
    HelperMethods.printMethod("last2")
    print(f"last2('hixxhi') -> {last2('hixxhi')}")
    print(f"last2('xaxxaxaxx') -> {last2('xaxxaxaxx')}")
    print(f"last2('axxxaaxx') -> {last2('axxxaaxx')}")
    print(f"last2('xxaxxaxxaxx') -> {last2('xxaxxaxxaxx')}")
    print(f"last2('xaxaxaxx') -> {last2('xaxaxaxx')}")
    print(f"last2('xxxx') -> {last2('xxxx')}")
    print(f"last2('13121312') -> {last2('13121312')}")
    print(f"last2('11212') -> {last2('11212')}")
    print(f"last2('13121311') -> {last2('13121311')}")
    print(f"last2('1717171') -> {last2('1717171')}")
    print(f"last2('hi') -> {last2('hi')}")
    print(f"last2('h') -> {last2('h')}")
    print(f"last2('') -> {last2('')}")
    HelperMethods.printMethod("array_count9")
    print(f"array_count9([1, 2, 9]) -> {array_count9([1, 2, 9])}")
    print(f"array_count9([1, 9, 9]) -> {array_count9([1, 9, 9])}")
    print(f"array_count9([1, 9, 9, 3, 9]) -> {array_count9([1, 9, 9, 3, 9])}")
    print(f"array_count9([1, 2, 3]) -> {array_count9([1, 2, 3])}")
    print(f"array_count9([]) -> {array_count9([])}")
    print(f"array_count9([4, 2, 4, 3, 1]) -> {array_count9([4, 2, 4, 3, 1])}")
    print(f"array_count9([9, 2, 4, 3, 1]) -> {array_count9([9, 2, 4, 3, 1])}")
    HelperMethods.printMethod("array_front9")
    print(f"array_front9([1, 2, 9, 3, 4]) -> {array_front9([1, 2, 9, 3, 4])}")
    print(f"array_front9([1, 2, 3, 4, 9]) -> {array_front9([1, 2, 3, 4, 9])}")
    print(f"array_front9([1, 2, 3, 4, 5]) -> {array_front9([1, 2, 3, 4, 5])}")
    print(f"array_front9([9, 2, 3]) -> {array_front9([9, 2, 3])}")
    print(f"array_front9([1, 9, 9]) -> {array_front9([1, 9, 9])}")
    print(f"array_front9([1, 2, 3]) -> {array_front9([1, 2, 3])}")
    print(f"array_front9([1, 9]) -> {array_front9([1, 9])}")
    print(f"array_front9([5, 5]) -> {array_front9([5, 5])}")
    print(f"array_front9([2]) -> {array_front9([2])}")
    print(f"array_front9([9]) -> {array_front9([9])}")
    print(f"array_front9([]) -> {array_front9([])}")
    print(f"array_front9([3, 9, 2, 3, 3]) -> {array_front9([3, 9, 2, 3, 3])}")
    HelperMethods.printMethod("array123")
    print(f"array123([1, 1, 2, 3, 4]) -> {array123([1, 1, 2, 3, 4])}")
    print(f"array123([1, 1, 2, 4, 1]) -> {array123([1, 1, 2, 4, 1])}")
    print(f"array123([1, 1, 2, 1, 2, 3]) -> {array123([1, 1, 2, 1, 2, 3])}")
    print(f"array123([1, 1, 2, 1, 2, 1]) -> {array123([1, 1, 2, 1, 2, 1])}")
    print(f"array123([1, 2, 3, 1, 2, 3]) -> {array123([1, 2, 3, 1, 2, 3])}")
    print(f"array123([1, 2, 3]) -> {array123([1, 2, 3])}")
    print(f"array123([1, 1, 1]) -> {array123([1, 1, 1])}")
    print(f"array123([1, 2]) -> {array123([1, 2])}")
    print(f"array123([1]) -> {array123([1])}")
    print(f"array123([]) -> {array123([])}")
    HelperMethods.printMethod("string_match")
    print(f"string_match('xxcaazz', 'xxbaaz') -> {string_match('xxcaazz', 'xxbaaz')}")
    print(f"string_match('abc', 'abc') -> {string_match('abc', 'abc')}")
    print(f"string_match('abc', 'axc') -> {string_match('abc', 'axc')}")
    print(f"string_match('hello', 'he') -> {string_match('hello', 'he')}")
    print(f"string_match('he', 'hello') -> {string_match('he', 'hello')}")
    print(f"string_match('h', 'hello') -> {string_match('h', 'hello')}")
    print(f"string_match('', 'hello') -> {string_match('', 'hello')}")
    print(f"string_match('aabbccdd', 'abbbxxd') -> {string_match('aabbccdd', 'abbbxxd')}")
    print(f"string_match('aaxxaaxx', 'iaxxai') -> {string_match('aaxxaaxx', 'iaxxai')}")
    print(f"string_match('iaxxai', 'aaxxaaxx') -> {string_match('iaxxai', 'aaxxaaxx')}")

if __name__ == "__main__":
    main()
