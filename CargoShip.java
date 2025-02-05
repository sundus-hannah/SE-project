/*
Lab 3
Sundus Tosun
COSC-2436.001
 */

package Tosun_lab_3;

public class CargoShip extends Ship {

    private int tonnage;

    //constructor
    public CargoShip(String name, String yearBuilt, int tonnage) {
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

//copy constructors
    public CargoShip(CargoShip t) {
        super(t.getName(), t.getYearBuilt());
        tonnage = t.tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    //toString
    @Override
    public String toString() {
        String str = "Cargo Ship Name: " + getName()
                + "\n Cargo Capacity: " + getTonnage()
                + "\n";
        return str;
    }

    //Display
    @Override
    public void display() {
        System.out.println("Cargo Ship Information\n "
                + "\nThe name: " + getName()
                + "\nThe year built: " + getYearBuilt()
                + "\nThe weight in tons: " + getTonnage()
                + "\n");
    }

}
