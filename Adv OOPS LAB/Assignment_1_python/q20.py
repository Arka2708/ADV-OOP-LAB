#Q20. Write a python program to
#i. read lines from a file, break into tokens and convert the tokens to unique numerical values using python dictionary.
#ii. Convert lines of different lengths into lines of same length (maximum length). Use padding if and when required.
def convert_lines(file_path):
    # Read lines from the file
    with open(file_path, 'r') as file:
        lines = file.readlines()
    
    # Create a dictionary to store token-value mappings
    token_dict = {}
    next_value = 1
    
    # Process lines and convert tokens to numerical values
    converted_lines = []
    for line in lines:
        tokens = line.strip().split()  # Break line into tokens
        converted_tokens = []
        for token in tokens:
            if token not in token_dict:
                # Assign a unique numerical value to the token
                token_dict[token] = next_value
                next_value += 1
            converted_tokens.append(str(token_dict[token]))  # Convert token to numerical value
        converted_lines.append(converted_tokens)
    
    # Determine the maximum length among all lines
    max_length = max(len(line) for line in converted_lines)
    
    # Pad lines with spaces to match the maximum length
    padded_lines = []
    for line in converted_lines:
        padded_line = line + [''] * (max_length - len(line))
        padded_lines.append(padded_line)
    
    return padded_lines


# Example usage
file_path = 'input.txt'  # Replace with the path to your input file
result = convert_lines(file_path)
for line in result:
    print(' '.join(line))
