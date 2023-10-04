#Andrew Eppich
#CPSC230
#Febuary 10 2023
#Assignment 2
#Collaborators:
#None
#References
#None
#README
#this assignment calculates the price and sales tax, the temperature converted for farenheight to celsius,
#And uses the quadratic formula

price = int(input("What is the price"))
tax = int(input("What is the tax"))
solution = (price*tax)
print(solution)

temp = int(input("what is the temperature in celsius"))
print(temp)
solution = ((temp*1.8)+32)
print(solution)

import math
a = int(input("what is the coefficient for a"))
b = int(input("what is the coefficient for b"))
c = int(input("what is the coefficient for c"))

solution1 = (-b + math.sqrt(b**2 - 4 * a*c))/(2 * a)
solution2 = (-b + math.sqrt(b**2 -4 * a*c))/(2 * a)
print(solution1)
print(solution2)