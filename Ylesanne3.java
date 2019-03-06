import java.util.*;
import java.io.*;

public class Ylesanne3{
  public static double calcGeo(double[] geo){
    double product = 0;
    double answer = 0;
    double amount = geo.length;
    double power = 1 / amount;
    for (int i = 0; i < amount; i++){
      if (i == 0){
        product = geo[i];
      } else {
          product = product * geo[i];
      }
    }
    answer = Math.pow(product, power);
    return answer;
  }

  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new FileReader("palgadsis2.txt"));
    String info = reader.readLine();
    String[] infoSplit = info.split(" ");
    double baseSalary = Double.parseDouble(infoSplit[0]);
    int amount = Integer.parseInt(infoSplit[1]);
    String[] salaryCoef = new String[amount];
    double[] geo = new double[amount];
    List<String> calculatedSalaries = new ArrayList<String>();

    for(int i = 0; i < amount; i++){
      salaryCoef[i] = reader.readLine();
    }
    for(int i = 0; i <= amount; i++){
      if(i != 0){
        double coef = Double.parseDouble(salaryCoef[i-1]);
        double check = Math.round(baseSalary * coef);
        geo[i] = baseSalary * check;
        calcGeo(geo[i], i);
        baseSalary = check;
        calculatedSalaries.add(String.valueOf(check) + " | " + String.valueOf(geoCheck));
      } else {
        calculatedSalaries.add("Baas palk: " + String.valueOf(baseSalary));
        geo[i] = baseSalary;
      }
    }
    PrintWriter writer = new PrintWriter(new FileWriter("palgadval2.txt"));
    writer.println("Koef kesk | geom kesk");
    for (int i = 0; i < calculatedSalaries.size(); i++){
      writer.println(calculatedSalaries.get(i));
    }
    writer.close();
    reader.close();
 }
}
