import HelperMethods

def welcome():
    print("\n\nLogic-1 Functions\n")

"""
When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return True if the party with the given values is successful, or False otherwise.

cigar_party(30, False) → False
cigar_party(50, False) → True
cigar_party(70, True) → True
"""
def cigar_party(cigars, is_weekend):
    pass

"""
You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

date_fashion(5, 10) → 2
date_fashion(5, 2) → 0
date_fashion(5, 5) → 1
"""
def date_fashion(you, date):
    pass

"""
The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean is_summer, return True if the squirrels play and False otherwise.

squirrel_play(70, False) → True
squirrel_play(95, False) → False
squirrel_play(95, True) → True
"""
def squirrel_play(temp, is_summer):
    pass

"""
You are driving a little too fast, and a police officer stops you. Write code to compute the result, 
encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
If speed is 81 or more, the result is 2. 
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

caught_speeding(60, False) → 0
caught_speeding(65, False) → 1
caught_speeding(65, True) → 0
"""
def caught_speeding(speed, is_birthday):
    pass

"""
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

sorta_sum(3, 4) → 7
sorta_sum(9, 4) → 20
sorta_sum(10, 11) → 21
"""
def sorta_sum(a, b):
    pass

"""
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, 
return a string of the form "7:00" indicating when the alarm clock should ring. 
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

alarm_clock(1, False) → '7:00'
alarm_clock(5, False) → '7:00'
alarm_clock(0, False) → '10:00'
"""
def alarm_clock(day, vacation):
    pass

"""
The number 6 is a truly great number. Given two int values, a and b, return True if either one is 6. 
Or if their sum or difference is 6. Note: the function abs(num) computes the absolute value of a number.

love6(6, 4) → True
love6(4, 5) → False
love6(1, 5) → True
"""
def love6(a, b):
    pass

"""
Given a number n, return True if n is in the range 1..10, inclusive. 
Unless outside_mode is True, in which case return True if the number is less or equal to 1, or greater or equal to 10.

in1to10(5, False) → True
in1to10(11, False) → False
in1to10(11, True) → True
"""
def in1to10(n ,outside_mode):
    pass

"""
Given a non-negative number "num", return True if num is within 2 of a multiple of 10. 
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
"""
def near_ten(num):
    pass

