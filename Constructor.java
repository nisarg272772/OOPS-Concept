class Student
{
  String name;
  String add;
  int  age;
  
   public void studinfo()
   {
     System.out.println(this.name);
     System.out.println(this.add);
	 System.out.println(this.age);
   }
   Student()
   {
     System.out.println("this is non parameterized constructor");
   }
}
public class Constructor
{ 
  public static void main(String[] args)
  { 
   Student S = new Student();
   S.name = "ram";
   S.add  = "rakesh nagar";
   S.age  = 25;
   S.Studinfo();	  
  }
}
