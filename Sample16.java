/*palindrome*/
import java.util.Scanner;
class Sample16
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int temp;
      int sum;
      int rem;
      temp=n;
     for(sum=0;n>0;n/=10){
        rem=n%10;
        sum=(sum*10)+rem;
      
      }
      if(temp==sum){
        System.out.println("palindrome");
      }
      else{
        System.out.println("not palindrome");
      }
    }
  }