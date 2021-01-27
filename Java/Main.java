class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car();
        car.license = "KM123";
        car.driver = "Pepito Perez";
        car.passengenger = 3;
        //System.out.println("Car License "+ car.license);
        car.printDataCar();
    }
}