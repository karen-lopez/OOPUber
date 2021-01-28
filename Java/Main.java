class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Account account = new Account("Pepito Perez", "23567");
       /* Car car = new Car("KM123", account);
        //System.out.println("Car License "+ car.license);
        car.printDataCar();
        car.setPassengenger(2);
        */
        Uberx uberx = new Uberx("KM123", account, "chevrolet", "spark");
        //System.out.println("Car License "+ car.license);
        uberx.setPassengenger(2);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("XD345", new Account(
            "Pamela Rodriguez", "929394959"));
        ubervan.setPassengenger(6);
        ubervan.printDataCar();
        /*Driver driver = new Driver("Lorenzo Sierra", "9823334");
        driver.printDataAccount();

        Driver user = new Driver("Maria Morales", "654322");
        user.printDataAccount();
        */
    }
}