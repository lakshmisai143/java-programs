/*WAP to print all even numbers between 1 to 100. - using while     loop*/
import java.util.Scanner;
class Sample4
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n even numbers:");
      int n=sc.nextInt();
     int i=2;
       System.out.println("print even numbers:");
      while(i<=n)
        {
          if(i%2==0)
    System.out.print(i);
          i++;

        }
    }
  }