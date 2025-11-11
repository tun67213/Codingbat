
import HelperMethods

def welcome():
    print("\n\nLogic-1 Functions\n")
    
"""
Given a string, return a string where for every char in the original, there are two chars.

double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree'
"""
def double_char(str):
    pass

"""
Return the number of times that the string "hi" appears anywhere in the given string.

count_hi('abc hi ho') → 1
count_hi('ABChi hi') → 2
count_hi('hihi') → 2
"""
def count_hi(str):
    pass

"""
Return True if the string "cat" and "dog" appear the same number of times in the given string.

cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True
"""
def cat_dog(str):
    pass

"""
Return the number of times that the string "code" appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

count_code('aaacodebbb') → 1
count_code('codexxcode') → 2
count_code('cozexxcope') → 2
"""
def count_code(str):
    pass

"""
Given two strings, return True if either of the strings appears at the very end of the other string, ignoring upper/lower case 
differences (in other words, the computation should not be "case sensitive"). 
Note: s.lower() returns the lowercase version of a string.

end_other('Hiabc', 'abc') → True
end_other('AbC', 'HiaBc') → True
end_other('abc', 'abXabc') → True
"""
def end_other(a, b):
    pass

"""
Return True if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyz_there('abcxyz') → True
xyz_there('abc.xyz') → False
xyz_there('xyz.abc') → True
"""
def xyz_there(str):
    pass

