class Main{
    public static void main(String[] args) {
        System.out.println("Inicia el codigo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.printDataCar();
        Car car2 = new Car();
        car2.license = "QGH726";
        car2.driver = "Andra Herrera";
        car2.passenger = 3;
        car2.printDataCar();
    }
}