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
        //this change is made by Wilson Cheng 02/04/2025
    }

    public String getName() {
        return name;
        //this change is made by Wilson Cheng 02/04/2025
    }

    public String getYearBuilt() {
        return yearBuilt;
        //this change is made by Wilson Cheng 02/04/2025
    }

    public void setName(String name) {
        this.name = name;
        //this change is made by Wilson Cheng 02/04/2025
    }

    public void setyearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
        //this change is made by Wilson Cheng 02/04/2025
    }

    //toString
    @Override
    public String toString() {
        String str = "The ship name: " + getName()
                + "\nThe year it was built: " + getYearBuilt();
        return str;
        //this change is made by Wilson Cheng 02/04/2025
        //this change is made by Wilson Cheng 02/04/2025
        //this change is made by Wilson Cheng 02/04/2025
        //this change is made by Wilson Cheng 02/04/2025
        //this change is made by Wilson Cheng 02/04/2025
        //this change is made by Wilson Cheng 02/04/2025
    }

}
