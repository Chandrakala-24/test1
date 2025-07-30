package Exception;
import java.io.File;
import java.util.Date;
public class Exercise1 {
	public static void main(String args[]) {
		File file=new File("C:\\Program Files");
		String[] filelist=file.list();
		for(String name:filelist) {
			System.out.println(name);
		}
		
	}

}
