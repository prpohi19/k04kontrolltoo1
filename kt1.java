import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class kt1 {
	
	//võtame kasutajalt inputi
	public static double[] getUserInput() {	
	//loon kasutaja inputi võtmiseks scanneri	
    Scanner sc = new Scanner(System.in);	
	//defineerin array double tüübis
    List<Double> inputList = new ArrayList<Double>();
	//Küsime mitu inputi kasutaja soovib sisestada
	System.out.println("Mitme lõigu keskmised ajad te soovite lisada? ");
	double mitu = sc.nextDouble();
    for (int i = 0; i < mitu; i++) {
        System.out.println("sisestage "+mitu+" kilomeetri pikkuse lõigu läbimise kiirust(km/h) ");
        double userInput = sc.nextDouble(); // salvestab kasutajalt saadud double value ajutisse muutujasse
        inputList.add(userInput); // lisab ajutise muutuja arraysse
    }
	//lõpetab kasutajalt inputi küsimise
    sc.close();
	//convertime List<double> double[] arrayks, et seda lugeda saaks
    double[] arr = new double[inputList.size()];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = inputList.get(i);
    }
	//väljastame array
    return arr; 
	}
	//harmoonilise keskmise arvutamine
	public static double keskmine(double[] data){
		double sum = 0.0;
		int n = data.length;
		for (int i = 0; i < n; i++){
			sum += 1.0 / data[i];
		}
		return n / sum;
	}
	
	//kutsume välja 2 loodud funktsiooni ja väljastame vastuse
	public static void main(String[] arg) throws Exception{
		System.out.println("nende kiiruste harmooniline keskmine kiirus on " +keskmine(getUserInput())+ " km/h");
	}
}
