from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
       # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")

    username_field = driver.find_element(By.ID, "user_name")  # Replace with actual ID if different
    password_field = driver.find_element(By.ID, "username_password")  # Replace with actual ID if different
    
    # Step d: Enter login credentials into the respective fields
    username_field.send_keys("admin")
    password_field.send_keys("pa$$w0rd")
    
    # Step e: Find and click the login button
    login_button = driver.find_element(By.ID, "bigbutton")
    login_button.click()
    
    driver.implicitly_wait(5)  # Wait for the page to load

    # Step 3: Get the color of the navigation menu
    nav_menu = driver.find_element(By.ID, "toolbar")  
    nav_color = nav_menu.value_of_css_property("background-color")  # Get the background color

    # Step 4: Print the color to the console
    print("Navigation Menu Background Color:", nav_color)
    driver.quit()