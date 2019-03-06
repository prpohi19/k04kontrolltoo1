import java.io.*;
import java.util.*;

public class krono_keskmine_3{

	public static void main(String[] arg) throws Exception{
    BufferedReader reader = new BufferedReader(new FileReader("krono_kesk_3_sis.txt"));
		List<String> date = new ArrayList<String>();
		List<Double> temp = new ArrayList<Double>();

		String line = reader.readLine();
		while(line!=null){
			String[] m = line.split(" ");
			date.add(m[0]);
			temp.add(Double.parseDouble(m[1])/2 + Double.parseDouble(m[2]) + Double.parseDouble(m[3]) + Double.parseDouble(m[4]) + Double.parseDouble(m[5])/2);
			line = reader.readLine();
		}

		PrintWriter writer = new PrintWriter(new FileWriter("krono_kesk_3_val.txt"));
		for (int i = 0; i <= date.size()-1; i++){
			writer.println(date.get(i) + " " + Math.round((temp.get(i)/4)*100.0)/100.0);
		}
		writer.close();
  }
}
