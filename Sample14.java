/*number to word*/
import java.util.*;
class Sample14{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    displayNumber(n);
}
  static void displayNumber(int n)
  {
  String str="";
    while(n>0){
    int digit=n%10;
    n=n/10;
      switch(digit)
      {
        case 0:
          str="Zero"+str;
          break;
        case 1:
          str="One"+str;
          break;
        case 2:
          str="Two"+str;
          break;
        case 3:
          str="Three"+str;
          break;
        case 4:
          str="Four"+str;
          break;
        case 5:
          str="Five"+str;
          break;
        case 6:
          str="Six"+str;
          break;
        case 7:
         str="Seven"+str;
          break;
        case 8:
          str="Eight"+str;
          break;
        case 9:
         str="Nine"+str;
break;
      }
    }    System.out.println(str);
  }
}