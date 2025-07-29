package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Student s=new Student();
		 s.setName("N T Chandrakala");
		 s.setDepartment("CSE-AI");
		 s.setUsn(34);
		 
		 String Name=s.getName();
		 String Department=s.getDepartment();
		 int Usn=s.getUsn();
		 
		 System.out.println("Name:"+Name);
		 System.out.println("Department:"+Department);
		 System.out.println("Usn:"+Usn);
	}

}
