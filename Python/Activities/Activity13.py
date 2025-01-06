# Defining the custom function to calculate sum
def calculateSum(numbers):
    # Initialize sum to 0
    total_sum = 0
    
    # Iterate through the list and add each number to total_sum
    for number in numbers:
        total_sum += number
        
    # Return the final sum
    return total_sum

# Define the list of numbers
numList = [10, 40, 60, 90]

# Call the calculateSum function with numList as the argument
result = calculateSum(numList)

# Print the result with a message
print("The sum of all the elements is: " + str(result))
