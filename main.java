import java.io.*;
import java.util.*;

public class main {

    public static void main(String [ ] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter printer = new PrintWriter(new FileWriter("output.txt"));
        List<String> courses = new ArrayList<String>();
        List<Double> EAP = new ArrayList<Double>();
        List<String> marks = new ArrayList<String>();

        int N = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        for(int i = 0; i < N; i++){
            courses.add(line.split(" ")[i]);
        }
        line = reader.readLine();
        for(int i = 0; i < N; i++){
            EAP.add(Double.parseDouble(line.split(" ")[i]));
        }
        line = reader.readLine();
        for(int i = 0; i < N; i++){
            marks.add(line.split(" ")[i]);
        }
        double calc1 = 0;
        double calc2 = 0;
        double calc3 = 0;
        double mark = 0;

        for(int i = 0; i < N; i++){
            if(marks.get(i).equals("A")){
                mark = 5.0;
            }else if(marks.get(i).equals("B")){
                mark = 4.0;
            }else if(marks.get(i).equals("C")){
                mark = 3.0;
            }else if(marks.get(i).equals("D")){
                mark = 2.0;
            }else if(marks.get(i).equals("E")){
                mark = 1.0;
            }else if(marks.get(i).equals("F")){
                mark = 0.0;
            }

            calc1 += EAP.get(i)*mark;
            calc2 += EAP.get(i);
        }

        //Keskmise arvutamine
        calc3=calc1/calc2;

        System.out.println(String.format("%.3f", calc3));
        printer.println("Kaalutud keskmine on: " + String.format("%.3f", calc3));

        reader.close();
        printer.close();
    }
}