class MyThread extends Thread
  {
    public void run()
    {
     for(int i=0;i<=5;i++)
       {

         System.out.println(i+" Id is "+Thread.currentThread().getId());
       }
    }
  }
class SampleThread
  {
    public static void main(String args[])
    {
      MyThread mt=new MyThread();
      MyThread mt1=new MyThread();
      mt.start();
      mt1.start();
    }
  }
