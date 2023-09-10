/*WAP to print all alphabets from a to z. - using while loop*/
import java.util.Scanner;
class Sample3
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter all alphabets");
        char c='a';
        while(c<='z'){
            System.out.println(c);
            c++;
        }
    }
}