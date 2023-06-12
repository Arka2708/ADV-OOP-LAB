#Q14. Implement a priority queue that sorts items by a given priority and always returns the
# item with the highest priority on each pop operation.

import heapq

class PriorityQueue:
    def __init__(self):
        self._queue = []
        self._index = 0

    def push(self, item, priority):
        heapq.heappush(self._queue, (priority, self._index, item))
        self._index += 1

    def pop(self):
        if self._queue:
            return heapq.heappop(self._queue)[-1]
        else:
            raise IndexError("Priority queue is empty")

    def is_empty(self):
        return len(self._queue) == 0

# Example usage
queue = PriorityQueue()
queue.push("Task 1", 3)
queue.push("Task 2", 1)
queue.push("Task 3", 2)

while not queue.is_empty():
    task = queue.pop()
    print("Processing task:", task)
