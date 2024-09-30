package HowToProgramJava;

public class ChildCreditCard  extends CreditCard {


private double apr;
public ChildCreditCard(String cust, String ban, String acnt, int lim, double initialBal, double rate)

    {
    super(cust, ban, acnt, lim, initialBal);
    apr=rate;

    }

    public void processMonth()
    {
        if(balance > 0)
        {
            double monthlyFactor=Math.pow(1 +  apr, 1.0/12);
            balance *=monthlyFactor;
        }
    }

    public boolean charge(double price)
    {
        boolean isSuccess=super.charge(price);
        if(!isSuccess)
        {
            balance +=5;
        }
        return isSuccess;
    }
}

