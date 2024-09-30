package HowToProgramJava;

public class CashierRegister {

    /*A cash register totals up sales and computes change due
    * */
    public static final double QUARTER_VALUE=0.25;
    public static final double DIME_VALUE=0.1;
    public static final double NICKEL_VALUE=0.05;
    public static final double PENNY_VALUE=0.01;
    private double purchase;
    private double payment;
    /*
    Constructs a cash register with no money
     */
    public CashierRegister()
    {
        purchase=0;
        payment=0;
    }
    public void recordPurchase(double amount)
    {
        purchase +=amount;
    }

    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies)
    {
        payment=dollars +quarters * QUARTER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

    public double giveChange()
    {
        double change=payment - purchase;
        purchase =0;
        payment=0;
        return change;
    }
}
