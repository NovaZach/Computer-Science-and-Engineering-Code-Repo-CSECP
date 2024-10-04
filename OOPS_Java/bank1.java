import java.util.Scanner;
class BankAcc
{
   int account_no;
    String hname;
    float balance=0;
  BankAcc(int a,String n,float b)
  {
     account_no=a;
     hname=n;
     balance=b;
   }
  BankAcc()
  {
    account_no=0;
    hname= null;
    balance=0;
    }
 
  void Deposit(float d_amt)
  {
    balance=balance+d_amt;
    System.out.print("Amount deposited successfully\n");
   
    }
  void withdraw (float w_amt)
  {
    if(w_amt>balance)
    {
      System.out.print("insufficient balance");
     }
    else
    {
      balance=balance-w_amt;
      System.out.println("Current balance: "+balance);
     
    }
  }
 
  void display()
  {
    System.out.println("account no is: "+account_no);
    System.out.println("name is: "+hname);
    System.out.println("balance is: "+balance);
   }
   }
   public class bank1
   {
     public static void main(String[] args)
     {
       int a;
       String n;
       float b,d_amt,w_amt,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Object using default constructor: ");
       System.out.println("account no :");
       a=sc.nextInt();
       System.out.println("name: ");
       n=sc.next();
       
       BankAcc acc1= new BankAcc();
       acc1.account_no=a;
       acc1.hname=n;
       acc1.display();
       System.out.println("deposit amt:");
       d_amt=sc.nextFloat();
       acc1.Deposit(d_amt);
       
       System.out.println("withdraw amt:");
       w_amt= sc.nextFloat();
       acc1.withdraw(w_amt);
       
       acc1.display();
       System.out.println("\nUsing parameterised constructor:");
       BankAcc acc2= new BankAcc(891,"noah",0);
       acc2.Deposit(1000);
       acc2.withdraw(100);
       acc2.display();
       sc.close();
       }
      }
