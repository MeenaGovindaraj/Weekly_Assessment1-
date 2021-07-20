package com.question4;

public abstract class Workers {
	int id;
	String name;
	// for daily workers no of hrs working per is 8 and pay for 1 hr is 100
	int salary;
	String type;
	int workedhrs;
	
public Workers()
{
	
}
	public Workers(int id, String name, String type, int workedhrs,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.type = type;
		this.workedhrs = workedhrs;
		this.salary=salary;
	}


	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getWorkedhrs() {
		return workedhrs;
	}
	public void setWorkedhrs(int workedhrs) {
		this.workedhrs = workedhrs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "\nWorkers [id=" + id + ", name=" + name + ", type=" + type + ", workedhrs="
				+ workedhrs + ", salary="+ pay()+ "]";
	}
	
	public abstract int pay();
}
