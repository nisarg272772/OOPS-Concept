abstract class Animal
{
  abstract void eat();
 }
class Bird extends Animal
{ 
  public void eat()
  {
   System.out.println("bird is eating");
  }
}
public class Abstractclass
{
  public static void main(String[] args)
  {
   Bird B1 = new Bird();
   B1.eat();
  }
}

 