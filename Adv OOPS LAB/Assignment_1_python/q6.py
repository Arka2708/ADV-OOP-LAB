# Q6. Write a simple program which loops over a list of user data (tuples containing a username,
#email and age) and adds each user to a directory if the user is at least 16 years old. You do
#not need to store the age. Write a simple exception hierarchy which defines a different
#exception for each of these error conditions:

# the username is not unique
# the age is not a positive integer
# the user is under 16
# the email address is not valid (a simple check for a username, the @ symbol and a
#domain name is sufficient)
 
#Raise these exceptions in your program where appropriate. Whenever an exception occurs,
#your program should move onto the next set of data in the list. Print a different error
#message for each different kind of exception.

class UsernameNotUniqueError(Exception):
    pass

class AgeNotPositiveIntegerError(Exception):
    pass

class UserUnder16Error(Exception):
    pass

class InvalidEmailError(Exception):
    pass

class User:
    def __init__(self, username, email, age):
        self.username = username
        self.email = email
        self.age = age

def add_user_to_directory(user_data):
    directory = []  # List to store valid users

    for data in user_data:
        try:
            username, email, age = data

            if not isinstance(age, int) or age <= 0:
                raise AgeNotPositiveIntegerError(f"Invalid age: {age} is not a positive integer.")

            if age < 16:
                raise UserUnder16Error(f"User {username} is under 16 years old.")

            if not email_valid(email):
                raise InvalidEmailError(f"Invalid email address: {email}.")

            if username_exists(directory, username):
                raise UsernameNotUniqueError(f"Username {username} is not unique.")

            user = User(username, email, age)
            directory.append(user)
        except UsernameNotUniqueError as e:
            print("Error:", e)  # Print error message for non-unique username
        except AgeNotPositiveIntegerError as e:
            print("Error:", e)  # Print error message for non-positive age
        except UserUnder16Error as e:
            print("Error:", e) # Print error message for users under 16 years old
        except InvalidEmailError as e:
            print("Error:", e) # Print error message for invalid email address


    return directory

def email_valid(email): #function to check validlity of email
    return '@' in email and '.' in email

def username_exists(directory, username): #function to check unique username
    for user in directory:
        if user.username == username:
            return True
    return False

# Example user data
user_data = [
    ("A", "abc@gmail.com", 20),
    ("B", "abcde@example.com", 15),
    ("C", "cab@example.com", -5),
    ("D", "dcabexample.com", 25),
    ("A", "ABC@gmail.com", 18),
    ("E", "abcdef@gmail.com", 18),
]

# Add users to the directory
directory = add_user_to_directory(user_data)

# Print the directory
print("Directory:")
for user in directory:
    print(user.username, user.email)