/**
* Firm.java
* @author Veronica Tsarkova
* @since 11/30/18
* Demonstrates polymorphism via inheritance.
*/

public class Firm
{
    //-----------------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();
        // Sorts the personnel alphabetically, in a descending order
        personnel.sort();
        // Pays the staff
        personnel.payday();
    }
}
