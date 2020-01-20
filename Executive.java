/**
* Executive.java
* Represents an executive staff member, who can earn a bonus.
*/

public class Executive extends Employee
{
    private double bonus;
    private int extraVacation = 0;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this executive with the specified
    //  information.
    //-----------------------------------------------------------------

    public Executive (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
      super(eName, eAddress, ePhone, socSecNumber, rate);
      this.extraVacation = extraVacation;

      bonus = 0;
    }
    public Executive (String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate, int compVacation)
    {
       super (eName, eAddress, ePhone, socSecNumber, rate);

       bonus = 0;
       extraVacation = compVacation;
    }

    //-----------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus (double execBonus)
    {
       bonus = execBonus;
    }

    //-----------------------------------------------------------------
    // Computes and returns the pay for an executive.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }

    //-----------------------------------------------------------------
    // Computes and returns vacation days alloted for executives.
    //-----------------------------------------------------------------
    public int vacation()
    {
        return STANDARD_VACATION + extraVacation;
    }
}
