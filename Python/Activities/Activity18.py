# Import pandas
import pandas as pd

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "charles", "deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Convert dictionary list to  a DataFrame 
dataframe = pd.DataFrame(data)
# write to the CSV file
dataframe.to_csv("F:/FST2025/FST 2025 python/inputs/creds.csv",index=False)

# Read the CSV file and store it into a DataFrame
creds = pd.read_csv("F:/FST2025/FST 2025 python/inputs/creds.csv")

# Print the full data
print(creds)


# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(creds["Usernames"])

# Print the username and password of the second row
print("===============")
print("Username: ", creds["Usernames"][1], " | ", "Password: ", creds["Passwords"][1])

#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(creds.sort_values('Usernames'))

#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(creds.sort_values('Passwords', ascending=False))