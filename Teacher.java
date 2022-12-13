package StudentInformationSystem;

public class Teacher {

	String name;
	String phoneNumber;
	String branch;
	int teacherId;
	
	public Teacher(String name,String mpno,String branch){ //constructor
		this.name=name;
		this.phoneNumber=mpno;
		this.branch=branch;
		this.teacherId=teacherId;
				
	}
	
	public void print() {
		System.out.println(this.name + this.branch + this.phoneNumber + this.teacherId);
	}
	
}
