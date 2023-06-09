from car import Car

if __name__ == "__main__":
    print("Inicia el codigo")
    car = Car()
    car.license = "AMG456"
    car.driver = "Andres Garza"
    print(vars(car))
    car2 = Car()
    car2.license = "REW923"
    car2.driver = "Ricardo Martinez"
    print(vars(car2))
