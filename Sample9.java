/*even sum*/
import java.util.Scanner;
class Sample9
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int i=1;
      int sum=0;
      for(i=1;i<=n;i++)
        { 
          if(i%2==0)
          sum+=i;
        }
          System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);
        }
    }