# Taking input from the user
user_input = input("Enter a list of numbers (separated by spaces): ")

# Converting the input string into a list of integers
num_list = [int(i) for i in user_input.split()]

# Checking if the first and last numbers are the same
if num_list[0] == num_list[-1]:
    print(True)
else:
    print(False)
