class UberPool extends Car {
    
    private String brand;
    private String model;

    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
        super.setPassengenger(4);
    }
}
