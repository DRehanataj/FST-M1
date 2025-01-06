# Taking input from the user
user_input = input("Enter a tuple of numbers (separated by commas): ")

# Converting the input string into a tuple of integers
num_tuple = tuple(int(i) for i in user_input.split(","))

# Iterating through the tuple and printing numbers divisible by 5
print("Numbers divisible by 5:")
for num in num_tuple:
    if num % 5 == 0:
        print(num)
