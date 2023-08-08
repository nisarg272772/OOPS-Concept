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
  Student(String name,String add,int age)
  {
    this.name = name;
	this.add  = add;
	this.age  = age;
  }
}
public class ParameterizedConstructor
{ 
  public static void main(String[] args)
   { 
    Student S1 = new Student ("ram","rajnagar",27);
	S1.studinfo();
   }
}
