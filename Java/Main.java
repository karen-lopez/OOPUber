class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Account account = new Account("Pepito Perez", "23567");
        Car car = new Car("KM123", account);
        car.passengenger = 3;
        //System.out.println("Car License "+ car.license);
        car.printDataCar();
    }
}