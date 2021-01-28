class Car{
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        if(passengenger != null){
            System.out.println("License: "+ this.license + " Driver: " + this.driver.name + " passengenger: " + this.passengenger);
        }else{
            System.out.println("License: "+ this.license + " Driver: " + this.driver.name);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassengenger() {
        return passengenger;
    }

    public void setPassengenger(Integer passengenger) {
        if(passengenger == 4)this.passengenger = passengenger;
        else System.out.println("necesitas 4 pasajeros");
    }
}