callTimes = 0
def printMethod(methodName):
    global callTimes
    if callTimes > 0:
        print("\nMethod Name: " + methodName + "\n")
    else:
        print("Method Name: " + methodName + "\n")
    callTimes += 1