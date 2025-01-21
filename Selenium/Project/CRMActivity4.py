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
    driver.quit()
    