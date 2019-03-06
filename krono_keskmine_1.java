import java.util.Scanner;

public class krono_keskmine_1{

  public static void main(String[] arg){

    double sum = 0;
    Scanner reader = new Scanner(System.in);
    for (int i = 1; i<4; i++){
      System.out.println("Sisestage " + i +"/3 number."); //Kolme arvu kronoloogilise keskmise arvutamine
      double input = reader.nextDouble();
      if (i == 1 || i == 3){ //Kui on esimene või viimane arv, jagame kahega
        input = input / 2;
      }
      sum += input;
    }
    sum = sum / 2; //Jagame tulemuse kahega
    System.out.println("Kronoloogiline keskmine on: " + sum);
  }
}
