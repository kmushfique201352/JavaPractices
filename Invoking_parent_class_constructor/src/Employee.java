
class Employee{
	public String name;
	public float salary;
	
	public Employee(String name,float salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void showDetails() {
		System.out.println("Name: "+name+"\n"+"Salary"+salary);
	}
}
