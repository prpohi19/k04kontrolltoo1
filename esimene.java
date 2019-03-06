import java.io.*;
import java.util.ArrayList;

public class esimene {
	
	public static double harmooniline_keskmine(ArrayList<Integer> kiirused) {
		double keskmine = 0; 
		double harmooniline_keskmine = 0;
		for (int k : kiirused) {
			keskmine += (1.0/k);
		}
		harmooniline_keskmine = kiirused.size()/ keskmine;
		return harmooniline_keskmine;
	}
	
	public static void main(String[] arg) throws Exception{
		double harmooniline_keskmine = 0;
		ArrayList<Integer> kiirused = new ArrayList<Integer>();
		BufferedReader lugeja=new BufferedReader(new FileReader("C:\\Users\\Student Admin\\eclipse-workspace\\Harmooniline keskmine\\src\\kiirused1.sis"));
		String rida=lugeja.readLine();
		while(rida!=null) {
			kiirused.add(Integer.parseInt(rida));
			rida=lugeja.readLine();
		}
		lugeja.close();
		harmooniline_keskmine = harmooniline_keskmine(kiirused);
		System.out.println(harmooniline_keskmine);
	}
}
