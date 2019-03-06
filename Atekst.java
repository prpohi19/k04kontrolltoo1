import java.io.*;
import java.util.*;

public class Atekst{
  public static void main(String[] arg) throws Exception{
     BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
     int wordCount = Integer.parseInt(reader.readLine());
     double divider = wordCount * 1.0;
     String line;
     int aCounter = 0;
     int ACounter = 0;
     int aMultiplier = 0;
     double letterCounter = 0.0;
     int aCounter2 = 0;
     int aCounter3 = 0;
     int aCounter4 = 0;
     int aCounter5 = 0;
     int aCounter6 = 0;

     int aCounter2n2 = 0;
     int aCounter3n2 = 0;
     int aCounter4n2 = 0;
     int aCounter5n2 = 0;
     int aCounter6n2 = 0;

     List<String> letter1 = new ArrayList<String>();
     List<String> letter2 = new ArrayList<String>();
     List<String> letter3 = new ArrayList<String>();
     List<String> letter4 = new ArrayList<String>();
     List<String> letter5 = new ArrayList<String>();


     //System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n","#", "1", "2", "3", "4", "5");

     for(int i=0; i<wordCount; i++){
       line = reader.readLine();
       for(int j=0; j<line.length();j++){
         letterCounter++;
         if(line.charAt(j) == 'a'){
           aCounter++;
           aMultiplier++;
         }
         if(line.charAt(j) == 'A'){
           ACounter++;
         }
       }

       //System.out.println("Sõnas " + line + " on " + aMultiplier + " a tähte");

       if(aMultiplier == 1){
         //System.out.println("1");
         aMultiplier = 0;
         letter1.add(line);
       }
       if(aMultiplier == 2){
         //System.out.println("2");
         aMultiplier = 0;
         letter2.add(line);

       }
       if(aMultiplier == 3){
         //System.out.println("3");
         aMultiplier = 0;
         letter3.add(line);

       }
       if(aMultiplier == 4){
         //System.out.println("4");
         aMultiplier = 0;
         letter4.add(line);
       }

       if(aMultiplier == 5){
         //System.out.println("5");
         aMultiplier = 0;
         letter5.add(line);
       }



         for(int b=0;b<line.length();b++){
           if(line.length() == 2){
             if(line.charAt(b) == 'a'){
               aCounter2++;
               //System.out.println("2");
             }
           }
         }
         if(aCounter2 == 1){
           aCounter2n2++;
         }
         if(aCounter2 == 2){
           aCounter3n2++;
         }
         if(aCounter2 == 3){
           aCounter4n2++;
         }
         if(aCounter2 == 4){
           aCounter5n2++;
         }
         if(aCounter2 == 5){
           aCounter6n2++;
         }
         aCounter2 = 0;

     }
     System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n",2, aCounter2n2, aCounter3n2, aCounter4n2, aCounter5n2, aCounter6n2);
     System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n",3, aCounter2n2, aCounter3n2, aCounter4n2, aCounter5n2, aCounter6n2);
     System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n",4, aCounter2n2, aCounter3n2, aCounter4n2, aCounter5n2, aCounter6n2);
     System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n",5, aCounter2n2, aCounter3n2, aCounter4n2, aCounter5n2, aCounter6n2);
     System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n",6, aCounter2n2, aCounter3n2, aCounter4n2, aCounter5n2, aCounter6n2);




     String[] letter1A = new String[ letter1.size() ];
     letter1.toArray(letter1A);
     String[] letter2A = new String[ letter2.size() ];
     letter2.toArray(letter2A);
     String[] letter3A = new String[ letter3.size() ];
     letter3.toArray(letter3A);
     String[] letter4A = new String[ letter4.size() ];
     letter4.toArray(letter4A);
     String[] letter5A = new String[ letter5.size() ];
     letter5.toArray(letter5A);

     double average = (ACounter+aCounter) / divider;
     double averagea = (aCounter+ACounter)  / letterCounter;

     System.out.println("\n");
     System.out.println("Tähti oli kokku: " +letterCounter + "\n");
     System.out.println("a tähed moodustasid nendest "+ averagea +"%");
     System.out.println("Suuri A tähti oli: "+ ACounter +"\nväikeseid a tähti oli: " + aCounter);
     System.out.println("Keskmiselt oli sõnades "+ average + " a tähte");
     System.out.println("\n");
     System.out.println("Ühe a tähega sõnu oli: " +letter1.size());
     System.out.println("Kahe a tähega sõnu oli: " +letter2.size());
     System.out.println("Kolme a tähega sõnu oli: " +letter3.size());
     System.out.println("Nelja a tähega sõnu oli: " +letter4.size());
     System.out.println("Viie a tähega sõnu oli: " +letter5.size());
     System.out.println("\n");
     System.out.format("%-4s%-4s%-4s%-4s%-4s%-4s\n","#", "1", "2", "3", "4", "5");






















  }
}
