/**
* Employee.java
* Represents a general paid employee.
*/

public class Employee extends StaffMember implements Payable
{
    protected double payRate;
    protected final int STANDARD_VACATION = 14;
    protected String socialSecurityNumber;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
      super(eName, eAddress, ePhone);

      socialSecurityNumber = socSecNumber;
      payRate = rate;
    }
    public String toString()
    {
      String result = super.toString();
      result += "\nSocial Security Number: " + socialSecurityNumber;
      return result;
    }

    //-----------------------------------------------------------------
    // Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay()
    {
      return payRate;
    }

    //-----------------------------------------------------------------
    // Returns the standard vacation.
    //-----------------------------------------------------------------
    public int vacation()
    {
      return STANDARD_VACATION;
    }
}
