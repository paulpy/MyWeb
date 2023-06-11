import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    Integer passenger;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if (passenger == 6)
            this.passenger = passenger;
        else
            System.out.println("Necesitas asignra 6 pasajeros");
    }
}