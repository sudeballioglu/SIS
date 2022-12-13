package StudentInformationSystem;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Nathalie","900001","MATH");  //object oluştu,constructor çalıştırıldı.
		Teacher t2 = new Teacher("Amber","900002","PHY");
		Teacher t3 = new Teacher ("Stewart","900003","CHEM");
		
		Course math = new Course("Mathematics","Math101","MATH");
		Course phy = new Course ("Physics", "Phy101", "PHY");
		Course chem = new Course ("Chemistry","Chem101","CHEM" );
	
		
		math.addTeacher(t1);
		phy.addTeacher(t2);
		chem.addTeacher(t3);
		
		Student s1 = new Student ("Mathilda Laurie","48763",4,math,phy,chem);
		s1.addBulkExamNote(50,20,40);
		s1.addVerbalExamNote(100, 100, 100);
		s1.isPass();
		
		Student s2 = new Student ("Susan Natille","56456",4,math,phy,chem);
		s2.addBulkExamNote(100, 50, 40);
		s2.addVerbalExamNote(100, 100, 100);
		s2.isPass();
		
		Student s3 = new Student ("Retha Clarette","57667",4,math,phy,chem);
		s3.addBulkExamNote(50,20,40);
		s3.addVerbalExamNote(100, 100, 100);
		s3.isPass();
	
	}
}
