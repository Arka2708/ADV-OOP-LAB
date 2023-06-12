# Q9. Enumerate the sequence of all lowercase ASCII letters, starting from 1, using enumerate.

# Enumerate the sequence of lowercase ASCII letters starting from 1
lowercase_letters = [chr(i) for i in range(ord('a'), ord('z')+1)]
enumerated_letters = list(enumerate(lowercase_letters, start=1))

# Print the enumerated letters
for index, letter in enumerated_letters:
    print(index, letter)