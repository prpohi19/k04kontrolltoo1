import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.*;
  public class kt2 {
   static int libisevKesk(Integer[] array){
     int l6pplength = 0;
     int esimenelibe = array[0] + array[1] + array[2];
     int esimenelibel6pp = (esimenelibe / 3);
     l6pplength = array.length;
     return esimenelibel6pp;
   }
   static int libisevKesk2(Integer[] array){
     int l6pplength = 0;
     int teinelibe = array[2] + array[3] + array[4];
     int teinelibel6pp = (teinelibe / 3);
     return teinelibel6pp;
   }
   static int libisevKesk3(Integer[] array){
     int l6pplength = 0;
     int kolmaslibe = array[3] + array[4] + array[5];
     int kolmaslibel6pp = (kolmaslibe / 3);
     return kolmaslibel6pp;
   }
      public static void main(String[] arg) throws Exception{
        int length = 0;
        int arvuke=0;
        Scanner reader = new Scanner(System.in);
        Integer[] array = new Integer[6];
          for(int i = 0;i < 6; i++){
            System.out.println("Sisesta arv; ");
            arvuke = reader.nextInt();
            array[i] = arvuke;
          }
          System.out.println("Esimene libisev keskmine : "+libisevKesk(array));
          System.out.println("Teine libisev keskmine : "+libisevKesk2(array));
          System.out.println("Kolmas libisev keskmine : "+libisevKesk3(array));
        // System.out.println(Arrays.toString(array)+ " "+l6pplength);
          //System.out.println("Esimene libisev keskmine: "+esimenelibel6pp+", "
           //+ "Teine libisev keskmine: " +teinelibel6pp+", "+
        //   "Kolmas libisev keskmine: "+kolmaslibel6pp+", ");

      }

  }
