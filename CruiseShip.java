/*
Lab 3
Sundus Tosun
COSC-2436.001
 */
package Tosun_lab_3;

public class CruiseShip extends Ship {

    private int passangers;

//constructor
    public CruiseShip(int passangers, String name, String yearBuilt) {
        super(name, yearBuilt);
        setPassangers(passangers);
    }
    // comment made by Zaki Ahmed 02/04/2025

//copy constructors
    public CruiseShip(CruiseShip c) {
        super(c.getName(), c.getYearBuilt());
        passangers = c.getPassangers();
    }
    // comment made by Zaki Ahmed 02/04/2025

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }
    // comment made by Zaki Ahmed 02/04/2025

    public int getPassangers() {
        return passangers;
    }
    // comment made by Zaki Ahmed 02/04/2025

    //toString
    @Override
    public String toString() {
        String str = "Cruise Ship Name: " + getName()
                + "\n Number of Passangers: " + getPassangers()
                + "\n";
        return str;
    }
    // comment made by Zaki Ahmed 02/04/2025

    //display
    @Override
    public void display() {
        System.out.println("Cruise Ship Information\n "
                + "\nThe number of passangers: " + getPassangers()
                + "\nThe name: " + getName()
                + "\nThe year built: " + getYearBuilt()
                + "\n");
    }
}
