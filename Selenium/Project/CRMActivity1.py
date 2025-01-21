# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")

    # Print the title of the page
    title= driver.title
if title == "SuiteCRM":
        print("Title matches: SuiteCRM")
else:
        print(f"Title does not match. Found: {title}")
        driver.quit()