import java.util.*;
class Multi
  {
  public static void even(int num1)
    {
      for(int i=1;i<=num1;i++)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
        }
    }
     public static void odd(int n)
    {
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }    }
    public static void prime(int num)
    {
      int count=0;
        for(int i=1;i<num;i++)
        {
          if(num%i==0)
          {
            System.out.println(i);
           count++;
          }
        }
          if(count==2)
          {
          System.out.println("Prime numbers are");
        }
   
        }
    public static void palindrome(int n1)
    {
      int r,sum=0,temp;    
      temp=n1;    
      for(int i=0;i<n1;i++){    
      r=n1%10; 
      sum=(sum*10)+r;    
      n1=n1/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome"); 
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the numbers");
      int num1=sc.nextInt();
      even(num1);
      System.out.println("enter the numbers");
      int n=sc.nextInt();
      odd(n);
      System.out.println("enter the numbers");
      int num=sc.nextInt();
      prime(num);
      System.out.println("enter the number");
      int n1=sc.nextInt();
      palindrome(n1);
    }
  }