def main():
    welcome()
    HelperMethods.callTimes = 0
    HelperMethods.printMethod("cigar_party")
    print(f"cigar_party(30, False) -> {cigar_party(30, False)}")
    print(f"cigar_party(50, False) -> {cigar_party(50, False)}")
    print(f"cigar_party(70, True) -> {cigar_party(70, True)}")
    print(f"cigar_party(30, True) -> {cigar_party(30, True)}")
    print(f"cigar_party(50, True) -> {cigar_party(50, True)}")
    print(f"cigar_party(60, False) -> {cigar_party(60, False)}")
    print(f"cigar_party(61, False) -> {cigar_party(61, False)}")
    print(f"cigar_party(40, False) -> {cigar_party(40, False)}")
    print(f"cigar_party(39, False) -> {cigar_party(39, False)}")
    print(f"cigar_party(40, True) -> {cigar_party(40, True)}")
    print(f"cigar_party(39, True) -> {cigar_party(39, True)}")
    HelperMethods.printMethod("date_fashion")
    print(f"date_fashion(5, 10) -> {date_fashion(5, 10)}")
    print(f"date_fashion(5, 2) -> {date_fashion(5, 2)}")
    print(f"date_fashion(5, 5) -> {date_fashion(5, 5)}")
    print(f"date_fashion(3, 3) -> {date_fashion(3, 3)}")
    print(f"date_fashion(10, 2) -> {date_fashion(10, 2)}")
    print(f"date_fashion(2, 9) -> {date_fashion(2, 9)}")
    print(f"date_fashion(9, 9) -> {date_fashion(9, 9)}")
    print(f"date_fashion(10, 5) -> {date_fashion(10, 5)}")
    print(f"date_fashion(2, 2) -> {date_fashion(2, 2)}")
    print(f"date_fashion(3, 7) -> {date_fashion(3, 7)}")
    print(f"date_fashion(2, 7) -> {date_fashion(2, 7)}")
    print(f"date_fashion(6, 2) -> {date_fashion(6, 2)}")
    HelperMethods.printMethod("squirrel_play")
    print(f"squirrel_play(70, False) -> {squirrel_play(70, False)}")
    print(f"squirrel_play(95, False) -> {squirrel_play(95, False)}")
    print(f"squirrel_play(95, True) -> {squirrel_play(95, True)}")
    print(f"squirrel_play(90, False) -> {squirrel_play(90, False)}")
    print(f"squirrel_play(90, True) -> {squirrel_play(90, True)}")
    print(f"squirrel_play(50, False) -> {squirrel_play(50, False)}")
    print(f"squirrel_play(50, True) -> {squirrel_play(50, True)}")
    print(f"squirrel_play(100, False) -> {squirrel_play(100, False)}")
    print(f"squirrel_play(100, True) -> {squirrel_play(100, True)}")
    print(f"squirrel_play(105, True) -> {squirrel_play(105, True)}")
    print(f"squirrel_play(59, False) -> {squirrel_play(59, False)}")
    print(f"squirrel_play(59, True) -> {squirrel_play(59, True)}")
    print(f"squirrel_play(60, False) -> {squirrel_play(60, False)}")
    HelperMethods.printMethod("caught_speeding")
    print(f"caught_speeding(60, False) -> {caught_speeding(60, False)}")
    print(f"caught_speeding(65, False) -> {caught_speeding(65, False)}")
    print(f"caught_speeding(80, False) -> {caught_speeding(80, False)}")
    print(f"caught_speeding(85, False) -> {caught_speeding(85, False)}")
    print(f"caught_speeding(85, True) -> {caught_speeding(85, True)}")
    print(f"caught_speeding(70, False) -> {caught_speeding(70, False)}")
    print(f"caught_speeding(75, False) -> {caught_speeding(75, False)}")
    print(f"caught_speeding(75, True) -> {caught_speeding(75, True)}")
    print(f"caught_speeding(40, False) -> {caught_speeding(40, False)}")
    print(f"caught_speeding(40, True) -> {caught_speeding(40, True)}")
    print(f"caught_speeding(90, False) -> {caught_speeding(90, False)}")    
    HelperMethods.printMethod("sorta_sum")
    print(f"sorta_sum(3, 4) -> {sorta_sum(3, 4)}")
    print(f"sorta_sum(9, 4) -> {sorta_sum(9, 4)}")
    print(f"sorta_sum(10, 11) -> {sorta_sum(10, 11)}")
    print(f"sorta_sum(12, -3) -> {sorta_sum(12, -3)}")
    print(f"sorta_sum(-3, 12) -> {sorta_sum(-3, 12)}")
    print(f"sorta_sum(4, 5) -> {sorta_sum(4, 5)}")
    print(f"sorta_sum(4, 6) -> {sorta_sum(4, 6)}")
    print(f"sorta_sum(14, 7) -> {sorta_sum(14, 7)}")
    print(f"sorta_sum(14, 6) -> {sorta_sum(14, 6)}")
    HelperMethods.printMethod("alarm_clock")
    print(f"alarm_clock(1, False) -> '{alarm_clock(1, False)}'")
    print(f"alarm_clock(5, False) -> '{alarm_clock(5, False)}'")
    print(f"alarm_clock(0, False) -> '{alarm_clock(0, False)}'")
    print(f"alarm_clock(6, False) -> '{alarm_clock(6, False)}'")
    print(f"alarm_clock(0, True) -> '{alarm_clock(0, True)}'")
    print(f"alarm_clock(6, True) -> '{alarm_clock(6, True)}'")
    print(f"alarm_clock(1, True) -> '{alarm_clock(1, True)}'")
    print(f"alarm_clock(3, True) -> '{alarm_clock(3, True)}'")
    print(f"alarm_clock(5, True) -> '{alarm_clock(5, True)}'")
    HelperMethods.printMethod("love6")
    print(f"love6(6, 4) -> {love6(6, 4)}")
    print(f"love6(4, 5) -> {love6(4, 5)}")
    print(f"love6(1, 5) -> {love6(1, 5)}")
    print(f"love6(1, 6) -> {love6(1, 6)}")
    print(f"love6(1, 8) -> {love6(1, 8)}")
    print(f"love6(1, 7) -> {love6(1, 7)}")
    print(f"love6(7, 5) -> {love6(7, 5)}")
    print(f"love6(8, 2) -> {love6(8, 2)}")
    print(f"love6(6, 6) -> {love6(6, 6)}")
    print(f"love6(-6, 2) -> {love6(-6, 2)}")
    print(f"love6(-4, -10) -> {love6(-4, -10)}")
    print(f"love6(-7, 1) -> {love6(-7, 1)}")
    print(f"love6(7, -1) -> {love6(7, -1)}")
    print(f"love6(-6, 12) -> {love6(-6, 12)}")
    print(f"love6(-2, -4) -> {love6(-2, -4)}")
    print(f"love6(7, 1) -> {love6(7, 1)}")
    print(f"love6(0, 9) -> {love6(0, 9)}")
    print(f"love6(8, 3) -> {love6(8, 3)}")
    print(f"love6(3, 3) -> {love6(3, 3)}")
    print(f"love6(3, 4) -> {love6(3, 4)}")
    HelperMethods.printMethod("in1to10")
    print(f"in1to10(5, False) -> {in1to10(5, False)}")
    print(f"in1to10(11, False) -> {in1to10(11, False)}")
    print(f"in1to10(11, True) -> {in1to10(11, True)}")
    print(f"in1to10(10, False) -> {in1to10(10, False)}")
    print(f"in1to10(10, True) -> {in1to10(10, True)}")
    print(f"in1to10(9, False) -> {in1to10(9, False)}")
    print(f"in1to10(9, True) -> {in1to10(9, True)}")
    print(f"in1to10(1, False) -> {in1to10(1, False)}")
    print(f"in1to10(1, True) -> {in1to10(1, True)}")
    print(f"in1to10(0, False) -> {in1to10(0, False)}")
    print(f"in1to10(0, True) -> {in1to10(0, True)}")
    print(f"in1to10(-1, False) -> {in1to10(-1, False)}")
    print(f"in1to10(-1, True) -> {in1to10(-1, True)}")
    print(f"in1to10(99, False) -> {in1to10(99, False)}")
    print(f"in1to10(-99, True) -> {in1to10(-99, True)}")
    HelperMethods.printMethod("near_ten")
    print(f"near_ten(12) -> {near_ten(12)}")
    print(f"near_ten(17) -> {near_ten(17)}")
    print(f"near_ten(19) -> {near_ten(19)}")
    print(f"near_ten(31) -> {near_ten(31)}")
    print(f"near_ten(6) -> {near_ten(6)}")
    print(f"near_ten(10) -> {near_ten(10)}")
    print(f"near_ten(11) -> {near_ten(11)}")
    print(f"near_ten(21) -> {near_ten(21)}")
    print(f"near_ten(22) -> {near_ten(22)}")
    print(f"near_ten(23) -> {near_ten(23)}")
    print(f"near_ten(54) -> {near_ten(54)}")
    print(f"near_ten(155) -> {near_ten(155)}")
    print(f"near_ten(158) -> {near_ten(158)}")
    print(f"near_ten(3) -> {near_ten(3)}")
    print(f"near_ten(1) -> {near_ten(1)}")

if __name__ == "__main__":
    main()