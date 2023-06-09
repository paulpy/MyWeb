from car import Car
from account import Account

if __name__ == "__main__":
    print("Inicia el codigo")
    car = Car("AMG456", Account("Carlos Gallano", "3234EERT"))
    print(vars(car))
    print(vars(car.driver))
