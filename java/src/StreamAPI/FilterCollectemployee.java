package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FilterCollectemployee {
		public static void main(String args[])
		{
			List<Employee> al=new ArrayList<Employee>();
			al.add(new Employee(1,"Ram",10000));
			al.add(new Employee(2,"Bob",50000));
			al.add(new Employee(3,"John",30000));
			al.add(new Employee(4,"Riya",15000));
			List<Employee> li=al.stream().filter(x->x.salary>10000).collect(Collectors.toList());
			for(Employee employee:li) 
			System.out.println(employee.Name);
		}


	}


