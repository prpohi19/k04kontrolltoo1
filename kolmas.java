import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class kolmas {
	
	public static double harmooniline_keskmine(ArrayList<Integer> kiirused) {
		double keskmine = 0; 
		double harmooniline_keskmine = 0;
		for (int k : kiirused) {
			keskmine += (1.0/k);
		}
		harmooniline_keskmine = kiirused.size()/ keskmine;
		return harmooniline_keskmine;
	}
	
	public static void vastus_faili(double i) throws Exception {
		PrintWriter writer = new PrintWriter("vastus.val", "UTF-8");
		writer.println(i);
		writer.close();
	}
	
	public static void main(String[] arg) throws Exception{
		double harmooniline_keskmine = 0;
		ArrayList<Integer> kiirused = new ArrayList<Integer>();
		BufferedReader lugeja = new BufferedReader(
				new InputStreamReader(new URL(
						"http://www.tlu.ee/~urmotr/java/tund5/kiirused3.sis").openStream()));
		String rida=lugeja.readLine();
		while(rida!=null) {
			kiirused.add(Integer.parseInt(rida));
			rida=lugeja.readLine();
		}
		lugeja.close();
		harmooniline_keskmine = harmooniline_keskmine(kiirused);
		vastus_faili(harmooniline_keskmine);
	}
}
