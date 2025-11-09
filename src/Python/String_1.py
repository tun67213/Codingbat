
import HelperMethods

def welcome():
    print("\n\nString-1 Functions\n")

"""
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

hello_name('Bob') → 'Hello Bob!'
hello_name('Alice') → 'Hello Alice!'
hello_name('X') → 'Hello X!'
"""
def hello_name(name):
    pass

"""
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

make_abba('Hi', 'Bye') → 'HiByeByeHi'
make_abba('Yo', 'Alice') → 'YoAliceAliceYo'
make_abba('What', 'Up') → 'WhatUpUpWhat'
"""
def make_abba(a, b):
    pass

"""
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> 
which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

make_tags('i', 'Yay') → '<i>Yay</i>'
make_tags('i', 'Hello') → '<i>Hello</i>'
make_tags('cite', 'Yay') → '<cite>Yay</cite>'
"""
def make_tags(tag, word):
    pass

"""
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, 
e.g. "<<word>>".

make_out_word('<<>>', 'Yay') → '<<Yay>>'
make_out_word('<<>>', 'WooHoo') → '<<WooHoo>>'
make_out_word('[[]]', 'word') → '[[word]]'
"""
def make_out_word(out, word):
    pass

"""
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

extra_end('Hello') → 'lololo'
extra_end('ab') → 'ababab'
extra_end('Hi') → 'HiHiHi'
"""
def extra_end(str):
    pass

"""
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

first_two('Hello') → 'He'
first_two('abcdefg') → 'ab'
first_two('ab') → 'ab'
"""
def first_two(str):
    pass

"""
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

first_half('WooHoo') → 'Woo'
first_half('HelloThere') → 'Hello'
first_half('abcdef') → 'abc'
"""
def first_half(str):
    pass

"""
Given a string, return a version without the first and last char, so "Hello" yields "ell". 
The string length will be at least 2.

without_end('Hello') → 'ell'
without_end('java') → 'av'
without_end('coding') → 'odin'
"""
def without_end(str):
    pass

"""
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

combo_string('Hello', 'hi') → 'hiHellohi'
combo_string('hi', 'Hello') → 'hiHellohi'
combo_string('aaa', 'b') → 'baaab'
"""
def combo_string(a, b):
    pass

"""
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

non_start('Hello', 'There') → 'ellohere'
non_start('java', 'code') → 'avaode'
non_start('shotl', 'java') → 'hotlava'
"""
def non_start(a, b):
    pass

"""
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2('Hello') → 'lloHe'
left2('java') → 'vaja'
left2('Hi') → 'Hi'
"""
def left2(str):
    pass

