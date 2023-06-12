#Q21. Write a python program to identify and extract numerical chunks from a text file and
# convert them into words; e.g.; 1992  “nineteen hundred and ninety two”.

import re

def number_to_words(number):
    # Define word representations for single-digit numbers
    single_digits = [
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    ]
    
    # Define word representations for two-digit numbers
    two_digits = [
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    ]
    
    # Define word representations for tens multiples
    tens_multiples = [
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    ]
    
    # Define word representations for power of ten
    power_of_ten = [
        "", "thousand", "million", "billion", "trillion",
        "quadrillion", "quintillion", "sextillion", "septillion", "octillion"
    ]
    
    # Convert a three-digit number to words
    def convert_three_digits(num):
        words = ""
        
        # Extract hundreds digit
        if num >= 100:
            words += single_digits[num // 100] + " hundred"
            num %= 100
        
        # Extract tens and ones digits
        if num >= 20:
            words += " " + tens_multiples[num // 10]
            if num % 10:
                words += " " + single_digits[num % 10]
        elif num >= 10:
            words += " " + two_digits[num - 10]
        elif num > 0:
            words += " " + single_digits[num]
        
        return words.strip()
    
    # Handle zero separately
    if number == 0:
        return single_digits[0]
    
    # Convert the number to words
    words = ""
    chunk_index = 0
    
    # Process the number in chunks of three digits
    while number > 0:
        chunk = number % 1000
        
        if chunk != 0:
            chunk_words = convert_three_digits(chunk)
            words = chunk_words + " " + power_of_ten[chunk_index] + " " + words
        
        number //= 1000
        chunk_index += 1
    
    return words.strip()


def extract_numerical_chunks(file_path):
    # Read the content of the file
    with open(file_path, 'r') as file:
        content = file.read()
    
    # Find all numeric patterns using regular expression
    pattern = r"\d+"
    numeric_chunks = re.findall(pattern, content)
    
    # Convert each numeric chunk to words
    converted_chunks = [number_to_words(int(chunk)) for chunk in numeric_chunks]
    
    return converted_chunks


# Example usage
file_path = 'input.txt'  # Replace with the path to your input file
result = extract_numerical_chunks(file_path)
for chunk in result:
    print(chunk)
