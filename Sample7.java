/*Fibonacci series*/
import java.util.Scanner;
class Sample7
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of terms");
      int n=sc.nextInt();
      int first=0;
      int second=1;
      System.out.println(first);
      System.out.println(second);
      for(int i=1;i<=n;i++)
        {
         int third=first+second;
          System.out.println(third);
          first=second;
          second=third;
          
        }
    }
  }