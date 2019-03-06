// Harmooniline keskmine - Madis Otenurm
import java.net.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        double speed1 = 50;
        double speed2 = 60;
        double speeds[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        String url = "https://pastebin.com/raw/eTTmkN8w";
        String filepath = "kiirused.txt";

        System.out.println("50 ja 60 harmooniline keskmine on " + findHarmonicMeanFromTwo(speed1, speed2));
        System.out.println("10-100 harmooniline keskmine on " + findHarmonicMeanFromAll(speeds));
        findHarmonicMeanFromUrl(url, filepath);
        System.out.println("20, 40, 60, 80, 100 harmooniline keskmine on prinditud faili " + filepath);
    }

    // Sisendiks kahe km-pikkuse lõigu läbimise kiirused (km/h)
    // Väljundiks nende kahe km läbimise keskmine kiirus
    public static double findHarmonicMeanFromTwo (double avg1, double avg2){
        double mean = 2 / (1 / avg1 + 1 / avg2); // Liida kiirused ja jaga kiiruste arvuga
        return mean;
    }

    // Sisendiks km-pikkuste lõikude keskmised kiirused kogumina (km/h)
    // Väljasta kogu tee läbimise keskmine kiirus
    public static double findHarmonicMeanFromAll (double[] numbers){
        double mean = 0;

        for (double value : numbers){ // Liida kiirused kokku
            mean += 1 / value;
        }

        mean = numbers.length / mean; // Leia harmooniline keskmine

        return mean;
    }

    // Sisendiks km-pikkuste lõikude keskmised kiirused URLilt
    // Väljundiks kogu teekonna läbimise keskmine kiirus faili
    public static void findHarmonicMeanFromUrl (String url, String filepath) throws IOException {
        URL inputUrl = new URL(url); // URLi definitsioon

        // Massiiv, kuhu arvud lugeda - https://stackoverflow.com/a/17481237
        List<Double> numbers = new ArrayList<>(Arrays.asList());

        // Lugeja
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputUrl.openStream()));

        // Loe veebilehelt andmed

        String inputLine;
        while ((inputLine = reader.readLine()) != null) // kuni real on teksti
            numbers.add(Double.parseDouble(inputLine));

        reader.close();

        // Arvuta harmooniline keskmine
        double mean = 0;

        for (double value : numbers){ // Liida kiirused kokku
            mean += 1 / value;
        }

        mean = numbers.size() / mean; // Leia harmooniline keskmine

        // Kirjuta keskmine faili
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
        writer.write(String.valueOf(mean));
        writer.close();
    }
}
