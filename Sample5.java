/*WAP to print all odd number between 1 to 100*/
import java.util.Scanner;
class Sample5
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n odd numbers:");
      int n=sc.nextInt();
     int i=1;
       System.out.println("print odd numbers:");
      while(i<=n)
        {
          if(i%2!=0)
    System.out.print(i);
          i++;
        }
    }
  }