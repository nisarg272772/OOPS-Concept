class Animal
{
  public void eat()
  { 
   System.out.println("eating food");
  }
 }
class Bird extends Animal
{ 
  public void flying()
  {
   System.out.println("bird is flying");
  }
}
class Duck extends Bird
{ 
  public void Swim()
  {
   System.out.println("duck is swiming");
  }
}
class Dog extends Animal
{ 
  public void Barking()
  {
   System.out.println("dog is barking");
  }
}
public class HybridInheritance
{
  public static void main(String[] args)
  {
   Duck Dck1 = new Duck();
   Dck1.flying();
   Dck1.Swim();
   Dck1.eat();
   Dog Dg1 = new Dog();
   Dg1.Barking();
   Dg1.eat();
  }
}

 