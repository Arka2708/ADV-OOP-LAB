# Q8. Create a list of all the numbers up to N=50 which are multiples of five using anonymous function

N = 50

# Using an anonymous function (lambda) and filter function multiples of fives are separated.
multiples_of_five = list(filter(lambda x: x % 5 == 0, range(1, N + 1)))

# Print the list
print(multiples_of_five)