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
        System.out.println("this change is made by Wilson Cheng 02/04/2025 in the Ship");
    }

    public String getName() {
        System.out.println("this change is made by Wilson Cheng 02/04/2025 in the getName");
        return name;
    }

    public String getYearBuilt() {
        System.out.println("this change is made by Wilson Cheng 02/04/2025 in the getyearBuilt");
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("this change is made by Wilson Cheng 02/04/2025 in the setName");
    }

    public void setyearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
        //
        System.out.println("this change is made by Wilson Cheng 02/04/2025 in the setyearBuilt");
    }

    //toString
    @Override
    public String toString() {
        String str = "The ship name: " + getName()
                + "\nThe year it was built: " + getYearBuilt() + "\tthis change is made by Wilson Cheng 02/04/2025";
        return str;

    }

}
