#Q1. Write a prime generator program using only primes and using python loops.

def is_prime(num):  # Function to check if a number is prime
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

primes=[]

def prime_generator(start, end): #Function to generate prime numbers in a given range
    num = start
    while num<end:
        if is_prime(num):
            primes.append(num) 
        num += 1
    return primes

#Get the starting and ending numbers of the range from the user
start = int(input("Enter the starting number of the range to generate: "))
end = int(input("Enter the ending number of the range to generate: "))

#Check if the range is valid, if valid then generate prime numbers.
if(start<0 or end<0):
    print(" Enter valid range!!!! ")
else:
    prime_list= prime_generator(start , end)
    print(f" Prime numbers in between {start} ans {end}:---->")
    print(prime_list)