/* WAP to print all Strong number*/


import java.util.Scanner;


/*strong number145=1!+4!+5!*/
import java.util.Scanner;
class Sample8
{
    public static void main(String args[])
    {
    int n,temp,rem,fact,i,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      n=sc.nextInt();//145
      temp=n;
      while(n>0){//145>0,14,1
        rem=n%10;//5,4,1
        fact=1;
        for(i=1;i<=rem;i++){
          fact=fact*i;//1,2,6,24,120
     System.out.println("fact"+fact);   }
        sum=sum+fact;//120+24+1=145
        n=n/10;
      }
      if(sum==temp)
      {
        System.out.println("It is a strong number");
      }
      else 
        System.out.println("It is not a strong number");
    }
  }