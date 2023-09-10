/*armstrong*/

import java.util.Scanner;
class Sample12{
    public static void main(String args[]){
        int num,arm=0,rem,temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input : ");
        num=sc.nextInt();        
        temp=num;
while(num>0){
            rem=num%10;   
            arm=(rem*rem*rem)+arm; 
            num=num/10;
}
        if(temp==arm){
              System.out.println("this is arm strong number");
        }else{
              System.out.println("this is not armstrong number :");
        }

    }
}