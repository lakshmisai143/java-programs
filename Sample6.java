/*WAP to find sum of all natural numbers between 1 to n.*/
import java.util.Scanner;
class Sample6
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=sc.nextInt();
      int i=1;
      int sum=0;
      System.out.println("Sum Natural numbers from 1 to n");
      while(i<=n)
        {
       sum=sum+i;
          i++;
        }
         System.out.println(i);
    }
  }