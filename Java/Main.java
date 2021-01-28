class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Account account = new Account("Pepito Perez", "23567");
        Car car = new Car("KM123", account);
        car.passengenger = 3;
        //System.out.println("Car License "+ car.license);
        car.printDataCar();

        Driver driver = new Driver("Lorenzo Sierra", "9823334");
        driver.printDataAccount();

        Driver user = new Driver("Maria Morales", "654322");
        user.printDataAccount();
        
    }
}