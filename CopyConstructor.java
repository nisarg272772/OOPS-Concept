class Student
{
  String name;
  String add;
  int age;
  public void studinfo()
   { 
     System.out.println(this.name);
	 System.out.println(this.add);
	 System.out.println(this.age);
   }
   Student(Student S2)
   {
    this.name = S2.name; 
	this.add  = S2.add;
	this.age  = S2.age;
   }
   Student()
   {}
}
public class CopyConstructor
{ 
  public static void main(String[]args)
  {
   Student S1 = new Student();
   S1.name = "Brijesh";
   S1.add  = "Ahemad Nagar";
   S1.age  = 38;
   Student S2 = new Student(S1);
   S2.studinfo();
  }
}