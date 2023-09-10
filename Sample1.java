/*WAP to print all natural numbers from 1 to n. - using while loop*/
import java.util.Scanner;
class Sample1
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=sc.nextInt();
      int i=1;
      System.out.println("Natural numbers from 1 to n");
      while(i<=n)
        {
          System.out.println(i);
          i++;
        }
    }
  }