# Q11. Search for palindrome and unique words in a text using class method and string method.
class TextAnalyzer:
    def __init__(self, text):
        self.text = text

    @classmethod
    def find_palindromes(cls, text): #Find and return a list of palindrome words in the given text.
        words = cls.extract_words(text)
        palindromes = [word for word in words if cls.is_palindrome(word)]
        return palindromes

    @staticmethod
    def extract_words(text): # Extract and return a list of words from the given text.
        words = text.split()
        return words

    @staticmethod
    def is_palindrome(word): #  Check if a word is a palindrome.
        word = word.lower()
        reversed_word = word[::-1]
        return word == reversed_word

    def find_unique_words(self): # Find and return a list of unique words in the text.
        words = self.extract_words(self.text)
        unique_words = list(set(words))
        return unique_words

# Example usage
text = "level kayak radar python madam python radar level"
analyzer = TextAnalyzer(text)

# Using class method to find palindromes
palindromes = TextAnalyzer.find_palindromes(text)
print("Palindromes (Class Method):", palindromes)

# Using string method to find palindromes
words = analyzer.extract_words(text)
palindromes = [word for word in words if word.lower() == word.lower()[::-1]]
print("Palindromes (String Method):", palindromes)

# Using instance method to find unique words
unique_words = analyzer.find_unique_words()
print("Unique Words:", unique_words)
