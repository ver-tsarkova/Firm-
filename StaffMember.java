/**
* StaffMember.java
* @author Veronica Tsarkova
* @since 11/26/18
* Represents a generic staff member.
*/

abstract public class StaffMember implements Payable, Comparable<StaffMember>
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    // Returns the name
    public String getName()
    {
        return name;
    }

    // Update compareTo to compare to the other member's name.
    public int compareTo(StaffMember otherMember)
    {
        return name.compareTo(otherMember.getName());
    }

    // Derived classes must define the vacation method for each type of employee.
    public abstract int vacation();


}
