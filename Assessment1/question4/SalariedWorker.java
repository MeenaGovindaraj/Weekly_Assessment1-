package com.question4;

public class SalariedWorker extends Workers {


	public SalariedWorker()
	{
		
	}
	public SalariedWorker(int id,String name, String type, int workedhrs, int salary) {
		super(id,name,type,workedhrs,salary);
		this.id=id;
		this.name = name;
		
		this.type = type;
		this.workedhrs = workedhrs;
		this.salary = salary;
	}

	@Override
	public int pay() {
		int p = workedhrs * 200;
		return p;
	}
	@Override
	public String toString() {
		return "\nSalariedWorker [id=" + id + ", name=" + name + ", salary=" + pay()+ ", type=" + type + ", workedhrs="
				+ workedhrs + "]";
	}

}
