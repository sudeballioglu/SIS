package StudentInformationSystem;

public class Course {
	
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int note;
	int verbalNote;
	
	
	public Course(String name,String code,String prefix) {
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
		int verbalNote=0;
		
	}
	
	public void addTeacher(Teacher t) {
		if(this.prefix.equals(t.branch)) {
			this.courseTeacher=t;
			System.out.println("Teacher appointed.");
		}else {
			System.out.println(t + " does not give this lesson.");
		}
		
	}
	
	public void printTeacher() {
		if(courseTeacher!=null) {
			System.out.println("The academician of " + this.name + " course is " + courseTeacher.name);
			
		}else {
			System.out.println(this.name + "class has no academicians.");
		}
		
	}

}