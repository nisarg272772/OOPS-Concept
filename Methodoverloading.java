class Employee
{ 
 String empname;
 int empid;
 int empsalary;
 
  public void empdetails(String empname)
  {
   System.out.println(empname);
  }
  public void empdetails(int empid)
  {
   System.out.println(empid);
  }
  public void empdetails(String empname,int empid ,int empsalary)
  {
   System.out.println(empname);
   System.out.println(empid);
   System.out.println(empsalary);
  }

}
public class Methodoverloading
{ 
  public static void main(String[] args)
  {
   Employee E1 = new Employee();
   E1.empname = "Harsh";
   E1.empid = 121;
   E1.empsalary = 30000;
   E1.empdetails(E1.empname,E1.empid,E1.empsalary);
   
  }
}