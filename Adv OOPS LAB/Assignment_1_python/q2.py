# Q2.Write a discount coupon code using dictionary in Python with different rate coupons for each day of the week.

def apply_coupon(day, amount): # coupons for each day of the week.
    coupons = {
        "Monday": 0.1,    # 10% discount
        "Tuesday": 0.2,   # 20% discount
        "Wednesday": 0.3, # 30% discount
        "Thursday": 0.4,  # 40% discount
        "Friday": 0.5,    # 50% discount
        "Saturday": 0.6,  # 60% discount
        "Sunday": 0.7     # 70% discount
    }

    if day in coupons:
        discount = coupons[day] * amount  # Calculate the discount amount
        final_amount = amount - discount  # Calculate the final amount after discount
        print(f"Discount applied: {coupons[day] * 100}%")  # Display the discount percentage
        print(f"Final amount after discount: {final_amount}")  # Display the final amount
    else:
        print("Invalid day of the week!")  # Print error message for invalid day
    

day_of_week = input("Enter the day of the week: ")
amount = float(input("Enter the total amount: "))
apply_coupon(day_of_week, amount)