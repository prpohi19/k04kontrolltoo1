import java.util.Scanner;

public class krono_keskmine_2{

	public static void main(String[] arg){

		double sum = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Mitu numbrit soovite sisestada?");
		int n = reader.nextInt();
		for (int i = 1; i <= n; i++){
			System.out.print(i + ". arv: ");
			double input = reader.nextDouble();
			if (i == 1 || i == n){
				input = input / 2;
			}
			sum += input;
		}
		sum = Math.round((sum / (n-1))*100.0)/100.0;
		System.out.println("Kronoloogiline keskmine on: " + sum);
	}
}
