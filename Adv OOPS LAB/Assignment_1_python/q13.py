#Q13. Write an operator overloading for len which shows string length for any given string
# and return only length of repetitive words with the text if the text has some repetitive parts.
# Determine the most frequently occurring words using most_common.
from collections import Counter

class TextAnalyzer:
    def __init__(self, text):
        self.text = text

    def __len__(self):
        return len(self.text)

    def get_repetitive_words(self):
        words = self.text.split()
        word_counts = Counter(words)
        repetitive_words = [word for word, count in word_counts.items() if count > 1]
        return repetitive_words

    def get_most_frequent_words(self, n):
        words = self.text.split()
        word_counts = Counter(words)
        most_common_words = word_counts.most_common(n)
        return most_common_words


# Example usage
text = "apple banana apple cherry apple banana"
analyzer = TextAnalyzer(text)

# Get length using len()
length = len(analyzer)
print("Length of the text:", length)

# Get repetitive words
repetitive_words = analyzer.get_repetitive_words()
print("Repetitive words:", repetitive_words)

# Get most frequently occurring words
most_frequent_words = analyzer.get_most_frequent_words(2)
print("Most frequent words:", most_frequent_words)
