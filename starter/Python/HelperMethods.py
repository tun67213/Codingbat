
class HelperMethods:
    __callTimes = 0
    
    @classmethod
    def resetCallTimes(cls):
        cls.__callTimes = 0
    
    @classmethod
    def printMethod(cls, methodName: str):
        if cls.__callTimes > 0:
            print("\n\nMethod Name: " + methodName + "()\n")
        else:
            print("Method Name: " + methodName + "()\n")
        cls.__callTimes += 1

