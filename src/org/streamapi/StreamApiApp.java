package org.streamapi;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getSal() {
		return sal;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	}
	

public class StreamApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(5,"swati",65467);
		Employee e2=new Employee(3,"rita",9287);
		Employee e3=new Employee(1,"neha",2397);
		Employee e4=new Employee(9,"sargam",85467);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		List<Float> li=new ArrayList<Float>();
		for(Employee emp:al)
		{
		if(emp.getSal()<30000)	
		{
			li.add((float) emp.getSal());
			System.out.println(li);
		}
	}
		System.out.println(al);

}
}
