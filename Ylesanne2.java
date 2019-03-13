import java.util.Scanner;

public class Ylesanne2{
  public static double calcSqrt(int[] params){
    double product = 0;
    double answer = 0;
    double paramsLen = params.length;
    double power = 1 / paramsLen;
    for (int i = 0; i < paramsLen; i++){
      if (i == 0){
        product = params[i];
      } else {
          product = product * params[i];
      }
    }
    answer = Math.pow(product, power);
    return answer;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int amount = 0;
    System.out.println("Geomeetriline keskmine, ylesanne 2");
    System.out.println("---");
    System.out.print("Mitu arvu soovite massiivi sisestada: ");
    amount = input.nextInt();
    int[] params = new int[amount];
    for (int i = 0; i < amount; i++){
      System.out.print("Sisestage " + (i + 1) +". arv: ");
      params[i] = input.nextInt();
    }
    System.out.println("Parameetrite korrutise " + amount + ". juur on " + calcSqrt(params));
  }
}
