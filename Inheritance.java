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
public class Inheritance
{
  public static void main(String[] args)
  {
   Bird B1 = new Bird();
   B1.flying();
   B1.eat();
  }
}

 