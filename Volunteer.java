/**
* Volunteer.java
* @author Veronica Tsarkova
* @since 11/30/18
* Represents a staff member that works as a volunteer.
*/

public class Volunteer extends StaffMember
{
    //-----------------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified
    //  information.
    //-----------------------------------------------------------------
    public Volunteer(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    public int vacation()
    {
      return 0; 
    }
}
