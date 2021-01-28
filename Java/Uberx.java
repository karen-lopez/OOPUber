class Uberx extends Car{
    private String brand;
    private String model;

    public Uberx(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
        super.setPassengenger(4);
    }
    
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("brand: "+ this.brand + " model: " + this.model);
    }
}