if __name__ == "__main__":
    welcome()
    HelperMethods.callTimes = 0
    HelperMethods.printMethod("double_char")
    print(f"double_char('The') -> '{double_char('The')}'")
    print(f"double_char('AAbb') -> '{double_char('AAbb')}'")
    print(f"double_char('Hi-There') -> '{double_char('Hi-There')}'")
    print(f"double_char('Word!') -> '{double_char('Word!')}'")
    print(f"double_char('!!') -> '{double_char('!!')}'")
    print(f"double_char('') -> '{double_char('')}'")
    print(f"double_char('a') -> '{double_char('a')}'")
    print(f"double_char('.') -> '{double_char('.')}'")
    print(f"double_char('aa') -> '{double_char('aa')}'")
    HelperMethods.printMethod("count_hi")
    print(f"count_hi('abc hi ho') -> {count_hi('abc hi ho')}")
    print(f"count_hi('ABChi hi') -> {count_hi('ABChi hi')}")
    print(f"count_hi('hihi') -> {count_hi('hihi')}")
    print(f"count_hi('hiHIhi') -> {count_hi('hiHIhi')}")
    print(f"count_hi('') -> {count_hi('')}")
    print(f"count_hi('h') -> {count_hi('h')}")
    print(f"count_hi('hi') -> {count_hi('hi')}")
    print(f"count_hi('Hi is no HI on ahI') -> {count_hi('Hi is no HI on ahI')}")
    print(f"count_hi('hiho not HOHIhi') -> {count_hi('hiho not HOHIhi')}")
    HelperMethods.printMethod("cat_dog")
    print(f"cat_dog('catdog') -> {cat_dog('catdog')}")
    print(f"cat_dog('catcat') -> {cat_dog('catcat')}")
    print(f"cat_dog('1cat1cadodog') -> {cat_dog('1cat1cadodog')}")
    print(f"cat_dog('catxxdogxxxdog') -> {cat_dog('catxxdogxxxdog')}")
    print(f"cat_dog('catxdogxdogxcat') -> {cat_dog('catxdogxdogxcat')}")
    print(f"cat_dog('catxdogxdogxca') -> {cat_dog('catxdogxdogxca')}")
    print(f"cat_dog('dogdogcat') -> {cat_dog('dogdogcat')}")
    print(f"cat_dog('dogogcat') -> {cat_dog('dogogcat')}")
    print(f"cat_dog('dog') -> {cat_dog('dog')}")
    print(f"cat_dog('cat') -> {cat_dog('cat')}")
    print(f"cat_dog('ca') -> {cat_dog('ca')}")
    print(f"cat_dog('c') -> {cat_dog('c')}")
    print(f"cat_dog('') -> {cat_dog('')}")
    HelperMethods.printMethod("count_code")
    print(f"count_code('aaacodebbb') -> {count_code('aaacodebbb')}")
    print(f"count_code('codexxcode') -> {count_code('codexxcode')}")
    print(f"count_code('cozexxcope') -> {count_code('cozexxcope')}")
    print(f"count_code('cozfxxcope') -> {count_code('cozfxxcope')}")
    print(f"count_code('xxcozeyycop') -> {count_code('xxcozeyycop')}")
    print(f"count_code('cozcop') -> {count_code('cozcop')}")
    print(f"count_code('abcxyz') -> {count_code('abcxyz')}")
    print(f"count_code('code') -> {count_code('code')}")
    print(f"count_code('ode') -> {count_code('ode')}")
    print(f"count_code('c') -> {count_code('c')}")
    print(f"count_code('') -> {count_code('')}")
    print(f"count_code('AAcodeBBcoleCCccoreDD') -> {count_code('AAcodeBBcoleCCccoreDD')}")
    print(f"count_code('AAcodeBBcoleCCccorfDD') -> {count_code('AAcodeBBcoleCCccorfDD')}")
    print(f"count_code('coAcodeBcoleccoreDD') -> {count_code('coAcodeBcoleccoreDD')}")
    HelperMethods.printMethod("end_other")
    print(f"end_other('Hiabc', 'abc') -> {end_other('Hiabc', 'abc')}")
    print(f"end_other('AbC', 'HiaBc') -> {end_other('AbC', 'HiaBc')}")
    print(f"end_other('abc', 'abXabc') -> {end_other('abc', 'abXabc')}")
    print(f"end_other('Hiabc', 'abcd') -> {end_other('Hiabc', 'abcd')}")
    print(f"end_other('Hiabc', 'bc') -> {end_other('Hiabc', 'bc')}")
    print(f"end_other('Hiabcx', 'bc') -> {end_other('Hiabcx', 'bc')}")
    print(f"end_other('abc', 'abc') -> {end_other('abc', 'abc')}")
    print(f"end_other('xyz', '12xyz') -> {end_other('xyz', '12xyz')}")
    print(f"end_other('yz', '12xz') -> {end_other('yz', '12xz')}")
    print(f"end_other('Z', '12xz') -> {end_other('Z', '12xz')}")
    print(f"end_other('12', '12') -> {end_other('12', '12')}")
    print(f"end_other('abcXYZ', 'abcDEF') -> {end_other('abcXYZ', 'abcDEF')}")
    print(f"end_other('ab', 'ab12') -> {end_other('ab', 'ab12')}")
    print(f"end_other('ab', '12ab') -> {end_other('ab', '12ab')}")
    HelperMethods.printMethod('xyz_there')
    print(f"xyz_there('abcxyz') -> {xyz_there('abcxyz')}")
    print(f"xyz_there('abc.xyz') -> {xyz_there('abc.xyz')}")
    print(f"xyz_there('xyz.abc') -> {xyz_there('xyz.abc')}")
    print(f"xyz_there('abcxy') -> {xyz_there('abcxy')}")
    print(f"xyz_there('xyz') -> {xyz_there('xyz')}")
    print(f"xyz_there('xy') -> {xyz_there('xy')}")
    print(f"xyz_there('x') -> {xyz_there('x')}")
    print(f"xyz_there('') -> {xyz_there('')}")
    print(f"xyz_there('abc.xyzxyz') -> {xyz_there('abc.xyzxyz')}")
    print(f"xyz_there('abc.xxyz') -> {xyz_there('abc.xxyz')}")
    print(f"xyz_there('.xyz') -> {xyz_there('.xyz')}")
    print(f"xyz_there('12.xyz') -> {xyz_there('12.xyz')}")
    print(f"xyz_there('12xyz') -> {xyz_there('12xyz')}")
    print(f"xyz_there('1.xyz.xyz2.xyz') -> {xyz_there('1.xyz.xyz2.xyz')}")