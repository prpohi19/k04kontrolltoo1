import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Kontrolltoo_Kristjan_P6ldmets{
  public static void main(String[] arg) throws Exception{
    BufferedReader sisendfail1=new BufferedReader(
      new InputStreamReader(new URL("http://greeny.cs.tlu.ee/~krispol/2019/prpohi/Kontrolltoo/Kontrolltoo.txt").openStream())
    );
    String rida=sisendfail1.readLine();

    System.out.println(" ");
    System.out.println("Kristjan Põldmets: Kronoloogiline keskmine");
    System.out.println("------------------------------------------");
    System.out.println("Töö esimene osa: Kolme arvu keskmine.");

    double a = 1.7, b = 2.8, c = 3.1;

    System.out.println("Sisestatud arvud on: "+a+", "+b+", "+c);
    System.out.println("Kronoloogiline keskmine on: "+ esimeneVastus(a, b, c));

    System.out.println("------------------------------------------");
    System.out.println("Töö teine osa: Kogumina ette antud arvude kronoloogiline keskmine.");
    System.out.println("Sisendfaili väärtused on: "+rida);


    String [] arvuKogum = rida.split(",");

    int kogumiSuurus = arvuKogum.length;
    double summa = 0;
    double kronKeskmine = 0;
    int jagatis = kogumiSuurus-1;

    for(int i=0; i < kogumiSuurus; i++) {
      if (i == 0) {
        summa += Integer.parseInt(arvuKogum[i])/2.0;
      } else if (i == kogumiSuurus-1) {
        summa += Integer.parseInt(arvuKogum[i])/2.0;
      } else {
        summa += Integer.parseInt(arvuKogum[i]);
      }
    }

    kronKeskmine = summa / jagatis;
    System.out.println("Andmestiku pikkus on: "+kogumiSuurus);
    System.out.println("Kronoloogiline keskmine on: "+kronKeskmine);

    System.out.println("------------------------------------------");
    System.out.println("Töö kolmas osa: Kuupäevade keskmine temperatuur.");
    System.out.println("Kuskil alternatiiv-reaalsuses olen jõudnud siin lahendada ülesande. See pole aga see reaalsus.");
  }

  public static double esimeneVastus(double a, double b, double c) {
    return ((a/2) + b + (c/2))/2;
  }

}
