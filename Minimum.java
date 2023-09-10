import java.util.Scanner;
class Minimum{
  public static void smallArray(int a[],int size)
    {
      int small=a[0];
      for(int i=0;i<size;i++)
        {
          if(small>a[i])
          {
            small=a[i];
          }
        }
      System.out.println("the small number is "+small);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      smallArray(a,size);
    }
  }
