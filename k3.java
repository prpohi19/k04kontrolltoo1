import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.*;
  public class k3 {
      public static void main(String[] arg) throws Exception{
        int length = 0;
        int arvuke=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Sisesta mitu järjestikust arvu libiseva keskmise arvutamisel kasutatakse: ");
        int mitu = reader.nextInt();

        Scanner lugeja = new Scanner(new File("sisend.txt"));
        int [] array2 = new int[10];
        int iii = 0;
        while(lugeja.hasNextInt()){
          array2[iii++] = lugeja.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        

        PrintWriter writer = new PrintWriter(new FileWriter("val.txt"));


        writer.println("midagi");
        writer.close();
      }

  }
