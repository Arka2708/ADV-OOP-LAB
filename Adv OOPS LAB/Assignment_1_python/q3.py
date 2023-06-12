#Q3. Print first 10 odd and even numbers using iterators and compress. You can use duck typing.

def get_numbers(get_next, count):
    for num in get_next():
        yield num
        count -= 1
        if count == 0:
            break

def odd_numbers():
    num = 1
    while True:
        yield num
        num += 2

def even_numbers():
    num = 2
    while True:
        yield num
        num += 2

# Get the first 10 odd numbers
odd_iter = get_numbers(odd_numbers, 10)
odd_list = list(odd_iter)
print("First 10 odd numbers:", odd_list)

# Get the first 10 even numbers
even_iter = get_numbers(even_numbers, 10)
even_list = list(even_iter)
print("First 10 even numbers:", even_list)