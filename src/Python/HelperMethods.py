
class HelperMethods:
    _callTimes = 0
    
    @classmethod
    def resetCallTimes(cls):
        cls._callTimes = 0
    
    @classmethod
    def printMethod(cls, methodName: str):
        if cls._callTimes > 0:
            print("\n\nMethod Name: " + methodName + "()\n")
        else:
            print("Method Name: " + methodName + "()\n")
        cls._callTimes += 1