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
public class MultilevelInheritance
{
  public static void main(String[] args)
  {
   Duck D1 = new Duck();
   D1.flying();
   D1.Swim();
   D1.eat();
  }
}

 