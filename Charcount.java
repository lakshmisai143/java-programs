class Charcount
  {
    public static void main(String args[])
    {
      int count=0;
    String s="sai";
      for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);
          
          if(ch>='a'&&ch<='z')
          {
            count=count+1;
          }
        }
      System.out.println("the number of values in the string are"+ count);
    }
    }