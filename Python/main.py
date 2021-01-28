from car import Car;
from account import Account

if __name__ == '__main__':
    print("Hello World!")
    
    car = Car("KL234", Account("Lorenzo Lozano","234567"))
    print(vars(car))
    print(vars(car.driver))