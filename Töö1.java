//Kert Liinat
import java.io.*;
import java.util.*;

public class Töö1{

public static void main(String[] args) throws Exception{
  BufferedReader lugeja = new BufferedReader(new FileReader("aTähed.txt"));
  List<String> sõnad = new ArrayList<String>();
  String rida = lugeja.readLine();
  double arv = 0;
  char täht = 'a';
  char suurTäht = 'A';

  double sõnadeArv = 0;
  double tähtedeArv = 0;



  while(rida != null){
      sõnad.add(rida);
      rida = lugeja.readLine();
      sõnadeArv++;
  }

  for(int i=0; i<sõnad.size(); i++){
    //System.out.println("Üks");
    String str = sõnad.get(i);
    //tähtede lugemise koht
    int järjekorranumber = i+1;
    int arvIgasSõnas = 0;

    for(int j=0; j < str.length(); j++)
    {
      tähtedeArv++;
      if (str.charAt(j) == täht || str.charAt(j) == suurTäht) {
        arv++;
        arvIgasSõnas++;
      }
    }
    System.out.println("Sõna number "+järjekorranumber +" ning selle a-tähtede arv: "+ arvIgasSõnas);
    //arv++;
  }
  double keskmiselt = arv/sõnadeArv;
  System.out.println("Sõnade arv: "+sõnadeArv);
  System.out.println("A-tähtede arv: "+arv);
  System.out.println("A-tähtede keskmine arv sõnas: "+keskmiselt);
  System.out.println("Tähtede üldarv: "+tähtedeArv);

}
}
