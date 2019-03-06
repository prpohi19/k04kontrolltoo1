import java.util.Scanner;

public class Ylesanne1{
  public static double calcSqrt(int firstParam, int secondParam){
    double answer = Math.sqrt(firstParam * secondParam);
    return answer;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Geomeetriline keskmine, ylesanne 1");
    System.out.println("---");
    System.out.print("Sisesta esimese parameetri v22rtus: ");
    int firstParam = input.nextInt();
    System.out.print("Sisesta teise parameetri v22rtus: ");
    int secondParam = input.nextInt();
    System.out.println("---");
    System.out.println("M6lema parameetri korrutise ruutjuur on " + calcSqrt(firstParam, secondParam));
  }
}
