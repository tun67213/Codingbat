
class UI_Functions:
    call_count = 0

    @classmethod
    def reset_callCount():
        call_count = 0;

    @classmethod
    def print_function(functionName):
        if call_count == 0:
            print("\n\n")
        print("Function Name: " + functionName + "()\n")
        call_count += 1