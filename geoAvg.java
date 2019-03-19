import java.io.*;
import java.util.Scanner;
public class geoAvg{
	/*esimene*/
	public static double sqrtMultip(double a, double b){
		return Math.sqrt(a*b);
	}
		public static void main(String[] array) throws Exception{
			double a = 10;
			double b = 20;
			System.out.println("arvude " + a + " ja " + b + " ruutkorrutis on: " + sqrtMultip(a, b));
			/*teine*/
			double korrutis = 1;
			double tulemus = 0;
			double arvudeKogus = 5;
			Integer[] num = {1,2,3,4,5};
			for(Integer arv: num){
				korrutis = korrutis * arv;
			}
		
			if(arvudeKogus>0){
				System.out.println("Korrutis: " + korrutis);
				tulemus = Math.pow(korrutis, (1/arvudeKogus));
				System.out.println("Kogusega juuritud on: "+ tulemus);
		
			}else{
				System.out.println("Arvuid ei leia - voi arvude kogus on null");
			}
		 
		 
			FileReader in = null;
			FileWriter out = null;
			try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");
			
			int rida;
			while ((rida = in.read()) != -1) {
				out.write(rida);
			}
			}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
      }
	}
  }
}
