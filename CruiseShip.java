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

//copy constructors
    public CruiseShip(CruiseShip c) {
        super(c.getName(), c.getYearBuilt());
        passangers = c.getPassangers();
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public int getPassangers() {
        return passangers;
    }

    //toString
    @Override
    public String toString() {
        String str = "Cruise Ship Name: " + getName()
                + "\n Number of Passangers: " + getPassangers()
                + "\n";
        return str;
    }

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
