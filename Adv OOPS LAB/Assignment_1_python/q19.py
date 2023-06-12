# Q19. Use profile/cprofile to check pythogorian triples code in python. Think about time complexity of the code.

import cProfile
import math
def generate_pythagorean_triples(n): # Time Complexity O(n^2)
    triples = []
    for a in range(1, n):
        for b in range(a, n):
            c = math.sqrt(a**2 + b**2)
            if c.is_integer() and c <= n:
                triples.append((a, b, int(c)))
    return triples

cProfile.run('generate_pythagorean_triples(1000)')
