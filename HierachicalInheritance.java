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
class Dog extends Animal
{ 
  public void Barking()
  {
   System.out.println("dog is barking");
  }
}
public class HierachicalInheritance
{
  public static void main(String[] args)
  {
   Bird B1 = new Bird();
   B1.flying();
   B1.eat();
   Dog D1 = new Dog();
   D1.Barking();
   D1.eat();
  }
}

 