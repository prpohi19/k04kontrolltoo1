import java.io.*;
import java.util.*;

public class KaalutudKeskmine{
    public static void main(String[] arg) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("ainepunktid.txt"));
        String hinne1 = reader.readLine();
        String[] m1 = hinne1.split(",");
        String hinne2 = reader.readLine();
        String[] m2 = hinne2.split(",");

        System.out.println("Kahe ainekursuse kaalutud keskmine on " + kaheAineKaalutudKeskmine(m1[2], m2[2]));
        reader.close();
    }

    public static double kaheAineKaalutudKeskmine(String hinne1, String hinne2){
        double kaalutudSumma = 0;
        double kaalutudKeskmine = 0;
        if(hinne1.equals("A")){
            kaalutudSumma += 5;
        } else if(hinne1.equals("B")){
            kaalutudSumma += 4;
        } else if(hinne1.equals("C")){
            kaalutudSumma += 3;
        } else if(hinne1.equals("D")){
            kaalutudSumma += 2;
        } else if(hinne1.equals("E")){
            kaalutudSumma += 1;
        }
        if(hinne2.equals("A")){
            kaalutudSumma += 5;
        } else if(hinne2.equals("B")){
            kaalutudSumma += 4;
        } else if(hinne2.equals("C")){
            kaalutudSumma += 3;
        } else if(hinne2.equals("D")){
            kaalutudSumma += 2;
        } else if(hinne2.equals("E")){
            kaalutudSumma += 1;
        }
        kaalutudKeskmine = kaalutudSumma / 2;
        return kaalutudKeskmine;
    }
    /*public static double aineteKogumiKaalutudKeskmine(){
        double kaalutudSumma = 0;
        double kaalutudKeskmine = 0;
        String rida = reader.readLine();
        String[] m = rida.split(",");
        while(rida!=null) {
            loendur += 1;
            if(m[2].equals("A")){
                kaalutudSumma += 5;
            } else if(m[2].equals("B")){
                kaalutudSumma += 4;
            } else if(m[2].equals("C")){
                kaalutudSumma += 3;
            } else if(m[2].equals("D")){
                kaalutudSumma += 2;
            } else if(m[2].equals("E")){
                kaalutudSumma += 1;
            }
        }
        kaalutudKeskmine = kaalutudSumma / loendur;
        return kaalutudKeskmine;
    }*/
    /*public static double failiKaalutudKeskmine(){
        String rida = reader.readLine();
        int loendur = 0;
        double failiKaalutudSumma = 0;
        double failiKaalutudKeskmine = 0;
        while(rida!=null) {
            loendur += 1;
            String[] m = rida.split(",");
            if(m[2].equals("A")){
                failiKaalutudSumma += 5;
            } else if(m[2].equals("B")){
                failiKaalutudSumma += 4;
            } else if(m[2].equals("C")){
                failiKaalutudSumma += 3;
            } else if(m[2].equals("D")){
                failiKaalutudSumma += 2;
            } else if(m[2].equals("E")){
                failiKaalutudSumma += 1;
            }
        failiKaalutudKeskmine = failiKaalutudSumma / loendur;
        return kaalutudKeskmine;
        }        
    }*/
}