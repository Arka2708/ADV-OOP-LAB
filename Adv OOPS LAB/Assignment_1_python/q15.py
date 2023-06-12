#Q15. Make a list of the largest or smallest N items in a collection.
import heapq

def find_largest_items(collection, N): #   Find and return the N largest items in the collection.
    largest_items = heapq.nlargest(N, collection)
    return largest_items

def find_smallest_items(collection, N): #  Find and return the N smallest items in the collection.
    smallest_items = heapq.nsmallest(N, collection)
    return smallest_items

# Example usage
numbers = [9, 3, 7, 1, 5, 8, 2, 6, 4]
N = 3

# Find the N largest items
largest_items = find_largest_items(numbers, N)
print("Largest items:", largest_items)

# Find the N smallest items
smallest_items = find_smallest_items(numbers, N)
print("Smallest items:", smallest_items)
