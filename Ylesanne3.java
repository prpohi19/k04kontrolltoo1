import java.util.*;
import java.io.*;

public class Ylesanne3{
  public static double calcGeo(double[] salaryCoef){
    double product = 0;
    double amount = salaryCoef.length;
    double power = 1 / amount;
    for (int i = 0; i < amount; i++){
      if (i == 0){
        product = salaryCoef[i];
      } else {
          product = product * salaryCoef[i];
      }
    }
    return Math.pow(product, power);
  }

  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new FileReader("palgadsis.txt"));
    String info = reader.readLine();
    String[] infoSplit = info.split(" ");
    double baseSalary = Double.parseDouble(infoSplit[0]);
    int amount = Integer.parseInt(infoSplit[1]);
    double[] salaryCoef = new double[amount];
    List<String> calculatedSalaries = new ArrayList<String>();

    for(int i = 0; i < amount; i++){
      salaryCoef[i] = Double.parseDouble(reader.readLine());
    }

    double geo = calcGeo(salaryCoef);
    double geoSalary = baseSalary;

    for(int i = 0; i <= amount; i++){
      if(i != 0){
        double coef = salaryCoef[i-1];
        double salary = Math.round(baseSalary * coef);
        geoSalary = Math.round(geoSalary * geo);
        baseSalary = salary;
        calculatedSalaries.add(String.valueOf(salary) + " | " + String.valueOf(geoSalary));
      } else {
        calculatedSalaries.add("Baas palk: " + baseSalary);
        calculatedSalaries.add("Koef kesk | geom kesk(" + geo +")");
      }
    }

    PrintWriter writer = new PrintWriter(new FileWriter("palgadval.txt"));
    for (int i = 0; i < calculatedSalaries.size(); i++){
      writer.println(calculatedSalaries.get(i));
    }
    writer.close();
    reader.close();
 }
}
