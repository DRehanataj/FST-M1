# Creating a dictionary of fruits and their prices
fruit_prices = {
    "apple": 100,
    "banana": 50,
    "cherry": 250,
    "date": 30,
    "grape": 180,
    "kiwi": 200
}

# Asking the user for a fruit name
fruit_to_check = input("Enter the name of the fruit you want to check: ").lower()

# Checking if the fruit is available in the dictionary
if fruit_to_check in fruit_prices:
    print(f"{fruit_to_check.capitalize()} is available and costs {fruit_prices[fruit_to_check]:.2f}.")
else:
    print(f"{fruit_to_check.capitalize()} is not available.")
