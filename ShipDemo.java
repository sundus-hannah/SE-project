/*
Lab 3
Sundus Tosun
COSC-2436.001
 */
package Tosun_lab_3;

import java.util.ArrayList;

public class ShipDemo {

    public static void main(String[] args) {

        // Array of ships
        Ship[] arrayShip = new Ship[]{
            new CargoShip("Crystal Seas", "1935", 10000),
            new CruiseShip(100, "Silver Wave", "2012"),
            new CargoShip("Blue Horizon", "1998", 50000),
            new CruiseShip(900, "Northern Star", "2004")
        };

        for (Ship ship : arrayShip) {
            ship.display();
        }

        // Arraylist of ships
        ArrayList <Ship> shipList = new ArrayList<>();

        shipList.add(new CargoShip("Polar Conquest", "1899", 7500));
        shipList.add(new CruiseShip(3200, "Pacific Dream", "1985"));
        shipList.add(new CargoShip("Sally Sea", "2001", 50000));
        shipList.add(new CruiseShip(25000, "Destiny Cruise", "2020"));

        System.out.println("______________________");
        for (Ship ship : shipList) {
            System.out.println(ship);
        }

        System.out.println("");

        //Copy constructor testing 
        CruiseShip cruiseShip = new CruiseShip(25000, "Destiny Cruise", "2020");
        CruiseShip copyOfCruiseShip = new CruiseShip(cruiseShip);
        if (cruiseShip.getName().equals(copyOfCruiseShip.getName())) {
            System.out.println("These cruise ships are the exact same");
        }
        CargoShip cargoShip = new CargoShip("Sally Sea", "2001", 50000);
        CargoShip copyOfCargoShip = new CargoShip(cargoShip);
        if (cargoShip.getName().equals(copyOfCargoShip.getName())) {
            System.out.println("These cargo ships are the exact same");
        }

    }

}
