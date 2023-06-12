# Q10. Write a code which yields all terms of the geometric progression a, aq, aq2 , aq3, ....
#When the progression produces a term that is greater than 100,000, the generator stops (with
#a return statement). Compute total time and time within the loop.

import time

start_time = time.time()  # Start time of the program
# Generate terms of a geometric progression until a term greater than 100,000 is reached.

def geometric_progression(a, q):
    term_count = 0
    term = a

    while term <= 100000:
        yield term
        term *= q
        term_count += 1

# Example usage
a = int(input("Enter the first term of the GP: "))
q = int(input("Enter the common ratio of the GP: "))

# Generate and print terms of the geometric progression
loop_start_time = time.time()  # Start time within the loop
for term in geometric_progression(a, q):
    print(term)
loop_end_time = time.time()  # End time within the loop

end_time = time.time()  # End time of the program

total_time = end_time - start_time
loop_time = loop_end_time - loop_start_time

print(f"Total time: {total_time:.6f} seconds")
print(f"Time within the loop: {loop_time:.6f} seconds")