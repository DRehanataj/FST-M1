# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")

    header_image_element = driver.find_element (By.XPATH,"//img[@alt='SuiteCRM']")
    
    # Get the URL of the header image
    header_image_url = header_image_element.get_dom_attribute("src")
    
    # Print the URL of the header image
    print("Header Image URL:", header_image_url)
    
    driver.quit()