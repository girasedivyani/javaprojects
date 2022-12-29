package anudip;

 class Employee {
	 int employee_id;
	 String employee_name;
	 int salary;
	 
	 
	 Employee(){
		 System.out.println("I am default constructor");
	 }
	 Employee(int employee_id,String employee_name,int salary)
	 {
		 this.employee_id=employee_id;
		 this.employee_name=employee_name;
		 this.salary=salary;
		 System.out.println("I parameterized constructor");
	 }
	 public String toString()
	 {
		 return employee_id+" "+employee_name+" "+salary;
	 }
	 private static int count;
	 {
		 count++;
	 }
	 public static void main(String[] args)
	 {
		 Employee e1=new Employee();
		 Employee e2=new Employee(1001,"Divyani",31000);
		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println("total number of objects:"+Employee.count);
		 
	 }

}
