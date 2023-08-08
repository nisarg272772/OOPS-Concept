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
}
class This
{  
  public static void main(String[] args)
  {
   Student S1 =new Student();
   S1.name = "raj";
   S1.add  = "punit nagar";
   S1.age   = 30;
   S1.studinfo();
  }
}