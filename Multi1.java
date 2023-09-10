import java.util.*;
class Multi1
  {
    public static void perfect(int n)
    {
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
        System.out.println("not perfect");
      
    }
    public static void strong(int n1)
    {
      int temp,rem,fact,i,sum=0;
      temp=n1;
      while(n1>0){//145>0,14,1
        rem=n1%10;//5,4,1
        fact=1;
        for(i=1;i<=rem;i++){
          fact=fact*i;//1,2,6,24,120
           }
        sum=sum+fact;//120+24+1=145
        n1=n1/10;
      }
      if(sum==temp)
      {
        System.out.println("It is a strong number");
      }
      else 
        System.out.println("It is not a strong number");
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      perfect(n);
      System.out.println("enter a number");
      int n1=sc.nextInt();
      strong(n1);
    }
  }