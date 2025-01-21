from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")
    footer_copyright_element = driver.find_element(By.ID, "admin_options")
    
    # Get the copyright text
    copyright_text = footer_copyright_element.text
    
    # Print the copyright text to the console
    print("Copyright Text:", copyright_text)
    driver.quit()