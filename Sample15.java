/*perfect number*/
import java.util.Scanner;
class Sample15
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int sum=0;
      int i=1;
      while(i<n){
        if(n%i==0){
          sum=sum+i;
          
        }
      i++;
      }
      if(sum==n)
{
        System.out.println("perfect number");
      }
      else
        System.out.println("not palindrome");
      
    }
  }