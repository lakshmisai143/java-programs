abstract class Animal {
    abstract void speak();
    abstract void move();
}
class dog extends Animal{
  void speak()
    {
    system.out.println("dog sounds like bow bow");
  }
  void move()
  {
    System.out.println("dogs are running");
  }
  class cat extends Animal{
    void speak(){
      System.out.println("the cat sounds like meow meow");
    }
    void move()
    {
      System.out.println("the cat moves slowly");
    }
    class bird extends Animal{
      void speak(){
        System.out.println("the bird sounds like ggg");
      }
      void move(){
        System.out.println("the bird flys");
      }
      class Animalhier{
        public static void main(String args[]){
          Animal dog=new Animal();
          Animal cat=new Animal();
          Animal bird=new Animal();
          dog.speak();
          dog.move();
          cat.speak();
          cat.move();
          bird.speak();
          bird.move();
          
        }
      }
    }
  }
    
  }
}