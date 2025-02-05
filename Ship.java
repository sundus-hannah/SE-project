/*
Lab 3
Sundus Tosun
COSC-2436.001
 */
package Tosun_lab_3;

abstract class Ship implements Displayable {

    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        setName(name);
        setyearBuilt(yearBuilt);
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setyearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    //toString
    @Override
    public String toString() {
        String str = "The ship name: " + getName()
                + "\nThe year it was built: " + getYearBuilt();
        return str;
    }

}
