import java.util.Scanner;
public abstract class Bankacc
{

    private int accNo;
    private String accNm;
    private float accBal;
    public void Bankacc(int accNo,String accNm,float accBal)
    {
                this.accNo=accNo;
               this.accNm=accNm;
               this.accBal=accBal;
    }
    public void withdraw(float amount)
    {
        accBal=accBal-amount;
    }
    public void deposit(float amountin)
    {
        accBal=accBal+amountin;
    }
    public String toString()
    {
        return this.accNm;
    }

}
public abstract class savingacc extends Bankacc
{

    private  Boolean isSalaried=true;
    private final static int MINIMAL;
    static
    {
        MINIMAL=10000;
    }
    public void savingacc(accNo,accnumber,accBalance,isSalaried)
    {
        this.accno=accno;

    }
    public void withdraw(float amount)
    {
        accBal=accBal-amount;
    }
    public String toString()
    {
        return this.accnm;
    }
}