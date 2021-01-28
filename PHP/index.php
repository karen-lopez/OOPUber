<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Example</title>
</head>
<body>
    <?php
        require_once("Car.php");
        require_once("Account.php");
        require_once("UberX.php");
        require_once("UberPool.php");

        $car = new Car("AB321", new Account("Paola Rendon", "2345677"));
        $car->printDataCar();
        
        $uberX = new UberX("KT321", new Account("Jose Rendon", "2345677"), "chevrolet", "spark");
        $uberX->printDataCar();

        $uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge", "Attitude");
        $uberPool->printDataCar();
    ?>
</body>
</html>