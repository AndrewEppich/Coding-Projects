#Andrew Eppich
#Febuary 24th
#Homework 3
#Collaborators:
#NONE
#References:
#NONE

#TotalPrice

price = int(input("What is the price of your item"))
if price <= 0:
    print("Please enter a value that is above zero")
if price > 0:
        tax = float(input("What is your sales tax as a decimal"))
        solution = (price*(tax + 1))
print("Your price is")
print(solution)

#Celsius

temp = int(input("Give me a temperature in Celsius"))

if temp >= 58 or temp <= -88:
    print("The temperature entered is not a temperature seen on earth. Please enter another temperature")

elif temp <= 58 or temp >= -88:
    solution = ((temp*1.8)+32)
    print("Your temperature in Farenheit is")
    print(solution)

#FishVFishes

fish1 = input("Name a fish")
fish2 = input("Name another fish")
fish3 = input("Name a third fish")
{fish1, fish2, fish3}

if len(fish1) == len(fish2) and len(fish2) == len(fish3):
     print("The plural for this group is fish")
else:
     print("The plural for this group is fishes")