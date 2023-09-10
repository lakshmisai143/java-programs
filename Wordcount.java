
class Wordcount
  {
    public static void main(String args[]){
     String str="my name is sai";
      String[] str1= str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          System.out.println(str1[i]+" "+str1[i].length());
        }
    }
  }