def main():
    welcome()
    HelperMethods.callTimes = 0
    HelperMethods.printMethod("hello_name")
    print(f"hello_name('Bob') -> '{hello_name('Bob')}'")
    print(f"hello_name('Alice') -> '{hello_name('Alice')}'")
    print(f"hello_name('X') -> '{hello_name('X')}'")
    print(f"hello_name('Dolly') -> '{hello_name('Dolly')}'")
    print(f"hello_name('Alpha') -> '{hello_name('Alpha')}'")
    print(f"hello_name('Omega') -> '{hello_name('Omega')}'")
    print(f"hello_name('Goodbye') -> '{hello_name('Goodbye')}'")
    print(f"hello_name('ho ho ho') -> '{hello_name('ho ho ho')}'")
    print(f"hello_name('xyz!') -> '{hello_name('xyz!')}'")
    print(f"hello_name('Hello') -> '{hello_name('Hello')}'")
    HelperMethods.printMethod("make_abba")
    print(f"make_abba('Hi', 'Bye') -> '{make_abba('Hi', 'Bye')}'")
    print(f"make_abba('Yo', 'Alice') -> '{make_abba('Yo', 'Alice')}'")
    print(f"make_abba('What', 'Up') -> '{make_abba('What', 'Up')}'")
    print(f"make_abba('aaa', 'bbb') -> '{make_abba('aaa', 'bbb')}'")
    print(f"make_abba('x', 'y') -> '{make_abba('x', 'y')}'")
    print(f"make_abba('x', '') -> '{make_abba('x', '')}'")
    print(f"make_abba('', 'y') -> '{make_abba('', 'y')}'")
    print(f"make_abba('Bo', 'Ya') -> '{make_abba('Bo', 'Ya')}'")
    print(f"make_abba('Ya', 'Ya') -> '{make_abba('Ya', 'Ya')}'")
    HelperMethods.printMethod("make_tags")
    print(f"make_tags('i', 'Yay') -> '{make_tags('i', 'Yay')}'")
    print(f"make_tags('i', 'Hello') -> '{make_tags('i', 'Hello')}'")
    print(f"make_tags('cite', 'Yay') -> '{make_tags('cite', 'Yay')}'")
    print(f"make_tags('address', 'here') -> '{make_tags('address', 'here')}'")
    print(f"make_tags('body', 'Heart') -> '{make_tags('body', 'heart')}'")
    print(f"make_tags('i', 'i') -> '{make_tags('i', 'i')}'")
    print(f"make_tags('i', '') -> '{make_tags('i', '')}'")
    HelperMethods.printMethod("make_out_word")
    print(f"make_out_word('<<>>', 'Yay') -> '{make_out_word('<<>>', 'Yay')}'")
    print(f"make_out_word('<<>>', 'WooHoo') -> '{make_out_word('<<>>', 'WooHoo')}'")
    print(f"make_out_word('[[]]', 'word') -> '{make_out_word('[[]]', 'word')}'")
    print(f"make_out_word('HHoo', 'Hello') -> '{make_out_word('HHoo', 'Hello')}'")
    print(f"make_out_word('abyz', 'YAY') -> '{make_out_word('abyz', 'YAY')}'")
    HelperMethods.printMethod("extra_end")
    print(f"extra_end('Hello') -> '{extra_end('Hello')}'")
    print(f"extra_end('ab') -> '{extra_end('ab')}'")
    print(f"extra_end('Hi') -> '{extra_end('Hi')}'")
    print(f"extra_end('Candy') -> '{extra_end('Candy')}'")
    print(f"extra_end('Code') -> '{extra_end('Code')}'")
    HelperMethods.printMethod("first_two")
    print(f"first_two('Hello') -> '{first_two('Hello')}'")
    print(f"first_two('abcdefg') -> '{first_two('abcdefg')}'")
    print(f"first_two('ab') -> '{first_two('ab')}'")
    print(f"first_two('a') -> '{first_two('a')}'")
    print(f"first_two('') -> '{first_two('')}'")
    print(f"first_two('Kitten') -> '{first_two('Kitten')}'")
    print(f"first_two('hi') -> '{first_two('hi')}'")
    print(f"first_two('hiya') -> '{first_two('hiya')}'")
    HelperMethods.printMethod("first_half")
    print(f"first_half('WooHoo') -> '{first_half('WooHoo')}'")
    print(f"first_half('HelloThere') -> '{first_half('HelloThere')}'")
    print(f"first_half('abcdef') -> '{first_half('abcdef')}'")
    print(f"first_half('ab') -> '{first_half('ab')}'")
    print(f"first_half('') -> '{first_half('')}'")
    print(f"first_half('0123456789') -> '{first_half('0123456789')}'")
    print(f"first_half('kitten') -> '{first_half('kitten')}'")
    HelperMethods.printMethod("without_end")
    print(f"without_end('Hello') -> '{without_end('Hello')}'")
    print(f"without_end('java') -> '{without_end('java')}'")
    print(f"without_end('coding') -> '{without_end('coding')}'")
    print(f"without_end('code') -> '{without_end('code')}'")
    print(f"without_end('ab') -> '{without_end('ab')}'")
    print(f"without_end('Chocolate!') -> '{without_end('Chocolate')}'")
    print(f"without_end('kitten') -> '{without_end('kitten')}'")
    print(f"without_end('woohoo') -> '{without_end('woohoo')}'")
    HelperMethods.printMethod("combo_string")
    print(f"combo_string('Hello', 'hi') -> '{combo_string('Hello', 'hi')}'")
    print(f"combo_string('hi', 'Hello') -> '{combo_string('hi', 'Hello')}'")
    print(f"combo_string('aaa', 'b') -> '{combo_string('aaa', 'b')}'")
    print(f"combo_string('b', 'aaa') -> '{combo_string('b', 'aaa')}'")
    print(f"combo_string('aaa', '') -> '{combo_string('aaa', '')}'")
    print(f"combo_string('', 'bb') -> '{combo_string('', 'bb')}'")
    print(f"combo_string('aaa', '1234') -> '{combo_string('aaa', '1234')}'")
    print(f"combo_string('aaa', 'bb') -> '{combo_string('aaa', 'bb')}'")
    print(f"combo_string('a', 'bb') -> '{combo_string('a', 'bb')}'")
    print(f"combo_string('bb', 'a') -> '{combo_string('bb', 'a')}'")
    print(f"combo_string('xyz', 'ab') -> '{combo_string('xyz', 'ab')}'")
    HelperMethods.printMethod("non-start")
    print(f"non_start('Hello', 'There') -> '{non_start('Hello', 'There')}'")
    print(f"non_start('java', 'code') -> '{non_start('java', 'code')}'")
    print(f"non_start('shotl', 'java') -> '{non_start('shotl', 'java')}'")
    print(f"non_start('ab', 'xy') -> '{non_start('ab', 'xy')}'")
    print(f"non_start('ab', 'x') -> '{non_start('ab', 'x')}'")
    print(f"non_start('x', 'ac') -> '{non_start('x', 'ac')}'")
    print(f"non_start('a', 'x') -> '{non_start('a', 'x')}'")
    print(f"non_start('kit', 'kat') -> '{non_start('kit', 'kat')}'")
    print(f"non_start('mart', 'dart') -> '{non_start('mart', 'dart')}'")
    HelperMethods.printMethod("left2")
    print(f"left2('Hello') -> '{left2('Hello')}'")
    print(f"left2('java') -> '{left2('java')}'")
    print(f"left2('Hi') -> '{left2('Hi')}'")
    print(f"left2('code') -> '{left2('code')}'")
    print(f"left2('cat') -> '{left2('cat')}'")
    print(f"left2('12345') -> '{left2('12345')}'")
    print(f"left2('Chocolate') -> '{left2('Chocolate')}'")
    print(f"left2('bricks') -> '{left2('bricks')}'")

if __name__ == "__main__":
    main()