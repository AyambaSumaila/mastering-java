package HowToProgramJava;

public class CreditCard {
    private String customer, bank, account;
    private int limit;
    protected double balance;

    //Constructor

    public  CreditCard(String cust, String ban, String acnt, int lim, double initialBal)
    {
        customer=cust;
        bank=ban;
        account=acnt;
        limit=lim;
        balance=initialBal;
    }

    public CreditCard(String cust, String ban, String acnt, int lim)
    {
        this(cust, ban, acnt, lim, 0.0);

    }

    public String getCustomer()
    {
        return customer;
    }

    public String getBank()
    {
        return bank;
    }

    public String getAccount()
    {
        return account;
    }

    public int getLimit()
    {
        return limit;
    }

    public double getBalance()
    {
        return balance;
    }
    public boolean charge(double price)
    {
        if(price + balance > limit)
        {
            return false;

        }
        balance +=price;

        return true;
    }

    public void makePayment(double amount)
    {
        balance -=amount;
    }


    public static void printSummary(CreditCard card)
    {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);

    }


    public static void main(String[] args)
    {
        CreditCard[] wallet=new CreditCard[3];

        wallet[0]=new CreditCard("Adam Sule", "Lapaz Savings", "92 3939 292 39", 1000);
        wallet[1]=new CreditCard("Apam Pele", "Wapaz Savings", "192 3939 292 39", 1000);
        wallet[2]=new CreditCard("Atam Sam", "Japaz Savings", "1292 3939 292 39", 1000);


        for(int val=1; val<=16; val++)
        {
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);

        }
        for(CreditCard card : wallet)
        {
            CreditCard.printSummary(card);
            while(card.getBalance() > 200.0)
            {
                card.makePayment(200);
                System.out.println("New Balance = " + card.getBalance());

            }
        }
    }

}

