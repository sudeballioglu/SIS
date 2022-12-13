package StudentInformationSystem;

public class Student {
	
	Course math;
	Course phy;
	Course chem;
	
	String name;
	String stuNo;
	int classes;
	double average;
	boolean isPass;
	
	
	public Student(String name,String stuNo,int classes, Course math, Course phy, Course chem) {
		this.name=name;
		this.classes=classes;
		this.stuNo=stuNo;
		this.math=math;
		this.phy=phy;
		this.chem=chem;
		
		
		this.isPass=false;

	}
	
	public void addBulkExamNote(int math, int phy, int chem) {
		
		if(math>=0 && math<=100) {
			this.math.note=math;
		}

		
		
		if(phy>=0 && phy<=100) {
			this.phy.note=phy;
		}
		
		
		
		if(chem>=0 && chem<=100) {
			this.chem.note=chem;
		}
		
		
		
	}
	
	public void addVerbalExamNote(int math,int phy, int chem) {
		if(math>=0 && math<=100) {
			this.math.verbalNote=math;
		}
		
		if(phy>=0 && phy<=100) {
			this.phy.verbalNote=phy;
		}
		
		if(chem>=0 && chem<=100) {
			this.chem.verbalNote=chem;
		}
		
	}
	
	public void isPass() {
		if(this.math.note==0 || this.chem.note==0 ||this.phy.note==0 ) {
			System.out.println("Notes did not entered.");
		}else {
			this.isPass=isCheckPass();
			printNote();
			System.out.println("Average: " + this.average);
		}
		
		if(this.isPass) {
			System.out.println("Pass the class.");
		}else {
			System.out.println("Try again!");
		}
		
	}
	
	public void calcAverage() {
		
		this.average=((this.math.verbalNote*0.20)+(this.math.note*0.80)+(this.phy.verbalNote*0.20)+(this.phy.note*0.80)+(this.chem.verbalNote*0.20)+(this.chem.note*0.80))/3;;
		
	}
	
	public boolean isCheckPass() {
		calcAverage();
		return this.average>55;
		
	}
	
	
	public void printNote() {
		System.out.println("=========================");
		System.out.println("Student: " + this.name);
		System.out.println("Math note: " + this.math.note);
		System.out.println("Math verbal note: " + this.math.verbalNote);
		System.out.println("Physics note: " + this.phy.note);
		System.out.println("Physics verbal note: " + this.phy.verbalNote);
		System.out.println("Chemistry note: " + this.chem.note);
		System.out.println("Chemistry verbal note: " + this.chem.verbalNote);

	}

}
