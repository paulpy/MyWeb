class Driver extends Account{
    public Driver(String nombre, String documento, String email, String password){
        super(nombre, documento);
        super.email = email;
        super.password = password;
    }
}