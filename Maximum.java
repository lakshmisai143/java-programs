import java.util.Scanner;
class Maximum
  {
    public static void bigArray(int a[],int size)
    {
      int big=a[0];
      for(int i=0;i<size;i++)
        {
          if(big<a[i])
          {
            big=a[i];
          }
        }
      System.out.println("the big number is "+big);
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=s.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=s.nextInt();
        }
      bigArray(a,size);
    }
  }