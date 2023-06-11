class User extends Account{
    public User(String nombre, String documento, String email, String password){
        super(nombre, documento);
        super.email = email;
        super.password = password;
    }
}