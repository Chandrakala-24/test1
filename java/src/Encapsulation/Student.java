package Encapsulation;

class Student {
	private String Name;
	private String Department;
	private int Usn;
	
	public String getName() {
		return Name;
	}
		
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public String getDepartment()
	{
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department=Department;
	}
	public int getUsn() {
		return Usn;
	}
	public void setUsn(int Usn) {
		this.Usn=Usn;
	}
}
