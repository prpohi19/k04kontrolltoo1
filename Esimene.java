import java.util.Scanner;

public class Esimene{
  public static double ruutjuur(int esimPara, int teinePara){
    double answer = Math.sqrt(esimPara * teinePara);
    return answer;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Sisesta esimese parameetri v22rtus: ");
    int esimPara = input.nextInt();
    System.out.print("Sisesta teise parameetri v22rtus: ");
    int teinePara = input.nextInt();
    System.out.println("---");
    System.out.println("M6lema parameetri korrutise ruutjuur on " + ruutjuur(esimPara, teinePara));
  }
}
