#Q16. Create a dictionary that maps stock names to prices, which will keep insertion
#order.Find minimum price, maximum price and sort items according to their prices in first
# dictionary. Create another second stock dictionary. Find items that are only in first dictionary
# and find items whose prices do not match. Remove duplicate items from first dictionary.
# Sort both dictionaries for incrementing prices. Group items in first dictionary by price in
# multiple of 500. Find an item with price=800 from both dictionaries.

from collections import OrderedDict

# Create the first dictionary with insertion order
stock_prices = OrderedDict()
stock_prices["AAPL"] = 150.25
stock_prices["GOOGL"] = 2500.75
stock_prices["AMZN"] = 3200.50
stock_prices["MSFT"] = 350.80

# Find minimum and maximum prices
min_price = min(stock_prices.values())
max_price = max(stock_prices.values())
print("Minimum Price:", min_price)
print("Maximum Price:", max_price)

# Sort items by prices
sorted_prices = sorted(stock_prices.items(), key=lambda x: x[1])
print("Items sorted by price:")
for item in sorted_prices:
    print(item[0], "-", item[1])

# Create the second stock dictionary
stock_prices2 = {
    "AAPL": 160.50,
    "GOOGL": 2400.00,
    "TSLA": 700.25,
    "FB": 350.80
}

# Find items only in the first dictionary
items_only_in_first = set(stock_prices.keys()) - set(stock_prices2.keys())
print("Items only in the first dictionary:", items_only_in_first)

# Find items with mismatched prices
mismatched_prices = {
    stock: stock_prices[stock]
    for stock in stock_prices
    if stock in stock_prices2 and stock_prices[stock] != stock_prices2[stock]
}
print("Items with mismatched prices:", mismatched_prices)

# Remove duplicates from the first dictionary
stock_prices = OrderedDict.fromkeys(stock_prices)

# Sort both dictionaries by increasing prices
sorted_stock_prices = OrderedDict(sorted(stock_prices.items(), key=lambda x: x[1] if x[1] is not None else float('inf')))
sorted_stock_prices2 = OrderedDict(sorted(stock_prices2.items(), key=lambda x: x[1] if x[1] is not None else float('inf')))


# Group items in the first dictionary by price in multiples of 500
grouped_items = {}
for stock, price in stock_prices.items():
    if price is not None:
        group = int(price // 500) * 500
        if group not in grouped_items:
            grouped_items[group] = []
        grouped_items[group].append((stock, price))

print("Grouped items in the first dictionary:")
for group, items in grouped_items.items():
    print("Price Group:", group)
    for item in items:
        print(item[0], "-", item[1])

# Find item with price=800 in both dictionaries
item_with_price_800 = next((item for item in stock_prices.items() if item[1] == 800), None)
item_with_price_800_2 = next((item for item in stock_prices2.items() if item[1] == 800), None)
print("Item with price=800 in the first dictionary:", item_with_price_800)
print("Item with price=800 in the second dictionary:", item_with_price_800_2)
