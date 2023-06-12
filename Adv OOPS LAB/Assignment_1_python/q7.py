#Q7. Write a function findfiles that recursively descends the directory tree for the specified
# directory and generates paths of all the files in the tree.

import os

# Recursively descends the directory tree for the specified directory
# and generates paths of all the files in the tree.
def findfiles(directory):
    for root, dirs, files in os.walk(directory):
        for file in files:
            yield os.path.join(root, file)


# Get the directory path from the user
directory = input("Enter the directory path: ")

# Create a generator object to iterate over the file paths
file_generator = findfiles(directory)

# Iterate over the file paths and print them
for file_path in file_generator:
    print(file_path)