# Q5. Write first seven Fibinacci numbers using generator next function/ yield in python.
# Trace and memorize the function. Also check whether a user given number is Fibinacci or not.

def fibonacci_generator(): # function to generate fibonacci numbers.
    a, b = 0, 1
    yield a
    yield b

    while True:
        c = a + b
        yield c
        a, b = b, c


def is_fibonacci_number(num): # function to check if a number is a Fibonacci number or not
    fib = fibonacci_generator()  # Create a Fibonacci generator
    while True:
      x = next(fib) # Get the next Fibonacci number
      if x==num:
          return True
      if x>num:
          return False

fibonacci_iter = fibonacci_generator() # Create a generator for Fibonacci numbers
for _ in range(7):
    print(next(fibonacci_iter)) # Print the next Fibonacci number from the generator

number = int(input("Enter a number to check if it's a Fibonacci number: "))
if is_fibonacci_number(number):
    print("The number is a Fibonacci number.")
else:
    print("The number is not a Fibonacci number.")