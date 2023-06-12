# Q4. Write a regular expression to validate a phone number.

import re

def validate_phone_number(phone_number): # function to validate a phone number with a given pattern
    pattern = r'^\d{3}-\d{3}-\d{4}$'
    return re.match(pattern, phone_number) 

# Test the phone number validation
phone_number = input("Enter a phone number (in XXX-XXX-XXXX format): ")
if validate_phone_number(phone_number):
    print("Valid phone number.")
else:
    print("Invalid phone number.")