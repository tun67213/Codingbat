
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
    pass

def main():
    HelperMethods.resetCallTimes()
    welcome()
    HelperMethods.printMethod("sleep_in")
    HelperMethods.printMethod("monkey_trouble")
    HelperMethods.printMethod("sum_double")
    HelperMethods.printMethod("diff21")
    HelperMethods.printMethod("parrot_trouble")
    HelperMethods.printMethod("makes10")
    HelperMethods.printMethod("near_hundred")
    HelperMethods.printMethod("pos_neg")
    HelperMethods.printMethod("not_string")
    HelperMethods.printMethod("missing_char")
    HelperMethods.printMethod("front_back")
    HelperMethods.printMethod("front3")

if __name__ == "__main__":
    main()