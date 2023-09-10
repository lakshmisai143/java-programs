/*WAP to print all natural numbers in reverse (from n to 1). -     using while loop*/
import java.util.Scanner;
class Sample2
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=sc.nextInt();
       int i;
      System.out.println("Natural numbers from n to 1");
      while(n>=1)
        {
          System.out.println(n);
          n--;
        }
    }
  }