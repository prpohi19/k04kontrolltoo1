import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Kt
{
  public static void main(String[] arg) throws Exception
  {
	// ÜL 1
	System.out.println("");
	System.out.println("Ülesanne 1");
	System.out.println(GetAverage(2, 3, 4));
	System.out.println(GetAverage(3, 3, 4));
	System.out.println(GetAverage(4, 4, 4));
	System.out.println(GetAverage(5, 4, 6));
	
	// ÜL 2
	System.out.println("");
	System.out.println("Ülesanne 2");
	double[] inputData = {2, 3, 4, 5, 3};
	double[] output = GetDriftingAverage(inputData, 3);
	
	System.out.println("Keskmised: ");
	for(int i = 0; i < output.length; i++) {
		System.out.print(output[i]+",");
	}
	System.out.println(" ");
	
	// ÜL 3
	System.out.println("");
	System.out.println("Ülesanne 3");
	double[] inputFromFile = GetNumbersFromFile("arvud.txt");
	Double lastNr = inputFromFile[inputFromFile.length-1];
	int howManySum = lastNr.intValue();
	System.out.println("Summeeritakse kokku: "+howManySum);
	WriteToFile("vastused.txt", GetDriftingAverage(inputFromFile, howManySum));
  }
  
  // ÜL 1
  public static float GetAverage(float nr1, float nr2, float nr3) {
	System.out.print("Arvude "+nr1+", "+nr2+" ja "+nr3+" keskmine on: ");
	return ((nr1+nr2+nr3) / 3);
  }
  
  // ÜL 2
  public static double[] GetDriftingAverage(double[] inputData, int howManySum) {
	List<Double> result = new ArrayList<>();
	
	
	for(int i = 0; i < inputData.length-howManySum; i++) {
		double average = inputData[i];
		
		for(int x = i+1; x < i+howManySum; x++) {
			average += inputData[x];
		}
		average = average / howManySum;
		result.add(average);
	}
	
	double[] dvals = new double[result.size()];
	for (int i = 0; i < dvals.length; i++) {
		dvals[i] = result.get(i);
	}
	return dvals;
  }
  
  // ÜL 3
  public static double[] GetNumbersFromFile(String filename) throws Exception {
	System.out.println("Faili <"+filename+"> töödeldakse");
	BufferedReader reader = new BufferedReader(new FileReader(filename));
	List<Double> numbers = new ArrayList<>();
	String row = reader.readLine();
	
	while(row != null) {
		double d;
		try { d = Double.parseDouble(row); }
		catch (NumberFormatException e) { d = -1993.19; }
		if(d != -1993.19) { numbers.add(d); }
		row = reader.readLine();
	}
	
	double[] dvals = new double[numbers.size()];
	for (int i = 0; i < dvals.length; i++) { dvals[i] = numbers.get(i); }
	return dvals;	
  }
  
  public static void WriteToFile(String filename, double[] data) throws Exception {
	PrintWriter writer = new PrintWriter(new FileWriter(filename));
	for(int i = 0; i < data.length; i++) {
		writer.println(data[i]);
		System.out.println("Faili kirjutati: "+data[i]);
	}
	writer.close();
  }
}
