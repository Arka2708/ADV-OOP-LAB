package com.arkajyoti;

//Q6. Write a program where class contains void show(int) to display the argument passed.
// Call the function once with short as actual parameter and again double as actual parameter.
// Add another function as void show(double) . Repeat the calls. Observe the outcomes in each case
public class q6ShowFunction {
    public void show(int value) {
        System.out.println("Value of int argument: " + value);
    }
    public void show(double value) {
        System.out.println("Value of double argument: " + value);
    }
    public static void main(String[] args) {
        q6ShowFunction obj = new q6ShowFunction();
        short shortValue = 10;
        obj.show(shortValue); // Calls show(int) with a short argument
        double doubleValue = 3.14;
        obj.show(doubleValue); // Calls show(double) with a double argument
    }
}
