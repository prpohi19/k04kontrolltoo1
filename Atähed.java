/*A-tähed tekstis

* Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui väikeseid)
* Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna tähtede üldarvu
* Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus ridadeks tähtede
 arv sõnas ning veergudeks a-tähtede arv. Lahtris näidatakse, mitu vastavat sõna oli tekstis.*/

import java.io.*;
import java.net.*;
import java.util.*;

public class Atähed{
  public static void main(String[] args) throws Exception{
    BufferedReader lugeja = new BufferedReader(new FileReader("t2hed.txt"));
    String rida = lugeja.readLine();
    String[] hoidla;
    List<String> sonad = new ArrayList<String>();
    int mitu = 0;
    int t2hed = 0;
    while(rida!=null){
      hoidla = rida.replaceAll("\\.", "").split(" ");
      rida = lugeja.readLine();
      for(String sona: hoidla){
        if(sona.length() > 0){
          sonad.add(sona);
          t2hed += sona.length();
          mitu++;
        }
      }
    }
    System.out.print("\nSõnu: "+ mitu + "\n");
    System.out.print("Tähti: "+ t2hed + "\n\n");
    double aLoendur = 0;
    for (String sona: sonad){
      int sonas = 0;
      for (int i = 0; i < sona.length(); i++){
          String t2ht = Character.toString(sona.charAt(i));
          System.out.print(t2ht);
          if (t2ht.matches("a|A")){
              aLoendur++;
              sonas++;
          }
      }
      System.out.print("\nSõnas: "+ sonas + "\n");
    }
    System.out.print("\nKokku: "+ aLoendur);
    double keskmine = aLoendur / mitu;
    System.out.print("\nSõnades keskmiselt: " + String.format("%.2f", keskmine));
    double yldarvust = t2hed / aLoendur;
    System.out.print("\nSuhtarvuna tähtede üldarvu: " + String.format("%.2f", yldarvust)+ "\n\n");


  }
}
