package assignments;
public class Employee extends Person{
	private double Salary;
	private int year;
	private String NationalInsuranceNumber;
	
	public Employee(String Name,double Salary,int year,String NationalInsuranceNumber) {
		super(Name);
		this.Salary=Salary;
		this.year=year;
		this.NationalInsuranceNumber=NationalInsuranceNumber;	
	}
	public double Salary() {
		return Salary;
	}
	public int year() {
		return year;
	}
	public String NationalInsuranceNumber() {
		return NationalInsuranceNumber;
	}
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public void NationalInsuranceNumber(String NationalInsuranceNumber) {
		this.NationalInsuranceNumber=NationalInsuranceNumber;
	}
	
	
	

}
