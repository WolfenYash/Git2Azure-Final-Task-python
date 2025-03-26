def fibonacci_iterative(n):
    if n <= 0:
        return 0
    elif n == 1:  # For n = 1, return 1
        return 1
    elif n == 2:  # For n = 2, return 1
        return 1
    
    a, b = 0, 1
    for _ in range(2, n):  # Starts from 2 to n-1
        a, b = b, a + b
    return b  # Correctly indented inside the function

n = 10
print(f"The {n}th Fibonacci number is: {fibonacci_iterative(n)}") #this is a new feature
