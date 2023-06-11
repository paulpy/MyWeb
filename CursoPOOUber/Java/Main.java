class Main{
    public static void main(String[] args) {
        System.out.println("Inicia el codigo");
        UberX uberX = new UberX("AMQ153",new Account("Andres Herrera","1223RRT"), "Toyota", "Corolla");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("QWE123", new Account("Pedro", "22311234"),null,null);
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}