class Main{
    public static void main(String[] args) {
        System.out.println("Inicia el codigo");
        Car car = new Car("AMQ123",new Account("Andres Herrera","1223RRT"));
        car.passenger = 4;
        car.printDataCar();
        Car car2 = new Car("QGH726", new Account("Andrea Herrera", "33412GTS"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}