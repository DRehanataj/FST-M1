def calculateSum(num):
    # Base case: if num is 0, return 0
    if num:
        # Recursive call: num + calculateSum(num - 1)
        return num + calculateSum(num - 1)
    else:
        return 0  # Base case: when num reaches 0, return 0

# Calling the calculateSum function with 10
res = calculateSum(11)

# Printing the result
print(res)
