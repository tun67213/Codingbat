
class UI_Functions:
    call_count = 0

    @classmethod
    def reset_callCount(cls):
        cls.call_count = 0

    @classmethod
    def print_function(cls, functionName):
        if cls.call_count == 0:
            print("\n\n")
        print("Function Name: " + functionName + "()\n")
        cls.call_count += 1
