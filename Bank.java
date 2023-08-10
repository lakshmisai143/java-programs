class Customer
  {
    private long accountno;
    private float balance;
    public void setAccountno(long accountno)
    {
      this.accountno=accountno;
    }
    public long getAccountno()
    {
      return accountno;
    }
    public void setBalance(float balance)
    {
      this.balance=balance;
    }
    public float getBalance()
    {
      return balance;
    }
  }
class Transaction
  {
    Customer c=new Customer();
    void deposit(int amount)
    {
float bal=c.getBalance()+amount;
      System.out.println("the amount after deposited"+bal);
    }
    void showDetails()
    {
      System.out.println("balance is"+getBalance());
      System.out.println("account no is"+getAccountno());
    }
  }
class Bank
  {
    public static void main(String args[]){
      Customer c=new Customer();
      c.setAccountno(123456789L);
      c.setBalance(1200f);
      Transaction t=new Transaction
    }
  }