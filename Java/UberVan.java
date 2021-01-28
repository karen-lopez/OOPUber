import java.util.Map;
import java.util.ArrayList;

class UberVan extends Car{
    
    private Map<String, Map<String, Integer>> typeCarAccepted;
    private ArrayList<String> seatsMaterials;
    private Integer passengenger;

    public UberVan(String license, Account driver,
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterials = seatsMaterial;
    }

    public UberVan(String license, Account driver){
        super(license, driver);
        
    }

    @Override
    public void setPassengenger(Integer passengenger) {
        if(passengenger == 6){
            this.passengenger = passengenger;
        }else{
            System.out.println("Deben ser 6 pasageros");
        }

    }

}
